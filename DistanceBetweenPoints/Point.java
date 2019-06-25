public class Point {
    // write your code here
    private int x,y;
    public Point()
    {
        this(0,0);
    }
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance()
    {
        return Math.sqrt(x*x+y*y);
    }
    public double distance(int x,int y)
    {
        int a=this.x-x;
        int b=this.y-y;
        return Math.sqrt(a*a+b*b);
    }
    public double distance(Point p)
    {
        int a=x-p.getX();
        int b=y-p.getY();
        return Math.sqrt(a*a+b*b);
    }
}