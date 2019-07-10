package com.company;

public class Boss extends Player implements SuperAbility{
    private String defence = "Physical";

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }


    @Override
    public void SuperAb() {
    }
}
