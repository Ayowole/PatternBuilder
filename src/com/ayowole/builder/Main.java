package com.ayowole.builder;

class Main {
    
    public static void main(String[] args) {
        AddressBuilder addressBuilder = new AddressBuilder();
        
        Address address1 = addressBuilder
                .addStreet("Avenue Amador Bueno")
                .addNumber(25)
                .addAddressComplement("apartment 23 block 1")
                .build();
        
        addressBuilder = new AddressBuilder();
        
        Address address2 = addressBuilder
                .addStreet("Avenue Amador Bueno")
                .addNumber(25)
                .addAddressComplement("apartment 15 block 9")
                .build();
        
        UserBuilder userBuilder = new UserBuilder();
        
        User user = userBuilder
                .addName("Ayowole")
                .addAge(30)
                .addAddress(address1)
                .addAddress(address2)
                .build();
        
        System.out.println(user);
    }
    
}
