package com.ayowole.builder;

class Address {

    private String street;
    private Integer number;
    private String addressComplement;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }
    
    @Override
    public String toString() {
        return "[" + street + ", " + number + ", " + addressComplement + "]";
    }

}
