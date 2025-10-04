import java.util.Random;


public class ThingList {
    private class Node 
    {
        Thing data;
        Node next;
        Node(Thing t) { data = t; }
    }

    private Node head = null; 

    public void addThing(Thing t) 
    {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void printAll()  // print all method 
    {
        for (Node curr = head; curr != null; curr = curr.next)
        {
            System.out.println(curr.data.toString());
            System.out.println("done");
            System.out.flush();
        }
    }

    public void moveAll(Random rand)  // move all method 
    {
        for (Node curr = head; curr != null; curr = curr.next)
        {
            curr.data.maybeTurn(rand);
            curr.data.step();
        }
    }

}
