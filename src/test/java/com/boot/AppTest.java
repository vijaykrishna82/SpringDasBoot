package com.boot;

import org.junit.Test;

import com.boot.controller.HomeController;
import static org.junit.Assert.assertEquals;


public class AppTest 
{
	@Test
    public void testApp()
    {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
