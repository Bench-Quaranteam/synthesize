package com.daugherty.synthesize.controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}