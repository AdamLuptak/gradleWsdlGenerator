
package sk.t_systems.rmc.ds.bwl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isInBwl" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "isInBwl"
})
public class Score {

    protected boolean isInBwl;

    /**
     * Gets the value of the isInBwl property.
     * 
     */
    public boolean isIsInBwl() {
        return isInBwl;
    }

    /**
     * Sets the value of the isInBwl property.
     * 
     */
    public void setIsInBwl(boolean value) {
        this.isInBwl = value;
    }

}
