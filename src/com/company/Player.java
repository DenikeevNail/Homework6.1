package com.company;

public abstract class Player {
    private int damage = 100;
    private int health = 300;
    private int typeHit = 50;





    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTypeHit() {
        return typeHit;
    }

    public void setTypeHit(int typeHit) {
        this.typeHit = typeHit;
    }
}
