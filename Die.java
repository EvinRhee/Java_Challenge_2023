import java.util.ArrayList;

public class Die 
{
   int numSides;
   boolean lastRoll = false;
   ArrayList<Integer> l1  = new ArrayList<Integer>();
    public Die()
    {
     numSides = 6;
    }

    public Die(int n)
    {
     numSides = n;
    }

    int numSides()
    {
        return numSides();
    }

    int Roll()
    {

        int random;
        int max = numSides;
        int min = 1;
        int range = max - min + 1;
        lastRoll = true;
        random = (int)(Math.random() * range) + min;
        l1.add(random);
        return random;
    }

    int readLastRoll()
    {
        if(lastRoll == true)
        {
            return l1.get(0);
        }
        else
        {
            System.out.println("Roll a die first");
            return -1;
        }
    }

    public static void main(String[] args)
    {
        Die x = new Die();
        System.out.println(x.numSides);
        System.out.println(x.Roll());
        System.out.println("Roll " + 1 + " = "  + x.Roll());        
    }

}