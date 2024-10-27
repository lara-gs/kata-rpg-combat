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
        Character character = new Character();
        character.dealDamage(200);
        assertThat(character.getHealth(), is(800));
    }

    @Test
    void testHealthMax() {
        Character character = new Character();
        character.dealDamage(200);
        character.heal(300);
        assertThat(character.getHealth(), is(1000));

    }

    @Test
    void testHealingDeadCharacter() {
        Character character = new Character();
        character.dealDamage(1000);
        character.heal(200);
        assertThat(character.getHealth(), is(0));
        assertThat(character.isAlive(), is(false));
    }

    @Test 
    void testDiesAfterCriticalHit() {
        Character character = new Character();
        character.dealDamage(1000);
        assertThat(character.getHealth(), is(0)); 
        assertThat(character.isAlive(), is (false));
    }

    @Test
    void testInitialHealth() {
        Character character = new Character();
        assertThat(character.getHealth(), is(1000));
        assertThat(character.isAlive(), is (true));

    }
    }





