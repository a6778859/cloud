package com.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{


    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "customer_2hello " +name+", this messge send failed ";
    }

}