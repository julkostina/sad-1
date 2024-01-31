import java.util.ArrayList;
import java.util.List;

/**
 * Composite class implements Component interface, overrides  Position and Size methods and
 * makes use of Add and Delete meethods for manipulating with the components in the list
 *
 * @param child  parameter for Delete method
 * @param child  parameter for Add method
 */
public class Composite implements Component{
    private List<Component> children = new ArrayList<Component>();
    public void Add(Component child){
        children.add(child);
    }
    public void Delete(Component child){
        children.remove(child);
    }
    @Override
    public void Position(int x, int y){
        for(Component l : children){
            l.Position(x,y);
        }
    }
    @Override
    public void Size(int size){
        for(Component l : children){
            l.Size(size);
        }
    }
}
