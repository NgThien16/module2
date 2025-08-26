package ss12_product.repository;

import ss12_product.entity.Product;

import java.util.LinkedList;
import java.util.List;



public class ProductRepository implements IProductRepository {
    private static List<Product> products= new LinkedList<>();
    static{
        products.add(new Product(1, "Samsung",10.0f));
        products.add(new Product(2, "Oppo", 9.0f));
        products.add(new Product(3, "Xiami", 8.0f));

    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public boolean add(Product product) {
        products.add(product);
        return true;
    }


    @Override
    public boolean delete(Product product){
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // không tìm thấy
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> result = new LinkedList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result; // có thể rỗng nếu không tìm thấy
    }

}
