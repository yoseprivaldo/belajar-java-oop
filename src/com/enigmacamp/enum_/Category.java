package com.enigmacamp.enum_;

public enum Category {
    ELECTRONIC ("Aksesoris HP dan Laptop"),
    VEHICLE ("Motor dan Mobil"),
    COSMETIC ("Kosmetik Pria dan Wanita"),
    FURNITURE ("Peralatan Rumah Tangga");

    private String description;

    private Category(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
