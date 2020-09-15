package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD kelly = new CD("Kelly Clarkson", "CD", new ArrayList<>(Arrays.asList("Breakaway", "Because of You")));
        DVD up = new DVD("Up", "DVD", new ArrayList<>(Arrays.asList("main feature video", "audio", "bonus features", "clips of happy puppies to make you feel better")));
        CD empty = new CD("empty disc", "CD", new ArrayList<>());

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(kelly.getDiscType());
        System.out.println(kelly.spinDisc());
        System.out.println(kelly.getIsSpinning());
        kelly.stopSpin();
        System.out.println(kelly.getIsSpinning());


    }
}
