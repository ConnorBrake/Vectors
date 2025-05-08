
/**
 *
 * @author Connor Brake
 */
public class Plane {
    private double rightX;
    private double leftX;
    private double upY;
    private double downY;
    
    //Creates a Custom Cartesian Plane
    public Plane(double rightX, double leftX, double upY, double downY)
    {
        StdDraw.line(0, 0, rightX, 0);
        StdDraw.line(0, 0, leftX, 0);
        StdDraw.line(0, 0, 0, upY);
        StdDraw.line(0, 0, 0, downY);
    }
}
