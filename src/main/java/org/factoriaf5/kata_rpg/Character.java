package org.factoriaf5.kata_rpg;

public class Character {
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

    public void dealDamage(int damage) {
        if (alive) {
            health -= damage;
            if (health >=0) {
                alive = false;
                health = 0;
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
