package ss12_product.controller;

import ss12_product.entity.Product;
import ss12_product.service.ProductService;
import ss12_product.service.IProductService;
import ss12_product.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý Sản Phẩm----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<Product> customerList = productService.findAll();
                    ProductView.display(customerList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Product addProduct = ProductView.inputDataForNewProduct();
                    boolean isAddSuccess = productService.add(addProduct);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    Product deleteProduct = ProductView.deleteProduct();
                    boolean isDeleteSuccess = productService.delete(deleteProduct);
                    if (isDeleteSuccess) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    String searchProduct = ProductView.inputNameForSearch();
                    List<Product> foundProducts = productService.findByName(searchProduct);

                    if (foundProducts.isEmpty()) {
                        System.out.println("Tìm kiếm không thành công");
                    } else {
                        System.out.println("Kết quả tìm kiếm:");
                        ProductView.display(foundProducts); // hàm hiển thị danh sách khách hàng
                    }
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
