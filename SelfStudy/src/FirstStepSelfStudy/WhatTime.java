package FirstStepSelfStudy;

/**
 * Created by Admin on 2017/4/16.
 */
public class WhatTime {
    public static void main(String[] args) {
        long currenttime = System.currentTimeMillis();
        long totalseconds = currenttime / 1000;
        long currentseconds = totalseconds % 60;
        long totalmintues = totalseconds / 60;
        long currentmintues = totalmintues % 60;
        long totalhours = totalmintues / 60;
        long currenthours = totalhours % 24 + 8;
        System.out.println("Now time is : "+ currenthours +":"+ currentmintues+":" + currentseconds + " in GMT +8:00 ");
    }
}
