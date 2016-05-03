package sk.t_systems.rmc.ds.score;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-03T22:50:37.036+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "t-systems.sk/rmc/ds/score", name = "scorePortType")
@XmlSeeAlso({org.wso2.ws.dataservice.ObjectFactory.class, ObjectFactory.class})
public interface ScorePortType {

    @WebMethod(action = "urn:getScore")
    @Action(input = "urn:getScore", output = "urn:getScoreResponse", fault = {@FaultAction(className = DataServiceFault.class, value = "urn:getScoreDataServiceFault")})
    @RequestWrapper(localName = "getScore", targetNamespace = "t-systems.sk/rmc/ds/score", className = "sk.t_systems.rmc.ds.score.GetScore")
    @ResponseWrapper(localName = "scoreCollection", targetNamespace = "t-systems.sk/rmc/ds/score", className = "sk.t_systems.rmc.ds.score.ScoreCollection")
    @WebResult(name = "score", targetNamespace = "t-systems.sk/rmc/ds/score")
    public java.util.List<sk.t_systems.rmc.ds.score.Score> getScore(
        @WebParam(name = "id", targetNamespace = "t-systems.sk/rmc/ds/score")
        java.lang.String id,
        @WebParam(name = "type", targetNamespace = "t-systems.sk/rmc/ds/score")
        java.lang.String type
    ) throws DataServiceFault;
}
