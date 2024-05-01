package AbstractProduct;
/**
 * ClassName:Door
 * Description: Door class extends from MapSite that has a override enter() method.
 *              _doorNr, room11 and room2 attributes
 * @Author:Tom
 * @Param: no
 * @Param: no
 * @Return: no
 */
public class Door extends MapSite{
    private static int _doorCnt = 1;
    private int _doorNr;
    private Room _room1;
    private Room _room2;

    public Door(Room r1, Room r2) {
        _doorNr = _doorCnt++;
        System.out.println("creating a Door #" + _doorNr + " between " + r1
                + " and " + r2);
        _room1 = r1;
        _room2 = r2; }
    public String toString() {
        return "Door #" + new Integer(_doorNr).toString();
    }

    @Override
    void enter() {
        System.out.println("Open a door");
    }
}
