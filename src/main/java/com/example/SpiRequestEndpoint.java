package com.example;

import io.spring.guides.gs_producing_web_service.GetSpiRequest;
import io.spring.guides.gs_producing_web_service.GetSpiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SpiRequestEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSpiRequest")
    @ResponsePayload
    public GetSpiResponse getCountry(@RequestPayload GetSpiRequest request) {
        GetSpiResponse response = new GetSpiResponse();

        return response;
    }
}
