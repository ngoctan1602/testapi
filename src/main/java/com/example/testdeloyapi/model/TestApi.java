package com.example.testdeloyapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Test")
public class TestApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String address;

    public TestApi(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public TestApi() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
