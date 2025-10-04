import java.util.Random;

public  abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;  
    protected char lab;
    protected int timeSinceLast = 0;

    public Thing(int r, int c, int d, char l)
    {
        this.row = r;
        this.col = c;
        this.dir = d;
        this.lab = l;
    }

    public void rightTurn()  // where static methods
    { 
        dir = (dir + 1) % 4;
    }

    public void leftTurn() 
    {
        dir = (dir + 3) % 4;
    }

    public void step() 
    {
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};
        row += dr[dir];
        col += dc[dir];
    }

    public String toString() // to string method 
    {
        return row + " " + col + " " + lab;
    }

    public abstract void maybeTurn(Random rand); // double check this 

}
