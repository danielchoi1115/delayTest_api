package com.syproject.delaytest.controller.v1.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syproject.delaytest.dto.response.Response;


@RestController
@RequestMapping("/api/v1/test")
@Api(value = "brs-application")
public class TestController {
    @GetMapping("/")
    @ApiOperation(value = "")
    public Response getAllStops() {
        ArrayList<String> bus_stops = new ArrayList<>();
        bus_stops.add("one");
        bus_stops.add("two");
        bus_stops.add("three");
        bus_stops.add("four");

        return Response
                .ok()
                .setPayload(bus_stops);
    }
}