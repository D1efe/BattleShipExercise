package battleships;

import java.util.ArrayList;
import java.util.Scanner;

public class ShipHandler {

    String name;
    ArrayList<Ships> playerShips;

    public ShipHandler() {

        playerShips = new ArrayList<>();
        playerShips.add(new Ships("Patrol", 1, 2));
        playerShips.add(new Ships("Patrol", 1, 2));
        playerShips.add(new Ships("BattleShip", 1, 3));
        playerShips.add(new Ships("BattleShip", 1, 3));
        playerShips.add(new Ships("Submarine", 1, 3));
        playerShips.add(new Ships("Destroyer", 1, 4));
        playerShips.add(new Ships("Carrier", 1, 5));

    }

    public void putInPosition() {
        
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        
        for (Ships x : playerShips) {
            System.out.println("set x co-ordinate for: " + x.getName());
            a = sc.nextInt();
            System.out.println("set y co-ordinate for: " + x.getName());
            b = sc.nextInt();
        }

    }

    public void sink() {

    }

}
