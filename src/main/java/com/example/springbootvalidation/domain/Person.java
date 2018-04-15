package com.example.springbootvalidation.domain;

import com.example.springbootvalidation.bean.validation.constraints.PersonName;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {

    private int age;

    @NotNull
    @PersonName
    private String name;


    @Min(value = 0)
    @Max(value = 100, message = "人的年龄不能超过100")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
