import java.util.Random;

public class TypeC extends Thing {

    private boolean leftNext = true;

    public TypeC(int row, int col, char lab, int dir) 
    {
        super(row, col, dir, lab);
    }

    @Override // Override the maybeTurn method from Thing
    public void maybeTurn(Random rand) 
    {
        if (leftNext) 
        {
            leftTurn();
        }
        else 
        {
            rightTurn();
        } 
        leftNext = !leftNext;
    }
    
}
