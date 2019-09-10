package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products=new HashMap<>();
        products.put(1, new Product(1, "iphone", "apple", 5000,"67458300_925143331166127_8956279419559739392_o.jpg"));
        products.put(2, new Product(2, "samsung", "samsung", 5000,"67550274_917046425309151_8919119641687621632_o.jpg"));
        products.put(3, new Product(3, "nokia", "nokia", 3000,"WLOP-artwork-women-digital-art-crown-sky-lanterns-1223115-wallhere.com.jpg"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remote(int id) {
        products.remove(id);
    }

    @Override
    public Product searchByName(String name) {
        List<Product> productList = findAll();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
