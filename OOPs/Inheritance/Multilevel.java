class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public void displayFoodInfo() {
        System.out.println("Food: " + name);
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

class Citrus extends Fruit {
    private int vitaminCContent;

    public Citrus(String name, String color, int vitaminCContent) {
        super(name, color);
        this.vitaminCContent = vitaminCContent;
    }

    public void displayCitrusInfo() {
        super.displayFruitInfo();
        System.out.println("Vitamin C Content: " + vitaminCContent + " mg");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Citrus orange = new Citrus("Orange", "Orange", 53);
    
        orange.displayCitrusInfo();
    
    }
}
