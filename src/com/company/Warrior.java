package com.company;

public class Warrior extends Player implements SuperAbility{
    private int stan = 50; //оглушение

    public int getStan() {
        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }


    @Override
    public void SuperAb() {
        System.out.println("супер скорость");
    }
}

