package com.classes

class Patient {
    def firstName, lastName, age
    static hospital = "bla bla"

    // this setter method overrides default setter methods
    void setLastName(lastName){
        if (lastName == null){
            throw new IllegalArgumentException("Last Name can not be null!")
        }
        this.lastName = lastName
    }

    static void displayHospital(){
        println(hospital)
    }
}
