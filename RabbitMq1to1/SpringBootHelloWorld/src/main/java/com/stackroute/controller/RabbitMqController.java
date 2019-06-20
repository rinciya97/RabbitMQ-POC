package com.stackroute.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stackroute.model.Employee;
import com.stackroute.service.RabbitMqService;
@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @PostMapping(value = "/producer")
    public String producer(@RequestBody Employee emp) {
        rabbitMqService.send(emp);
        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }
}
