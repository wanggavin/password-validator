package com.example.passwordvalidator;

/**
 * Created by rainb on 2017/5/28.
 */

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleEspressoTest {
    private String textToFind;
    private String textToFind1;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textToFind = "123456789";
        textToFind1 = "strong";
    }

    @Test
    public void findText()
    {
        onView(withId(R.id.textview)).check(matches(withText("")));//before click

        onView(withId(R.id.editText)).perform(typeText(textToFind));//password

        onView(withId(R.id.button)).perform(click());// click

        onView(withId(R.id.textview)).check(matches(withText(textToFind1)));//
    }

}
