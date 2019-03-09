
package sqlconn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addServiceRequestAttachments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addServiceRequestAttachments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="srId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attachments" type="{http://api.ilient.com/}apiServiceRequestAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addServiceRequestAttachments", propOrder = {
    "sessionId",
    "srId",
    "attachments"
})
public class AddServiceRequestAttachments {

    protected long sessionId;
    protected int srId;
    @XmlElement(nillable = true)
    protected List<ApiServiceRequestAttachment> attachments;

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
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiServiceRequestAttachment }
     * 
     * 
     */
    public List<ApiServiceRequestAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<ApiServiceRequestAttachment>();
        }
        return this.attachments;
    }

}
