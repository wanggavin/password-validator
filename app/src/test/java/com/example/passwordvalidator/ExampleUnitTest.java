package com.example.passwordvalidator;

import android.annotation.TargetApi;
import android.os.Build;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void isCorrect() throws Exception {
        assertEquals(false, mainFunc.isStrong("password"));
        assertEquals(false,mainFunc.isStrong("123"));

    }



}