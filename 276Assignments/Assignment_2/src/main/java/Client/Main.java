package Client;
/**
 * ClassName: Main
 * Description: Entry point for the maze game application. This class
 *              instantiates a MazeFactory and uses it to create a maze
 *              through the MazeGame's createMaze method. It demonstrates the usage
 *              of the default MazeFactory to create and assemble the components of
 *              a maze game.
 * @Author: Tom
 */
import AbstractFactory.MazeFactory;
public class Main {
    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);
    }

}
