package AbstractFactory;
/**
 * ClassName:MazeFactory
 * Description: Room class extends from MapSite that has a override enter() method.
 *
 * @Author:Tom
 * @Param: r1
 * @Param: r2
 * @Return: maze,wall,door,room
 */
import AbstractProduct.Maze;
import AbstractProduct.Wall;
import AbstractProduct.Door;
import AbstractProduct.Room;



public class MazeFactory {
    public Maze makeMaze(){
        return new Maze();
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }

    public Room makeRoom(){
        return new Room();
    }




}
