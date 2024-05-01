package AbstractFactory.ConcretetFactory;
/**
 * ClassName:Spell
 *@Description: EnchantedMazeFactory is a factory class that produces enchanted rooms and doors
 *              that require spells to operate. It extends the MazeFactory and provides a specific
 *              implementation of the methods to create enchanted components.
 *
 * @Author:Tom
 *@Param: $ $
 *@Param: $ $
 *@Return: $
 */
import AbstractFactory.MazeFactory;
import AbstractProduct.Spell;
import AbstractProduct.Door;
import AbstractProduct.Room;
import AbstractProduct.ConcreteProduct.DoorNeedingSpell;
import AbstractProduct.ConcreteProduct.EnchantedRoom;
public class EnchantedMazeFactory extends MazeFactory{
    public Room makeRoom () {
        return new EnchantedRoom(castSpell());
    }
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
    private Spell castSpell() {
        return new Spell();
    }

    public String toString() {
        return "enchanted"+ super.toString();
    }
}
