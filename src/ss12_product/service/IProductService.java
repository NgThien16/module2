package ss12_product.service;

import ss12_product.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    boolean add(Product product);

    boolean delete(Product deleteProduct);
    Product findById(int id);                  // tìm 1 khách theo id
    List<Product> findByName(String name);
}
