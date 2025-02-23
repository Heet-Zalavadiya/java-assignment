// Write a Java program to create a class called "RailwayReservation" with attributes for reservation PNRno, customer name, and 
// age. Create 3 instances of customer c1,c2, and c3. Create parameterized constructor with 3 parameters and call display() to print 
// all the information of c1,c2 and c3 respectively.





class RailwayReservation {
    int PNRno;
    String customer_name;
    int age;

    RailwayReservation(int PNRno, String customer_name, int age) {
        this.PNRno = PNRno;
        this.customer_name = customer_name;
        this.age = age;
    }

    public void display() {
        System.out.println("PNR No: " + PNRno);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Age: " + age);
    }

}

public class RailwayReservation_main {
    public static void main(String[] args) {
        RailwayReservation r1 = new RailwayReservation(12345, "Heet", 20);
        RailwayReservation r2 = new RailwayReservation(54321, "Raj", 21);
        RailwayReservation r3 = new RailwayReservation(67890, "Mohit", 19);
        r1.display();
        r2.display();
        r3.display();
    }
}
