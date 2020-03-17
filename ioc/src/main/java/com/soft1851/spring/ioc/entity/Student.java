package com.soft1851.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
    private Map<String,Integer> scores;
    private Set sex;

    public Student(String id, String name, List<String> hobbies, List<Phone> phones, Map<String, Integer> scores, Set sex) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.phones = phones;
        this.scores = scores;
        this.sex = sex;
    }

    public Student() {
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

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public Set getSex() {
        return sex;
    }

    public void setSex(Set sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phones=" + phones +
                ", scores=" + scores +
                ", sex=" + sex +
                '}';
    }
}


