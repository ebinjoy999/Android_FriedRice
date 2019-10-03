package com.example.daggerintro.menu;

public class FriedRice {

    public static final int VEG_FRIED_RICE = 100;
    public  static final int CHICKEN_FRIED_RICE =101;
    private String out = "";

    public FriedRice(int TYPE){
        switch (TYPE){
            case VEG_FRIED_RICE: out = "VEG FRIED RICE @ plate"; break;
            case CHICKEN_FRIED_RICE: out = "CHICKEN FRIED RICE @ plate"; break;
        }
    }

    public String getFriedRice(){
        return this.out;
    }
}
