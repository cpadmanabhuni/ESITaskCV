//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.11 at 10:11:48 PM CEST 
//


package tools;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tools package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tools
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaData }
     * 
     */
    public MetaData createMetaData() {
        return new MetaData();
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
     * Create an instance of {@link Company.Departments.Department.Containers }
     * 
     */
    public Company.Departments.Department.Containers createCompanyDepartmentsDepartmentContainers() {
        return new Company.Departments.Department.Containers();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Tools }
     * 
     */
    public Company.Departments.Department.Tools createCompanyDepartmentsDepartmentTools() {
        return new Company.Departments.Department.Tools();
    }

    /**
     * Create an instance of {@link MetaData.Info }
     * 
     */
    public MetaData.Info createMetaDataInfo() {
        return new MetaData.Info();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Containers.Container }
     * 
     */
    public Company.Departments.Department.Containers.Container createCompanyDepartmentsDepartmentContainersContainer() {
        return new Company.Departments.Department.Containers.Container();
    }

    /**
     * Create an instance of {@link Company.Departments.Department.Tools.Tool }
     * 
     */
    public Company.Departments.Department.Tools.Tool createCompanyDepartmentsDepartmentToolsTool() {
        return new Company.Departments.Department.Tools.Tool();
    }

}
