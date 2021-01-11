public class TheObj //SUPER CLASS!
{
    
    private String name="";
    private String size="Small";
    private int  power= 1;
    private String direction="Up";
    private String unicode="";
    
    public String getUnicode()
    {
        return unicode;
    }
    
    
    public void setUnicode(String unicode)
    {
        this.unicode=unicode;
        
    }
    
    
     public String getName()
    {
        return name;
    }
    
    
    public void setName(String name)
    {
        this.name=name;
        
    }
     public String getSize()
    {
        return size;
    }
    
    
    public void setSize(String size)
    {
        this.size=size;
        
    }
    
    public String getDirection()
    {
        return direction;
    }
    
    public void setDirection(String direction)
    {
        this.direction=direction;
        
    }
    
    public int getPower()
    {
        return power;
    }
    
    public void setPower(int power)
    {
        this.power=power;
        
    }
    
    public String toString()
    {//overriding the toString() method  
        return "name: "+name+"size: "+size+"Direction: "+direction + "power: "+ power; 
    }
    
}