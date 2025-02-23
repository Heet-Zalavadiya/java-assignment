package circle;

public class Circle {
    public void cirArea3(int r){
        double Area = Math.PI*r*r;
        System.out.println("this is non-static method different class"+" Area = "+Area);
    }
    public static void cirArea4(int r){
        double Area = Math.PI*r*r;
        System.out.println("this is static method different class"+" Area = "+Area);
    }
}
