package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by adam on 4.5.2016.
 */
@Service
public class asyncService {

    @Autowired
    asyncIn asyncIn;

    @Async
    public Future<String> findUser(String f) throws InterruptedException {


        // Artificial delay of 1s for demonstration purposes
        String result = "sdfsdfdffdsdf";

            Future<String> h = null;
            try {
                h =   asyncIn.findUser(String.valueOf(f));
                result =  h.get(2000l,TimeUnit.MILLISECONDS) ;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                h.cancel(true);
                result ="Timout " + f;
            }



        return new AsyncResult<String>(result);
    }
}
