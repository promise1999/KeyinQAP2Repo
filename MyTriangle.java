public class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1,int x2, int y2, int x3, int y3 )
    {
        this.v1 =new MyPoint(x1,y1) ;
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);

    }
    public MyTriangle(MyPoint p1,MyPoint p2,MyPoint p3)
    {
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;
    }

    public double getPerimeter()
    {
        double d = v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
        return d;
    }
    public String getType()
    {
        double l1 = v1.distance(v2);
        double l2 = v2.distance(v3);
        double l3 = v3.distance(v1);

        if((l1==l2)&&(l2==l1))
        return "Equivilateral";
        return null;

    }

}