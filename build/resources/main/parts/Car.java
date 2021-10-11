//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.11 at 10:10:35 PM CEST 
//


package parts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Assemblies">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Assembly" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Parts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Part" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assembliesOrParts"
})
@XmlRootElement(name = "car")
public class Car {

    @XmlElements({
        @XmlElement(name = "Assemblies", type = Car.Assemblies.class),
        @XmlElement(name = "Parts", type = Car.Parts.class)
    })
    protected List<Object> assembliesOrParts;

    /**
     * Gets the value of the assembliesOrParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assembliesOrParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssembliesOrParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Car.Assemblies }
     * {@link Car.Parts }
     * 
     * 
     */
    public List<Object> getAssembliesOrParts() {
        if (assembliesOrParts == null) {
            assembliesOrParts = new ArrayList<Object>();
        }
        return this.assembliesOrParts;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Assembly" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assembly"
    })
    public static class Assemblies {

        @XmlElement(name = "Assembly")
        protected List<Car.Assemblies.Assembly> assembly;

        /**
         * Gets the value of the assembly property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assembly property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssembly().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Car.Assemblies.Assembly }
         * 
         * 
         */
        public List<Car.Assemblies.Assembly> getAssembly() {
            if (assembly == null) {
                assembly = new ArrayList<Car.Assemblies.Assembly>();
            }
            return this.assembly;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "assemblyId",
            "name",
            "quantity",
            "parentAssemblyRef",
            "initialPose",
            "initialContainerRef"
        })
        public static class Assembly {

            @XmlElement(name = "AssemblyId")
            protected String assemblyId;
            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Quantity")
            protected String quantity;
            @XmlElement(name = "ParentAssemblyRef")
            protected String parentAssemblyRef;
            @XmlElement(name = "InitialPose")
            protected String initialPose;
            @XmlElement(name = "InitialContainerRef")
            protected String initialContainerRef;

            /**
             * Gets the value of the assemblyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssemblyId() {
                return assemblyId;
            }

            /**
             * Sets the value of the assemblyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssemblyId(String value) {
                this.assemblyId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(String value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the parentAssemblyRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentAssemblyRef() {
                return parentAssemblyRef;
            }

            /**
             * Sets the value of the parentAssemblyRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentAssemblyRef(String value) {
                this.parentAssemblyRef = value;
            }

            /**
             * Gets the value of the initialPose property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInitialPose() {
                return initialPose;
            }

            /**
             * Sets the value of the initialPose property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInitialPose(String value) {
                this.initialPose = value;
            }

            /**
             * Gets the value of the initialContainerRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInitialContainerRef() {
                return initialContainerRef;
            }

            /**
             * Sets the value of the initialContainerRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInitialContainerRef(String value) {
                this.initialContainerRef = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Part" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "part"
    })
    public static class Parts {

        @XmlElement(name = "Part")
        protected List<Car.Parts.Part> part;

        /**
         * Gets the value of the part property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the part property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Car.Parts.Part }
         * 
         * 
         */
        public List<Car.Parts.Part> getPart() {
            if (part == null) {
                part = new ArrayList<Car.Parts.Part>();
            }
            return this.part;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ParentAssemblyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InitialPose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InitialContainerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "partId",
            "name",
            "quantity",
            "parentAssemblyRef",
            "initialPose",
            "initialContainerRef"
        })
        public static class Part {

            @XmlElement(name = "PartId")
            protected String partId;
            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Quantity")
            protected String quantity;
            @XmlElement(name = "ParentAssemblyRef")
            protected String parentAssemblyRef;
            @XmlElement(name = "InitialPose")
            protected String initialPose;
            @XmlElement(name = "InitialContainerRef")
            protected String initialContainerRef;

            /**
             * Gets the value of the partId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartId() {
                return partId;
            }

            /**
             * Sets the value of the partId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartId(String value) {
                this.partId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(String value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the parentAssemblyRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentAssemblyRef() {
                return parentAssemblyRef;
            }

            /**
             * Sets the value of the parentAssemblyRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentAssemblyRef(String value) {
                this.parentAssemblyRef = value;
            }

            /**
             * Gets the value of the initialPose property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInitialPose() {
                return initialPose;
            }

            /**
             * Sets the value of the initialPose property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInitialPose(String value) {
                this.initialPose = value;
            }

            /**
             * Gets the value of the initialContainerRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInitialContainerRef() {
                return initialContainerRef;
            }

            /**
             * Sets the value of the initialContainerRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInitialContainerRef(String value) {
                this.initialContainerRef = value;
            }

        }

    }

}