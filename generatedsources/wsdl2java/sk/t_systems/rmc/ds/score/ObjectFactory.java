
package sk.t_systems.rmc.ds.score;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.t_systems.rmc.ds.score package. 
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

    private final static QName _ScoreCollection_QNAME = new QName("t-systems.sk/rmc/ds/score", "scoreCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.t_systems.rmc.ds.score
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetScore }
     * 
     */
    public GetScore createGetScore() {
        return new GetScore();
    }

    /**
     * Create an instance of {@link ScoreCollection }
     * 
     */
    public ScoreCollection createScoreCollection() {
        return new ScoreCollection();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "t-systems.sk/rmc/ds/score", name = "scoreCollection")
    public JAXBElement<ScoreCollection> createScoreCollection(ScoreCollection value) {
        return new JAXBElement<ScoreCollection>(_ScoreCollection_QNAME, ScoreCollection.class, null, value);
    }

}
