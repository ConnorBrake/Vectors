
/**
 *
 * @author Connor Brake
 */
public class UnitVector {
    private double xComponent;
    private double yComponent;
    private double zComponent;
    
    public UnitVector(double xComponent, double yComponent, double zComponent)
    {
        setXComponent(xComponent);
        setYComponent(yComponent);
        setZComponent(zComponent);
    }
    
    public double getXComponent()
    {
        return xComponent;
    }
    public double getYComponent()
    {
        return yComponent;
    }
    public double getZComponent()
    {
        return zComponent;
    }
    
    public void setXComponent(double xComponent)
    {
        if(xComponent >= 0 || xComponent <= 1)
        {
            this.xComponent = xComponent;
        }
        else
        {
            this.xComponent = 0;
        }
    }
    public void setYComponent(double yComponent)
    {
        if(yComponent >= 0 || yComponent <= 1)
        {
            this.yComponent = yComponent;
        }
        else
        {
            this.yComponent = 0;
        }
    }
    public void setZComponent(double zComponent)
    {
        if(zComponent >= 0 || zComponent <= 1)
        {
            this.zComponent = zComponent;
        }
        else
        {
            this.zComponent = 0;
        }
    }
}
