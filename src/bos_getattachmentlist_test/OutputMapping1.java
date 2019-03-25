
package bos_getattachmentlist_test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputMapping1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputMapping1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getListValues" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cChr_AttachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cAct_Attachment_attachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cAct_Attachment_attachmentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                   &lt;element name="cAct_Attachment_attachmentOrigSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OutputMapping1", propOrder = {
    "getListValues"
})
public class OutputMapping1 {

    @XmlElement(required = true)
    protected List<OutputMapping1 .GetListValues> getListValues;

    /**
     * Gets the value of the getListValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getListValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetListValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputMapping1 .GetListValues }
     * 
     * 
     */
    public List<OutputMapping1 .GetListValues> getGetListValues() {
        if (getListValues == null) {
            getListValues = new ArrayList<OutputMapping1 .GetListValues>();
        }
        return this.getListValues;
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
     *         &lt;element name="cChr_AttachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cAct_Attachment_attachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cAct_Attachment_attachmentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
     *         &lt;element name="cAct_Attachment_attachmentOrigSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cChrAttachmentName",
        "cActAttachmentAttachmentName",
        "cActAttachmentAttachmentData",
        "cActAttachmentAttachmentOrigSize",
        "requestID"
    })
    public static class GetListValues {

        @XmlElement(name = "cChr_AttachmentName")
        protected String cChrAttachmentName;
        @XmlElement(name = "cAct_Attachment_attachmentName")
        protected String cActAttachmentAttachmentName;
        @XmlElement(name = "cAct_Attachment_attachmentData")
        protected byte[] cActAttachmentAttachmentData;
        @XmlElement(name = "cAct_Attachment_attachmentOrigSize")
        protected Integer cActAttachmentAttachmentOrigSize;
        @XmlElement(name = "RequestID")
        protected String requestID;

        /**
         * Gets the value of the cChrAttachmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCChrAttachmentName() {
            return cChrAttachmentName;
        }

        /**
         * Sets the value of the cChrAttachmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCChrAttachmentName(String value) {
            this.cChrAttachmentName = value;
        }

        /**
         * Gets the value of the cActAttachmentAttachmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCActAttachmentAttachmentName() {
            return cActAttachmentAttachmentName;
        }

        /**
         * Sets the value of the cActAttachmentAttachmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCActAttachmentAttachmentName(String value) {
            this.cActAttachmentAttachmentName = value;
        }

        /**
         * Gets the value of the cActAttachmentAttachmentData property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getCActAttachmentAttachmentData() {
            return cActAttachmentAttachmentData;
        }

        /**
         * Sets the value of the cActAttachmentAttachmentData property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setCActAttachmentAttachmentData(byte[] value) {
            this.cActAttachmentAttachmentData = value;
        }

        /**
         * Gets the value of the cActAttachmentAttachmentOrigSize property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCActAttachmentAttachmentOrigSize() {
            return cActAttachmentAttachmentOrigSize;
        }

        /**
         * Sets the value of the cActAttachmentAttachmentOrigSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCActAttachmentAttachmentOrigSize(Integer value) {
            this.cActAttachmentAttachmentOrigSize = value;
        }

        /**
         * Gets the value of the requestID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestID() {
            return requestID;
        }

        /**
         * Sets the value of the requestID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

    }

}
