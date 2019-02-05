package com.graduate.law.controller;

import com.graduate.law.repository.ExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecutionController {

    @Autowired
    private ExecutionRepository executionRepository;
    
}
