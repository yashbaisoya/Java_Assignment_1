import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + "=" + (int)getTotalPrice();
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double tot = 0;
        for (Product p : products) {
            tot += p.getTotalPrice();
        }
        return tot;
    }

    @Override
    public String toString() {
        String res = "Order ID: " + orderId + "\nProducts:\n";
        for (Product p : products) {
            res += p.toString() + "\n";
        }
        res += "Total: " + (int)calculateTotal();
        return res;
    }
}

public class OrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oId = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        Order ord = new Order(oId);
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] p = line.split(",");
            Product prod = new Product(p[0].trim(), Double.parseDouble(p[1].trim()), Integer.parseInt(p[2].trim()));
            ord.addProduct(prod);
        }

        System.out.println(ord);
    }
}