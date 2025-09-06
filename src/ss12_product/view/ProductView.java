package ss12_product.view;

import ss12_product.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<Product> productList) {
        for (Product product : productList) {
            if(product != null){
                System.out.println(product);
            }else{
                break;
            }
        }
    }
    public static Product inputDataForNewProduct() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        float  price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(id,name,price);
        return product;
    }
    public  static Product deleteProduct() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        Product productDelete = new Product(id, null, 0);
        return productDelete;
    }
    public static int inputIdForSearch() {
        System.out.println("Nhập id cần tìm");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputNameForSearch() {
        System.out.println("Nhập tên cần tìm");
        return scanner.nextLine();
    }

}
