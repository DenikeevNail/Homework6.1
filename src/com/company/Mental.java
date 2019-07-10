package com.company;

public class Mental extends Player implements SuperAbility{
    private int braindamage = 30; //атака силой мысли

    public int getBraindamage() {
        return braindamage;
    }

    public void setBraindamage(int braindamage) {
        this.braindamage = braindamage;
    }


    @Override
    public void SuperAb() {
        System.out.println("супер прыжок");
    }
}

