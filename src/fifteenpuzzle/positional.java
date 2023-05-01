package fifteenpuzzle;

// Author: Peiman Zhiani Asgharzadeh
// Author: Bryce Leung


public class positional {
    // Initialize public variables
    public int x;
    public int y;

    //CONSTRUCTOR:
    // Constructor that creates the positional object with inputs
    public positional(int y, int x) {
        this.x = x;
        this.y = y;
    }


    //GETTER FUNCTIONS:
    // Returns the x positional value
    public int getX() {
        return this.x;
    }

    // Returns the y positional value
    public int getY() {
        return this.y;
    }
}