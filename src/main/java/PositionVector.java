
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Connor Brake
 */
public class PositionVector extends UnitVector{
    private String name;
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;
    
    private double alphaCosineAngle;
    private double betaCosineAngle;
    private double gammaCosineAngle;
    
    //Creates a Vector Stemming from the Origin to some X and Y Values
    public PositionVector(double x2, double y2, String Name)
    {
        super(1, 1, 0);
        this.x1 = 0;
        this.x2 = x2 * super.getXComponent();
        this.y1 = 0;
        this.y2 = y2 * super.getYComponent();
        this.z1 = 0;
        this.z2 = 0;
        StdDraw.text(this.x2/2, this.y2/2, name);
        StdDraw.line(x1, y1, this.x2, this.y2);
       
        StdDraw.setPenColor(Color.red);
        StdDraw.line(0.8 * (this.x2 * Math.cos(0.14) - this.y2 * Math.sin(0.14)), 0.8 * (this.x2 * Math.sin(0.14) + this.y2 * Math.cos(0.14)), this.x2, this.y2);
        StdDraw.setPenColor(Color.blue);
        StdDraw.line(0.8 * (this.x2 * Math.cos(-0.14) - this.y2 * Math.sin(-0.14)), 0.8 * (this.x2 * Math.sin(-0.14) + this.y2 * Math.cos(-0.14)), this.x2, this.y2);
        StdDraw.setPenColor(Color.black);
    }
    
    public static PositionVector resultantVector(ArrayList<PositionVector> oV)
    {
        double resultantX = 0;
        double resultantY = 0;
        for(int i = 0; i < oV.size(); i++)
        {
            resultantX += oV.get(i).getXComponent();
            resultantY += oV.get(i).getYComponent();
        }
        PositionVector resultantVector = new PositionVector(resultantX, resultantY, "Resultant Vector");
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

    public void setAlphaCosineAngle()
    {
         double magnitude = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
         this.alphaCosineAngle = Math.toDegrees(Math.acos(x2/magnitude));
    }
    
    public void setBetaCosineAngle()
    {
         double magnitude = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
         this.betaCosineAngle = Math.toDegrees(Math.acos(y2/magnitude));
    }
    
    public void setGammaCosineAngle()
    {
         double magnitude = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
         this.gammaCosineAngle = Math.toDegrees(Math.acos(z2/magnitude));
    }
}
