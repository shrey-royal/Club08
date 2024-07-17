class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public void displayFoodInfo() {
        System.out.println("Food: " + name);
    }
}

class Vegetable extends Food {
    private String type;

    public Vegetable(String name, String type) {
        super(name);
        this.type = type;
    }

    public void displayVegetableInfo() {
        displayFoodInfo();
        System.out.println("Type: " + type);
    }
}

class Fruit extends Food {
    private String color;

    public Fruit(String name, String color) {
        super(name);
        this.color = color;
    }

    public void displayFruitInfo() {
        super.displayFoodInfo();
        System.out.println("Color: " + color);
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Vegetable carrot = new Vegetable("Carrot", "root");
        Fruit apple = new Fruit("Apple", "Red");

        carrot.displayVegetableInfo();
        apple.displayFruitInfo();
    }
}
