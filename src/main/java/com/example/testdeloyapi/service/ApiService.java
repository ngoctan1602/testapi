package com.example.testdeloyapi.service;

import com.example.testdeloyapi.model.TestApi;
import com.example.testdeloyapi.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService implements IApiService{
    @Autowired
    ApiRepository apiRepository;
    @Override
    public TestApi getApi(int id) {
        return apiRepository.findById(id).get();
    }
}
