package com.udacity.gradle.builditbigger;

import android.annotation.TargetApi;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


@RunWith(AndroidJUnit4.class)
public class androidUnitTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void testAsync(){
        try {
            MainActivity mainActivity = activityTestRule.getActivity();
            String joke=  mainActivity. new EndpointsAsyncTask().execute().get();

            assertNotNull(joke);
            assertNotEquals("Exception message","",joke);
        }catch (Exception e){
            e.printStackTrace();
            fail();
        }

    }
}
