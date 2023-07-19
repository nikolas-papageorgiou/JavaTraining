package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ship S1 = new Ship("Nikos",450);
        Ship S2 = new Ship("Maria",900);
        Ship S3 = new Ship("Copacabana",300);
        Ship S4 = new Ship("Kazablanka",600);

        ArrayList<Ship> ships = new ArrayList<Ship>();
        ships.add(S1);
        ships.add(S2);
        ships.add(S3);
        ships.add(S4);
        ContainerFrame containerFrame = new ContainerFrame(ships);

    }
}