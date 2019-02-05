package com.graduate.law.controller;

import com.graduate.law.repository.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    @Autowired
    private ProcessRepository processRepository;
}
