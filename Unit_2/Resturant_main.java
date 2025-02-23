// Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings. Define no-argument
// constructor and parameterized constructor to set values. Calculate average rating using double avg().

class Restaurant {

    String menu_items;
    int prices;
    int ratings;
    static double sum = 0;
    static double count = 0;

    Restaurant() {
        menu_items = "Pizza";
        prices = 200;
        ratings = 5;
        Restaurant.sum += ratings;
        Restaurant.count++;
    }

    Restaurant(String menu_items, int prices, int ratings) {
        this.menu_items = menu_items;
        this.prices = prices;
        this.ratings = ratings;
        Restaurant.sum += ratings;
        Restaurant.count++;
    }

    void display() {
        System.out.println("Menu Items: " + menu_items);
        System.out.println("Prices: " + prices);
        System.out.println("Ratings: " + ratings);
    }

    double avg() {
        return sum / count;

    }
}

public class Resturant_main {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();
        Restaurant r2 = new Restaurant("Burger", 100, 4);
        Restaurant r3 = new Restaurant("Pasta", 150, 3);
        r1.display();
        r2.display();
        r3.display();
        System.out.println("Average Rating: " + r1.avg());

    }
}
