package com.animals;

public enum Gender {
    MALE {
        @Override
        public String getGeoName(){
            return "მამრობითი";
        }
    },
    FEMALE {
        @Override
        public String getGeoName(){
            return "მდედრობითი";
        }
    };

    public abstract String getGeoName();
}
