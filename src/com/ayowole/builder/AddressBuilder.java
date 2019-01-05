package com.ayowole.builder;

import java.util.NoSuchElementException;
import java.util.Objects;

class AddressBuilder {
    
    private Address address;
    
    public AddressBuilder() {
        address = new Address();
    }
    
    public AddressBuilder addStreet(String street) {
        if (Objects.isNull(street)) throw new NoSuchElementException();
        if (street.length() > 30) throw new StringIndexOutOfBoundsException("the maximum size is 30 character");
        
        address.setStreet(street);
        
        return this;
    }
    
    public AddressBuilder addNumber(Integer number) {
        if (Objects.isNull(number)) throw new NoSuchElementException();
        if (number > 9999) throw new NumberFormatException("the number cannot be greater than 9999");
        
        address.setNumber(number);
        
        return this;
    }
    
    public AddressBuilder addAddressComplement(String addressComplement) {
        if (Objects.isNull(addressComplement)) throw new NoSuchElementException();
        if (addressComplement.length() > 30) throw new StringIndexOutOfBoundsException("the maximum size is 30 character");
        
        address.setAddressComplement(addressComplement);
        
        return this;
    }
    
    public Address build() {
        return address;
    }
}
