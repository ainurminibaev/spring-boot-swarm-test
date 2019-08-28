package com.technaxis.ainur.swarm.demo.controller;

import com.technaxis.ainur.swarm.demo.entity.Counter;
import com.technaxis.ainur.swarm.demo.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class TestController {

    @Autowired
    private CounterRepository counterRepository;

    @GetMapping
    public Counter get() {
        return counterRepository.save(new Counter());
    }
}
