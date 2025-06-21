import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {
    public static void main(String[] args) {
        Product[] products = {
                new Product(201, "Bluetooth Speaker", "Electronics"),
                new Product(205, "Yoga Mat", "Fitness"),
                new Product(203, "Water Bottle", "Home & Kitchen"),
                new Product(202, "Graphic T-Shirt", "Clothing"),
                new Product(204, "Wireless Mouse", "Electronics")
        };

        int targetId = 203;

        int linearIndex = SearchEngine.linearSearch(products, targetId);
        System.out.println("Linear Search Index: " + linearIndex);
        if (linearIndex != -1) {
            System.out.println("Product Found: " + products[linearIndex]);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        Arrays.sort(products, Comparator.comparingInt(Product::getId));

        int binaryIndex = SearchEngine.binarySearch(products, targetId);
        System.out.println("Binary Search Index: " + binaryIndex);
        if (binaryIndex != -1) {
            System.out.println("Product Found: " + products[binaryIndex]);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}

class Product {
    private int id;
    private String name;
    private String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " - " + name + " - " + category;
    }
}

class SearchEngine {
    public static int linearSearch(Product[] items, int targetId) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId() == targetId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] items, int targetId) {
        int low = 0, high = items.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (items[mid].getId() == targetId) {
                return mid;
            } else if (items[mid].getId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
