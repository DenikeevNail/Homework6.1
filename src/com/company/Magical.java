package com.company;

public class Magical extends Player implements SuperAbility{
    private int heal = 50; //лечить

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }


    @Override
    public void SuperAb() {
        System.out.println("супер молния");
    }
}

