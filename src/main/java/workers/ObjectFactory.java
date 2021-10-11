//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.11 at 10:11:57 PM CEST 
//


package workers;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the workers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: workers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Company.Departments }
     * 
     */
    public Company.Departments createCompanyDepartments() {
        return new Company.Departments();
    }

    /**
     * Create an instance of {@link Company.Departments.Department }
     * 
     */
    public Company.Departments.Department createCompanyDepartmentsDepartment() {
        return new Company.Departments.Department();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers }
     * 
     */
    public Company.Departments.Department.Workers createCompanyDepartmentsDepartmentWorkers() {
        return new Company.Departments.Department.Workers();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers.Worker }
     * 
     */
    public Company.Departments.Department.Workers.Worker createCompanyDepartmentsDepartmentWorkersWorker() {
        return new Company.Departments.Department.Workers.Worker();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers.Worker.Skills }
     * 
     */
    public Company.Departments.Department.Workers.Worker.Skills createCompanyDepartmentsDepartmentWorkersWorkerSkills() {
        return new Company.Departments.Department.Workers.Worker.Skills();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers.Worker.Roles }
     * 
     */
    public Company.Departments.Department.Workers.Worker.Roles createCompanyDepartmentsDepartmentWorkersWorkerRoles() {
        return new Company.Departments.Department.Workers.Worker.Roles();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers.Worker.Skills.Skill }
     * 
     */
    public Company.Departments.Department.Workers.Worker.Skills.Skill createCompanyDepartmentsDepartmentWorkersWorkerSkillsSkill() {
        return new Company.Departments.Department.Workers.Worker.Skills.Skill();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Workers.Worker.Roles.Role }
     * 
     */
    public Company.Departments.Department.Workers.Worker.Roles.Role createCompanyDepartmentsDepartmentWorkersWorkerRolesRole() {
        return new Company.Departments.Department.Workers.Worker.Roles.Role();
    }

}