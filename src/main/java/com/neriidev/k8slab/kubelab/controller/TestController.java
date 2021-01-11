package com.neriidev.k8slab.kubelab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/teste")
public class TestController {

    @GetMapping
    public String createAccount(){
        return "Teste EKS Neriidev";
    }
}
