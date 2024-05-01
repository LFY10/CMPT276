package Client;
/**
 * ClassName: MainEnchanted
 * Description: Entry point for the enchanted maze game application. This class
 *              instantiates an EnchantedMazeFactory and uses it to create a maze
 *              through the MazeGame's createMaze method.
 * @Author: Tom
 */

import AbstractFactory.ConcretetFactory.EnchantedMazeFactory;
import AbstractFactory.MazeFactory;

public class MainEnchanted {
    public static void main(String[] args) {
        EnchantedMazeFactory factory = new EnchantedMazeFactory();
        MazeGame g = new MazeGame();
        g.createMaze(factory);
    }
}
