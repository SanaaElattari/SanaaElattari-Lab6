import java.util.Random;

public class TypeB extends Thing {
    
    public TypeB(int row, int col, char lab, int dir) 
    {
        super(row, col, dir, lab);
    }

    @Override // Override the maybeTurn method from Thing
    public void maybeTurn(Random rand) 
    {
        timeSinceLast++;
        if (timeSinceLast == 10) 
        {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) rightTurn();
            else if (i == 2) leftTurn();
        }
    }
    
}
