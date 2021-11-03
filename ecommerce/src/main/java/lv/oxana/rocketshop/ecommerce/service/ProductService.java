package lv.oxana.rocketshop.ecommerce.service;

import com.sun.istack.NotNull;
import lv.oxana.rocketshop.ecommerce.repository.Product;

import javax.validation.constraints.Min;

public interface ProductService {

    // productRepository constructor injection

    @NotNull
    Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id) throws Exception;

    Product save(Product product);
}
