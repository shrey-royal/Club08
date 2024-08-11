class Shop {
    public String name;
    public double area;
    public double price;

    Shop() {
        System.out.println("This is a Shop");
    }
}

class ShopKeeper extends Shop {
    ShopKeeper() {
        super();
        //iib
        System.out.println("ShopKeeper Class");
    }

    {
        //Instance Initializer Block
        name = "Store Name";
        area = 30000;
        price = 25000000;

        System.out.println("IIB Called");
    }

    void display() {
        System.out.printf("Name: %s\nArea: %.2f\nPrice: %.2f\n", name, area, price);
    }
}


public class IIB {
    public static void main(String[] args) {
        ShopKeeper sk = new ShopKeeper();

        sk.display();
    }
}
/*
Instace Initializer Block: it is used to initialize the instance data member.
Priority Wise: Constructor > super() > iib > body of constructor

Tasks:
1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.

2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.

3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.

4. Time Zone Converter: Design a class for converting times between different time zones. Utilize an instance initializer block to set default time zone offsets.


*/