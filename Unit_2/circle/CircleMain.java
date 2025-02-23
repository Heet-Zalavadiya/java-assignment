package circle;

public class CircleMain{
    public void cirArea1(int r){
        double Area = Math.PI*r*r;
        System.out.println("this is non-static method same class"+" Area = "+Area);
    }
    public static void cirArea2(int r){
        double Area = Math.PI*r*r;
        System.out.println("this is static method same class"+" Area = "+Area);
    }
    public static void main(String[] args) {
        CircleMain c = new CircleMain();
        c.cirArea1(4);
        cirArea2(2);
        Circle c1 =new Circle();
        c1.cirArea3(6);
        Circle.cirArea4(8);
    }
}