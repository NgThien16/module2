package ss5_access_modifier;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
       ProductManagement  productManagement = new ProductManagement();
       Scanner scanner =  new Scanner(System.in);
       boolean flag = true;
       while(flag){
           System.out.println("---------------Quản lý Sản Phẩm-------------");
           System.out.println("Chức năng: "+
                   "\n 1.Danh sách"+
                   "\n 2. Thêm mới"+
                   "\n 3. Xóa"+
                   "\n 4. Tìm kiếm"+
                   "\n 5. Thoát"
           );
           System.out.println("Chọn chức năng");
           int choice = Integer.parseInt(scanner.nextLine());
           switch(choice){
               case 1:
                   System.out.println("Danh sách");
                   Product[] productList = productManagement.getAll();
                   for (Product product : productList) {
                       if (product != null) {
                           System.out.println(product);
                       } else {
                           break;
                       }
                   }
                   break;
               case 2:
                   System.out.println("Thêm mới");
                   System.out.println("Nhập id");
                   int idAdd = Integer.parseInt(scanner.nextLine());
                   System.out.println("Nhập tên sản phẩm");
                   String name = scanner.nextLine();
                   System.out.println("Nhập giá sản phẩm");
                   int price = Integer.parseInt(scanner.nextLine());
                   Product product = new Product(idAdd, name, price);
                   productManagement.add(product);
                   break;
               case 3:
                   System.out.println("Xóa");
                   System.out.println("Nhập id sản phẩm cần xóa");
                   int idRemove = Integer.parseInt(scanner.nextLine());
                   Product productRemove = new Product(idRemove, null,0);
                   productManagement.remove(productRemove);
                   break;
               case 4:
                   System.out.println("Tìm kiếm");
                   break;
               case 5:
                   System.out.println("Đã kết thúc chương trình");
                   flag  = false;
                   break;
           }
       }
    }
}
