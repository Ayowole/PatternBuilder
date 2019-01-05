package com.ayowole.builder;

import java.util.NoSuchElementException;
import java.util.Objects;

class UserBuilder {

    private User user;
    
    public UserBuilder() {
        user = new User();
    }
    
    public UserBuilder addName(String name) {
        if (Objects.isNull(name)) throw new NoSuchElementException();
        if (name.length() > 40) throw new StringIndexOutOfBoundsException("the maximum size is 40 character");
        
        user.setName(name);
        
        return this;
    }
    
    public UserBuilder addAge(Integer age) {
        if (Objects.isNull(age)) throw new NoSuchElementException();
        if (age > 200) throw new NumberFormatException("the age cannot be greater than 200");
        
        user.setAge(age);
        
        return this;
    }
    
    public UserBuilder addAddress(Address address) {
        if (Objects.isNull(address)) throw new NoSuchElementException();
        
        user.addAddress(address);
        
        return this;
    }
    
    public User build() {
        return user;
    }
    
}
