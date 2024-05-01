package Client;
/**
 * ClassName: MazeGame
 * Description: Generates a maze game using the createMaze method. The createMaze method
 *              calls MazeFactory methods to create a maze game template. It initializes the
 *              maze with rooms, doors, and walls to create a connected structure.
 * @Author: Tom
 *
 * @param: Factory An instance of MazeFactory that provides the components of the maze.
 * @return: Maze An instance of Maze that represents the assembled maze game.
 */
import AbstractProduct.Maze;
import AbstractProduct.Direction;
import AbstractProduct.Door;
import AbstractProduct.Room;
import AbstractProduct.Wall;
import AbstractFactory.MazeFactory;

public class MazeGame {
    public Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door theDoor = factory.makeDoor(r1,r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West, factory.makeWall());
        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East,factory. makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West, theDoor);
        return aMaze;
    }
}
