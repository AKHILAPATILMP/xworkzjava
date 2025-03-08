//3. Program to store 10 laptop brands and print them:

public class LaptopBrands {
    public static void main(String[] args) {
        String[] laptopBrands = {"Dell", "HP", "Apple", "Asus", "Lenovo", "Acer", "Microsoft", "MSI", "Samsung", "LG"};

        System.out.println("Laptop Brands:");
        for (String brand : laptopBrands) {
            System.out.println(brand);
        }
    }
}