/**
 * This is Main class that has main method, that make use of Leaf and Composite classes
 * @param args
 */

public class Main {
    public static void main(String[] args) {
        Leaf pointA = new Leaf("point A");
        pointA.Position(1,1);
        pointA.Size(2);
        Composite list = new Composite();
        list.Add(pointA);
        list.Add(new Leaf("point B"));
        list.Position(2,3);
        list.Size(3);
    }
}     