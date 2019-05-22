package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.MainActivity.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class unitTest {
    MainActivity mainActivity ;
    @Before
    public void setUp() throws Exception
    {
         mainActivity = Robolectric.buildActivity(MainActivity.class )
                .create().resume().get();
    }


    @Test
    public void testAsyn(){
        try {

           String joke=  mainActivity.new EndpointsAsyncTask().execute().get();
           assertNotNull(joke);

        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }
}
