package com.jekss.service.impl;



import com.jekss.entityes.Product;
import com.jekss.repository.ProductRepository;
import com.jekss.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jekss on 26.09.16.
 */
@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {


    @Resource
    private ProductRepository productRepository;

    @Override
   public Product addProduct(Product product) {
        Product product1 = productRepository.saveAndFlush(product);
        return product1;
    }



    @Override
    public void deleteProduct(int id_product) {
        productRepository.delete(id_product);
    }

    @Override
    public Product getByNameProduct(String name_product) {
        return productRepository.findByName(name_product);
    }

    @Override
    public Product editProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }


    @Override
    public List <Product> getCategoriesName1(String categoriesName1) {
        return productRepository.findByCategoriesName1Query(categoriesName1);
    }

    @Override
    public List <String> getCategName1All(){
        return productRepository.findByCategoriesName1All();
    }
}
