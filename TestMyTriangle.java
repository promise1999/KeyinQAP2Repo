public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,2);
        MyPoint p2 = new MyPoint(3,3);
        MyPoint p3 = new MyPoint(4,4);
        MyTriangle T = new MyTriangle(p1, p2, p3) ;  

        MyTriangle T2 = new MyTriangle(2,2,3,3,4,4);

     System.out.println(T.getPerimeter());
     System.out.println(T2.getPerimeter());
    }
}