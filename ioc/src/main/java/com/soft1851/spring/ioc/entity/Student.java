package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 9:34
 * @Description:
 */
public class Student {
    private String id;
    private String name;
    private List<String> hobbies;
    private List<Phone> phones;

    public Student() {
    }

    public Student(String id, String name, List<String> hobbies, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.phones = phones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phones=" + phones +
                '}';
    }
}

