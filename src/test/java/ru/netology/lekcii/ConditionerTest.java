package ru.netology.lekcii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {
    Conditioner cond = new Conditioner();  // объект выносим в общее место

    @Test
    public void shouldInitFields(){

       // Assertions.assertEquals(30, cond.getMaxTemp());
        Assertions.assertEquals("noname", cond.getName());
        Assertions.assertEquals(15, cond.getMinTemp());
        Assertions.assertEquals(22, cond.getCurrentTemp());
    }
    @Test
    public void findMaxTemp(){

        Assertions.assertEquals(30, cond.getMaxTemp());

    }
}
