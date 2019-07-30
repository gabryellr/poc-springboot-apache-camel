package com.gabryelrock.pocs.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DemoRouter extends RouteBuilder {

    final static Logger logger = Logger.getLogger(DemoRouter.class);

    @Override
    public void configure() throws Exception {
       from("timer://foo?fixedRate=true&period=3000")
               .to("log:every three seconds, that'll be printed on the console");
    }
}
