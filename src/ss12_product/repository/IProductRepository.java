package ss12_product.repository;

import ss12_product.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    boolean add(Product product);


    boolean delete(Product product);

    Product findById(int id);
    List<Product> findByName(String name);
}
