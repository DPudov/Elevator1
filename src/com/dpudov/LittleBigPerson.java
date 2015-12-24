package com.dpudov;

import java.util.Random;

import static com.dpudov.Elevator.floors;

/**
 * Created by ${DPudov} on 14.12.2015.
 */
public class LittleBigPerson {
      String params(){
        Random rand = new Random();
        String newparam;
       int x1 = rand.nextInt(floors -1)+1;
       int x2 = rand.nextInt(floors -1)+1;
        while (x1 == x2)
            x2 = rand.nextInt(floors)+1;
        newparam= Integer.toString(x1);
        newparam += "," + Integer.toString(x2);
      return newparam;

    }

}
