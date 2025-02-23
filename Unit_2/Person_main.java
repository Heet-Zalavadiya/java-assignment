// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class
// p1 and p2, set their attributes using the parameterized constructor, and print their name and age.


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age:"+age);
    }
}

public class Person_main {
    public static void main(String[] args) {
        Person p1 = new Person("heet", 20);
        Person p2 = new Person( "Raj", 21);
        p1.display();
        p2.display();

    }
}
