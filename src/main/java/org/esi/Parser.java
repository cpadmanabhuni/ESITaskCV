package org.esi;



import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.Buffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import instructions.InstructionSeq;
import instructions.InstructionSeq.Instructions;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action.EndItem;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action.Resources;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action.Resources.ItemsToAssemble;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action.Resources.Machine;
import instructions.InstructionSeq.Instructions.Instruction.Actions.Action.Resources.Operators;
import parts.Car;
import parts.Car.Assemblies.Assembly;
import parts.Car.Parts.Part;
import tools.Company.Departments.Department.Tools.Tool;
import workers.Company.Departments.Department.Workers.Worker;

public class Parser {

    static workers.Company workersXMLObj = new workers.Company();
    static Collection<Worker> workerObjsCollection = new HashSet<>();
    static Collection<Tool> toolObjsCollection = new HashSet<>();
    static tools.Company toolsXMLObj = new tools.Company();
    static Car partsXMLObj = new Car();
    static Collection<Assembly> assemblyObjsCollection = new HashSet<>();
    static Collection<Part> partObjsCollection = new HashSet<>();
    static Collection<EndItem> intermediateObjsCollection = new HashSet<>();

    static InstructionSeq instructionSeqObj = new InstructionSeq();

    static ClassLoader classLoader = Parser.class.getClassLoader();

    public static void main(String[] args){

        try {


            constructWorkersXMLObj();
            constructToolsXMLObj();
            constructPartsXMLObj();
            constructInstructionSeqXMLObj();

            // assumptions - no validations needed for the task..
            Instructions instructions = instructionSeqObj.getInstructions().get(0);
            instructions.getInstruction().forEach((instruction) -> executeInstruction(instruction));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void executeInstruction ( Instructions.Instruction instruction) {

        System.out.println("-------------------------------------------------------");
        printInstruction(instruction);
        if (instruction.getActions().size()>0) {
            List<Action> actionList = instruction.getActions().get(0).getAction();
            actionList.forEach((action) -> executeAction(action));
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("");
    }

    public static void executeAction(Action action) {
        System.out.println("Operation:"+action.getCommand());
        // there is only one resources for the time being
        Resources resources = action.getResources().get(0);
        List<Operators> operatorsList = resources.getOperators();
        operatorsList.forEach((operators) -> {
            operators.getOperator().forEach((operator) -> {
                String employeeRefID = operator.getEmployeeRefID();
                System.out.println("Will be Executed By "+getEmployeeName(employeeRefID));
            });
        });

        List<Machine> toolsList = resources.getMachine();
        toolsList.forEach((machine)-> {
            String toolID = machine.getToolRefID();
            System.out.println("Using the tool "+getToolName(toolID));
        });

        List<ItemsToAssemble> itemsToAssembleList = resources.getItemsToAssemble();
        itemsToAssembleList.forEach((items) -> {
            items.getItem().forEach((item) -> {
                String refId = item.getItemRefID();
                System.out.println("Using Part / Assembly "+getPartOrAssemblyName(refId));
            });
        });

        List<EndItem> intermediateItems = action.getEndItem();
        intermediateItems.forEach((endItem) -> {
            System.out.println("=>Output:"+endItem.getName());
            intermediateObjsCollection.add(endItem);
        });


    }

    public static String getEmployeeName(String employeeRefID) {
        Optional<Worker> optionalWorker = workerObjsCollection.stream().filter((worker) -> employeeRefID.equalsIgnoreCase(worker.getEmployeeId())).findAny();
        if (!optionalWorker.isPresent()) {
            return null;
        }
        return optionalWorker.get().getName();
    }

    public static String getToolName(String toolRefID) {
        Optional<Tool> optionalTool = toolObjsCollection.stream().filter((tool) -> toolRefID.equalsIgnoreCase(tool.getToolId())).findAny();
        if (!optionalTool.isPresent()) {
            return null;
        }
        return optionalTool.get().getName();
    }

    public static String getPartOrAssemblyName(String partRefID) {
        if (partRefID.toUpperCase().startsWith("PART")) {
            Optional<Part> optionalPart = partObjsCollection.stream().filter((part) -> partRefID.split(":")[1].equalsIgnoreCase(part.getPartId())).findAny();
            if (!optionalPart.isPresent()) {
                return null;
            }
            return optionalPart.get().getName();
        } else if (partRefID.toUpperCase().startsWith("ASSEMBLY")) {
            Optional<Assembly> optionalAssembly = assemblyObjsCollection.stream().filter((assembly) -> partRefID.split(":")[1].equalsIgnoreCase(assembly.getAssemblyId())).findAny();
            if (!optionalAssembly.isPresent()) {
                return null;
            }
            return optionalAssembly.get().getName();
        } else if (partRefID.toUpperCase().startsWith("ENDITEM")) {
            Optional<EndItem> optionalEndItem = intermediateObjsCollection.stream().filter((endItem) -> partRefID.split(":")[1].equalsIgnoreCase(endItem.getId())).findAny();
            if (!optionalEndItem.isPresent()) {
                return null;
            }
            return optionalEndItem.get().getName();
        }

        return null;

    }

    public static void printInstruction(Instructions.Instruction instruction) {
        System.out.println(instruction.getId() + "-" + instruction.getDescription());
    }


    public static void constructWorkersXMLObj()  {



        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(workers.Company.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            workersXMLObj= (workers.Company) jaxbUnmarshaller.unmarshal(classLoader.getResourceAsStream("workers.xml"));

            workersXMLObj.getDepartments().forEach((departments) -> departments.getDepartment().forEach((department)-> {
                department.getWorkers().forEach((workers) -> workerObjsCollection.addAll(workers.getWorker()));
            }));

        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public static void constructToolsXMLObj() {

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(tools.Company.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            toolsXMLObj= (tools.Company) jaxbUnmarshaller.unmarshal(classLoader.getResourceAsStream("tools.xml"));

            List<Object> metaOrDeps = toolsXMLObj.getMetaDataOrDepartments();
            Collection<tools.Company.Departments> depsCol = new HashSet<>();
            depsCol = metaOrDeps.stream().filter((object) -> object instanceof tools.Company.Departments).map(tools.Company.Departments.class::cast).collect(Collectors.toList());

            depsCol.forEach((departments) -> departments.getDepartment().forEach((department)-> {
                department.getTools().forEach((tool) -> toolObjsCollection.addAll(tool.getTool()));
            }));


        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public static void constructPartsXMLObj() {

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Car.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            partsXMLObj= (Car) jaxbUnmarshaller.unmarshal(classLoader.getResourceAsStream("parts.xml"));


            List<Object> partsOrAssemblies = partsXMLObj.getAssembliesOrParts();
            Collection<Car.Parts> partsCol = partsOrAssemblies.stream().filter((object) -> object instanceof Car.Parts).map(Car.Parts.class::cast).collect(Collectors.toList());

            partsCol.forEach((parts) -> partObjsCollection.addAll(parts.getPart()));

            Collection<Car.Assemblies> assemblyCol = partsOrAssemblies.stream().filter((object) -> object instanceof Car.Assemblies).map(Car.Assemblies.class::cast).collect(Collectors.toList());

            assemblyCol.forEach((assemblies) -> assemblyObjsCollection.addAll(assemblies.getAssembly()));

        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public static void constructInstructionSeqXMLObj() {
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(InstructionSeq.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            instructionSeqObj= (InstructionSeq) jaxbUnmarshaller.unmarshal(classLoader.getResourceAsStream("workinstructions.xml"));


        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

}

