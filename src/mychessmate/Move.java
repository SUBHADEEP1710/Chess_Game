
package mychessmate;

public class Move {
    int source_location;
    int destination;

    public Move() {
        source_location = -1;
        destination = -1;
    }

    public Move(int source_location, int destination) {
        this.source_location = source_location;
        this.destination = destination;
    }
}
