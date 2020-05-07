package com.daugherty.synthesize.controller;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ControllerTests {
    Controller controller = new Controller();

    @Test
    public void testReturnInput() {
        assertEquals(1, controller.returnInput(1));
        assertEquals("test", controller.returnInput("test"));
    }

    @Test
    public void testGetNumber() {
        assertEquals(123, controller.getNumber());
    }

    @Test
    public void testGetNegativeInteger_value_is_negative() {
        assertTrue(controller.getNegativeInteger() < 0);
    }

    @Test
    public void testGetNegativeInteger_value_is_int() {
        assertTrue(controller.getNegativeInteger() % 1 == 0);
    }
}
