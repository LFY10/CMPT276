package AbstractProduct.ConcreteProduct;
/**
 * ClassName:DoorNeedingSpell
 * Description: DoorNeedingSpell extends Door
 *              DoorNeedingSpell calls makeDoor methods
 * @Author:Tom
 * @Param: no
 * @Param: no
 * @Return: no
 */
import AbstractProduct.Door;
import AbstractProduct.Room;
public class DoorNeedingSpell extends Door{
    public DoorNeedingSpell(Room r1, Room r2){
        super(r1,r2);
    }



}
