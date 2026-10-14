package com.example.lab_6

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WizardTest {
    private lateinit var evilWizard: Wizard
    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }
    @Test
    fun castSpell_explosion_successful() {
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(30, damageDealt) // spellPower of 10 * 3 = 30

        assertEquals(20, evilWizard.mana) // mana of 30 - 10 = 20


    }

    @Test
    fun cast_explosion_unsuccessful(){
        evilWizard.mana = 5
        val damage = evilWizard.castSpell("Explosion")
        assertEquals(0, damage)
        assertEquals(5, evilWizard.mana)
    }

    @Test
    fun cast_frostbite_successful(){
        val damage = evilWizard.castSpell("Frostbite")
        assertEquals(20, damage)
        assertEquals(25, evilWizard.mana)

    }

    @Test
    fun cast_frostbite_unsuccessful(){
        evilWizard.mana = 2
        val damage = evilWizard.castSpell("Frostbite")
        assertEquals(0, damage)
        assertEquals(2, evilWizard.mana)
    }
}//end wizardTest