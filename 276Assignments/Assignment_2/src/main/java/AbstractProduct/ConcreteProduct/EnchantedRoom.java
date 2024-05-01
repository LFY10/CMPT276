package AbstractProduct.ConcreteProduct;
/**
 * ClassName:EnchantedRoom
 * Description: EnchantedRoom extends Room
 *
 * @Author:Tom
 * @Param: no
 * @Param: no
 * @Return: no
 */

import AbstractProduct.Room;
import AbstractProduct.Spell;
public class EnchantedRoom extends Room{
    Spell string;
    public EnchantedRoom(Spell string){
        this.string = string;
    }

}
