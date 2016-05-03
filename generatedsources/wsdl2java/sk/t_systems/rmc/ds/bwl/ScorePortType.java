package sk.t_systems.rmc.ds.bwl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-03T22:50:36.780+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "t-systems.sk/rmc/ds/bwl", name = "scorePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ScorePortType {

    @WebMethod(action = "urn:getBwl")
    @Action(input = "urn:getBwl", output = "urn:getBwlResponse")
    @RequestWrapper(localName = "getBwl", targetNamespace = "t-systems.sk/rmc/ds/bwl", className = "sk.t_systems.rmc.ds.bwl.GetBwl")
    @ResponseWrapper(localName = "bwlResult", targetNamespace = "t-systems.sk/rmc/ds/bwl", className = "sk.t_systems.rmc.ds.bwl.BwlResult")
    @WebResult(name = "score", targetNamespace = "t-systems.sk/rmc/ds/bwl")
    public java.util.List<sk.t_systems.rmc.ds.bwl.Score> getBwl(
        @WebParam(name = "id", targetNamespace = "t-systems.sk/rmc/ds/bwl")
        java.lang.String id,
        @WebParam(name = "type", targetNamespace = "t-systems.sk/rmc/ds/bwl")
        java.lang.String type
    );
}