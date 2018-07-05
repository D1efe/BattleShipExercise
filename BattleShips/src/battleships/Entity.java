package battleships;

public abstract class Entity {

    private ShipHandler sh;

    public Entity() {

        sh = new ShipHandler();
        Board b1 = new Board();
        System.out.println("\n");
        
    }

    public void setShipPosition() {

        sh.putInPosition();

    }

}
