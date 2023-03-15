package com.example.testdeloyapi.controller;

import com.example.testdeloyapi.model.TestApi;
import com.example.testdeloyapi.service.IApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testApi")
public class ApiController {
    @Autowired
    IApiService iApiService;
    @GetMapping("/get")
    public TestApi getApiTest(@RequestParam("id") int id)
    {
        return iApiService.getApi(id);
    }
}
