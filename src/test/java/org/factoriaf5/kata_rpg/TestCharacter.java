package org.factoriaf5.kata_rpg;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is; 

public class TestCharacter {

    @Test
   void testCharacterIsAlive() {
    Character character = new Character();
    assertThat(character.isAlive(), is(true));
}
@Test
void testDealDamageReducesHealth() {
    Character attacker = new Character(true); 
    Character target = new Character(true);    
    attacker.dealDamage(target, 200, 1.0);     
    assertThat(target.getHealth(), is(800)); 
}


    @Test
    void testHealthMax() {
        Character attacker = new Character(true);
        Character target = new Character(true);
        attacker.dealDamage(target, 200, 1.0);
        target.heal(target, 300);
        assertThat(target.getHealth(), is(1000));

    }

    @Test
    void testHealingDeadCharacter() {
        Character target = new Character();
        Character attacker = new Character();
        attacker.dealDamage(target, 1000, 1.0);
        target.heal(target, 200);
        assertThat(target.getHealth(), is(0));
        assertThat(target.isAlive(), is(false));
    }

    @Test
    void testCharacterDeadCannotTakeDamage(){
        Character attacker = new Character();
        Character target = new Character();
        attacker.dealDamage(target, 1000, 1.0);
        attacker.dealDamage(target, 150, 1.0);
        assertThat(target.getHealth(), is(0));
        assertThat(target.isAlive(), is (false));

    }

    @Test 
    void testDiesAfterCriticalHit() {
        Character attacker = new Character();
        Character target = new Character();
        attacker.dealDamage(target, 1000, 1.0);
        assertThat(target.getHealth(), is(0)); 
        assertThat(target.isAlive(), is (false));
    }

    @Test
    void testInitialHealth() {
        Character character = new Character();
        assertThat(character.getHealth(), is(1000));
        assertThat(character.isAlive(), is (true));

    }
    @Test
    void testDealDamageOutofRange(){
        Character attacker = new Character(true);
        Character target = new Character(true);
        attacker.dealDamage(target, 100, 4.0);
        assertThat(target.getHealth(), is(1000));
        assertThat(target.isAlive(),is (true));
    }

    @Test
    void testCannotHealCharacterWhenIDead(){
        Character target = new Character(true);
        Character healer = new Character(true);
        healer.dealDamage(target, 1000, 1.5);
        healer.heal(target,100);
        assertThat(target.getHealth(), is(0));
        assertThat(target.isAlive(), is(false));
    }
    @Test
    void testCannotHurtMySelf() {
        Character character = new Character();
        character.dealDamage(character, 200, 1.0);
        assertThat(character.getHealth(), is(1000));
    }

    @Test
    void testRangeCharacterCanDealDamageWwithinRange(){
        Character attacker = new Character(false);
        Character target = new Character(true);
        attacker.dealDamage(target, 500, 12.0);
        assertThat(target.getHealth(), is(500));
    }

    }





