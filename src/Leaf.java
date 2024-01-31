/**
 * This is a Leaf class that implements  Component interface and represents common  behaviour
 */
public class Leaf implements  Component{
    private String name;
    private int x;
    private int y;
    private int size;
    public Leaf(String name){
        this.name= name;
    }
    @Override
    public void Position(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("Position of "+name +": "+ "x: "+this.x+" y: "+this.y);
    }
    @Override
    public void Size(int size){
        this.size=size;
        System.out.println("Size of "+name +": "+this.size);
    }
}
