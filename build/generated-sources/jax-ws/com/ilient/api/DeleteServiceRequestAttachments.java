
package com.ilient.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteServiceRequestAttachments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteServiceRequestAttachments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="srId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fileIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteServiceRequestAttachments", propOrder = {
    "sessionId",
    "srId",
    "fileIds"
})
public class DeleteServiceRequestAttachments {

    protected long sessionId;
    protected int srId;
    @XmlElement(nillable = true)
    protected List<String> fileIds;

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the srId property.
     * 
     */
    public int getSrId() {
        return srId;
    }

    /**
     * Sets the value of the srId property.
     * 
     */
    public void setSrId(int value) {
        this.srId = value;
    }

    /**
     * Gets the value of the fileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileIds() {
        if (fileIds == null) {
            fileIds = new ArrayList<String>();
        }
        return this.fileIds;
    }

}
