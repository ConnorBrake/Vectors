
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Connor Brake
 */
public class OriginVector extends UnitVector{
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;
    
    private double alphaCosineAngle;
    private double betaCosineAngle;
    private double gammaCosineAngle;
    
    public OriginVector(double x2, double y2)
    {
        super(1, 1, 0);
        this.x1 = 0;
        this.x2 = x2 * super.getXComponent();
        this.y1 = 0;
        this.y2 = y2 * super.getYComponent();
        this.z1 = 0;
        this.z2 = 0;
        StdDraw.line(x1, y1, x2, y2);
       
        StdDraw.setPenColor(Color.red);
        StdDraw.line(0.8 * (x2 * Math.cos(0.14) - y2 * Math.sin(0.14)), 0.8 * (x2 * Math.sin(0.14) + y2 * Math.cos(0.14)), x2, y2);
        StdDraw.setPenColor(Color.blue);
        StdDraw.line(0.8 * (x2 * Math.cos(-0.14) - y2 * Math.sin(-0.14)), 0.8 * (x2 * Math.sin(-0.14) + y2 * Math.cos(-0.14)), x2, y2);
        StdDraw.setPenColor(Color.black);
    }
    
    public static OriginVector resultantVector(ArrayList<OriginVector> oV)
    {
        double resultantX = 0;
        double resultantY = 0;
        for(int i = 0; i < oV.size(); i++)
        {
            resultantX += oV.get(i).getXComponent();
            resultantY += oV.get(i).getYComponent();
        }
        OriginVector resultantVector = new OriginVector(resultantX, resultantY);
        return resultantVector;
    }
    
    @Override
    public double getXComponent()
    {
        return x2;
    }
    
    @Override
    public double getYComponent()
    {
        return y2;
    }  
}
