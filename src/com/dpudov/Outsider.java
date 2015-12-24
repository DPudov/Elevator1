package com.dpudov;

import java.util.EventListener;
import java.util.Random;

import static com.dpudov.Elevator.floors;
import static com.dpudov.Persons.count;

/**
 * Created by ${DPudov} on 22.12.2015.
 */
public class Outsider {
    int cntofouts = count;
    int calledFloorForward =0;

      public int toCallFloorForward(){
       int[] cl = new int[count];
        for (int i = 0; i< count; i++){
            Random rand = new Random();
            cl[i] =  rand.nextInt(floors);
        }
        calledFloorForward = cl[0];
        for (int i= 0; i< count; i++){
            if (calledFloorForward<cl[i])
                calledFloorForward = cl[i];
        }
       return calledFloorForward;
    }

}
