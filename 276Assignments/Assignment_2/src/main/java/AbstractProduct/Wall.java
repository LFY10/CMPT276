package AbstractProduct;
/**
 * ClassName:Wall
 * Description: Wall class extends from MapSite that has a override enter() method.
 *              _wallNr and _wallCnt attributes
 * @Author:Tom
 * @Param: no
 * @Param: no
 * @Return: no
 */
public class Wall extends MapSite{
    private int _wallNr;
    private static int _wallCnt = 1;

    public Wall() {
        _wallNr = _wallCnt++;
        System.out.println("creating Wall #" + new Integer(_wallNr).toString());
    }
    public String toString() {
        return "Wall #" + new Integer(_wallNr).toString();
    }

    @Override
    void enter() {
        System.out.println("Hit a wall");
    }
}
