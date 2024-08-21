interface Father {
    double property = 2300;
}

interface Mother {
    String manners = "Respect Elders";
    double property = 4500;
}

class Child implements Father, Mother {
    void display() {
        System.out.println("Property: " + Mother.property);
        System.out.println("Manners: " + manners);
    }
}

public class Multiple {
    public static void main(String[] args) {
        Child c = new Child();

        c.display();
    }
}
