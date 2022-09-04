package com.knreddy.www;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {    
        assertTrue( true );
    }

    @Test
    public void checkAgeAbove18(){
        App app=new App();
        String actual=app.checkAge(20);
        assertEquals("Age is greater than 18", actual);
    }
    @Test
    public void checkAgeBelow18(){
        App app=new App();
        String actual=app.checkAge(12);
        assertEquals("My age is less thatn 18", actual);
    }

}
