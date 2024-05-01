package AbstractProduct;
/**
 * ClassName:Maze
 * Description: addRoom method
 * @Author:Tom
 */
import java.util.HashSet;
import java.util.Set;

public class Maze {
    private Set<Room> _rooms = new HashSet<Room>();
    public Maze(){
        System.out.println("Creating s Maze");
       // _rooms = new HashSet<Room>();
    }
    public void addRoom(Room r){
        if (!_rooms.contains(r)){
            _rooms.add(r);
        }
    }


}
