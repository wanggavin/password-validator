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
        assertEquals(false,mainFunc.isStrong("123"));//tests for the original cases in the question

        assertEquals(false,mainFunc.isStrong("12345678"));
        assertEquals(false,mainFunc.isStrong("87654321"));//tests for the rule that password cannot be '12345678' or '87654321'
        assertEquals(true,mainFunc.isStrong("123456789"));
        assertEquals(false,mainFunc.isStrong("123456789987654321"));//test for the rule that the password.length < 16
        assertEquals(false,mainFunc.isStrong("abcabcabc"));
        assertEquals(true,mainFunc.isStrong("abc123456"));//test for the rule that password cannot be all characters
    }

}