package com.example;

import io.spring.guides.gs_producing_web_service.GetSpiRequest;
import io.spring.guides.gs_producing_web_service.GetSpiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Endpoint
public class SpiRequestEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";


    @Autowired
    asyncService asyncService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSpiRequest")
    @ResponsePayload
    public GetSpiResponse getCountry(@RequestPayload GetSpiRequest request) {
        GetSpiResponse response = new GetSpiResponse();
        List<Future<String>> reponse = new ArrayList<>();
        System.out.println("pred threadmi");

        for (int i = 0; i < 20; i++) {
            try {
                reponse.add(asyncService.findUser(String.valueOf("prva " + i)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

 int counter =0;
        while(!reponse.parallelStream().anyMatch(stringFuture -> stringFuture.isDone())){

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;

        };

        reponse.forEach(r ->
        {
            try {
                System.out.println("result " + r.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        );

        System.out.println("po thredoch");


        return response;
    }
}
