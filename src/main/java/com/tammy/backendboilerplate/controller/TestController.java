package com.tammy.backendboilerplate.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @PostMapping
    public String create (@RequestBody Object payload){
        return "Created";
    }

    @GetMapping
    public String getAll (){
        return "Get all data";
    }

    @GetMapping("/{id}")
    public String getById (@PathVariable Integer id){
        return "Get data "+id;
    }

    @PutMapping("/{id}")
    public String update (@RequestBody Object payload, @PathVariable Integer id){
        return "Updated "+ id;
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable Integer id){
        return "Deleted "+id;
    }
}
