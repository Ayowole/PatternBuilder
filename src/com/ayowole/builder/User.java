package com.ayowole.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User {

    private String name;
    private Integer age;
    private List<Address> addresses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }
    
    @Override
    public String toString() {
        return "["+ name + ", " + age + ", " + addresses + "]";
    }
    
}
