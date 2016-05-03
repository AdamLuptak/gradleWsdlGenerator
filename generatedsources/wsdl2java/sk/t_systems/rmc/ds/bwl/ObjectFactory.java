
package sk.t_systems.rmc.ds.bwl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.t_systems.rmc.ds.bwl package. 
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

    private final static QName _BwlResult_QNAME = new QName("t-systems.sk/rmc/ds/bwl", "bwlResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.t_systems.rmc.ds.bwl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBwl }
     * 
     */
    public GetBwl createGetBwl() {
        return new GetBwl();
    }

    /**
     * Create an instance of {@link BwlResult }
     * 
     */
    public BwlResult createBwlResult() {
        return new BwlResult();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BwlResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "t-systems.sk/rmc/ds/bwl", name = "bwlResult")
    public JAXBElement<BwlResult> createBwlResult(BwlResult value) {
        return new JAXBElement<BwlResult>(_BwlResult_QNAME, BwlResult.class, null, value);
    }

}
