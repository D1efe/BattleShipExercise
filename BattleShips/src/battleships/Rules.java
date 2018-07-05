package battleships;

public class Rules {

    private boolean rule;

    private boolean shipOccupation() {
        return true;

        //2 Ships cannot occupy the same space on the board.
    }

    private boolean scoreHit() {
        return true;

        //If a player scores a ‘hit’ on their opponent, then they get a another shot.
    }

    private boolean shipsCantMove() {

        return true;

        //Ships cannot be moved once they have been placed.
    }

}
