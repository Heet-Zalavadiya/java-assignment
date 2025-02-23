//static variable program
class StudH1 {
    String name;
    int roll;
    static String uni;// static variable

    StudH1(String name, int roll, String uni) {
        this.name = name;
        this.roll = roll;
        StudH1.uni = uni;
    }

    void display1() {
        System.out.println(name + "\t" + roll + "\t" + uni);
    }
}

public class StaticVarDemo {
    public static void main(String[] args) {
        StudH1 s1 = new StudH1("abc", 111, "DU");
        StudH1 s2 = new StudH1("pqr", 222, "DU");
        StudH1 s3 = new StudH1("xyz", 333, "DU");
        /*
         * Add the missing code here
         * change the name of s3 to "zzz" instead of "xyz" using object s3._____="zzz"
         * change the uni name to "Darshan" instead of "DU" with class reference &
         * object refrence
         * ClassName._____="Darshan"; //Class Ref:is it correct? OR
         * obj._____="Darshan";//Object Ref:is it correct?
         * Note:Observe the output carefully
         */
        s3.name = "zzz";
        StudH1.uni = "Darshan";
        s1.display1();
        s2.display1();
        s3.display1();
    }
}