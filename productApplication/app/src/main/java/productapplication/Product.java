package productapplication;

public class Product {
    public String name;
    public String description;
    public double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void printProductInfo() {
        String output = "Product name: " + this.name + "\n"
                + "Product description: " + this.description + "\n"
                + "Product price: " + this.price + "\n";

        System.out.println(output);
    }
}