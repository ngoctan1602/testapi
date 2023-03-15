package com.example.testdeloyapi.repository;

import com.example.testdeloyapi.model.TestApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<TestApi,Integer> {

}
