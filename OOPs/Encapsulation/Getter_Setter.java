class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private final String shopName = "Divy Toys and Gift Articles";

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    //getter -> a method that gets the data when called
    public String getName() {
        return name;
    }

    //setter -> a method that updates/modifies the existing data when called
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getShopName() {
        return shopName;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 200000, 5);

        System.out.println("\nShopName: " + product.getShopName());

        System.out.println("\nProduct Name: " + product.getName());
        System.out.println("Price: Rs." + product.getPrice());
        System.out.println("Stock Quantity: " + product.getStockQuantity());

        product.setName("Dell Alienware");
        product.setPrice(300000);
        product.setStockQuantity(60);

        System.out.println("\nProduct Name: " + product.getName());
        System.out.println("Price: Rs." + product.getPrice());
        System.out.println("Stock Quantity: " + product.getStockQuantity());
        
    }
}
