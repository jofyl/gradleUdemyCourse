/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package productapplication;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Product prod = new Product("gum", "this is a desc", 15.1);
        prod.printProductInfo();
    }
}
