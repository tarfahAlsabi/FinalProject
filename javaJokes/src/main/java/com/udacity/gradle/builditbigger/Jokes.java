package com.udacity.gradle.builditbigger;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
ArrayList<String> jokes;
Random randomInt = new Random();
public Jokes(){
    super();
    jokes = new ArrayList<>();
    jokes.add("My boss told me to have a good day.. so I went home.");
    jokes.add("Why is Peter Pan always flying? He neverlands.");
    jokes.add("What do you call a guy with a rubber toe? Roberto.");
    jokes.add("What dya call a frenchman wearing sandals? Phillipe Phillope.");
    jokes.add("Why couldn't the bicycle stand up? Because it was two tired!.");
    jokes.add("What did one hat say to the other? You stay here. I’ll go on ahead.");
    jokes.add("Why wouldn’t the shrimp share his treasure? Because he was a little shellfish.");
    jokes.add("What do you call a dinosaur that is sleeping? A dino-snore");
    jokes.add(" Why did the teddy bear say no to dessert? Because she was stuffed.");
    jokes.add("Why did the student eat his homework?Because the teacher told him it was a piece of cake!");

}
    public String getJoke(){
    int i = randomInt.nextInt(jokes.size()- 1 );
    return jokes.get(i);
    }

   public void addNewJoke(String joke){
        jokes.add(joke);
   }
}
