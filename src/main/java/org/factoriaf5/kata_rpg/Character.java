package org.factoriaf5.kata_rpg;

public class Character {
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

    public void dealDamage(Character target, int damage) {
        if (this != target && target.isAlive()) {
            if (target.level >= this.level + 5) {
                damage /= 2;
            } else if (this.level >= target.level + 5) {
                damage *= 1.5; 
            }
    

            target.health -= damage;
    
            if (target.health <= 0) {
                target.alive = false;
                target.health = 0; 
            }
        }
    }
    

    public void heal(Character target, int healingAmount) {
        if (this == target && target.isAlive()) {
            target.health += healingAmount;
            if (target.health > 1000) {
                target.health = 1000;
            }

        }
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

}
