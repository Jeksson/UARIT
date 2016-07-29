package com.jekss.service.impl;

import com.jekss.entityes.Product;
import com.jekss.repository.ProductRepository;
import com.jekss.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 09.07.16.
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
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
    public void deleteProduct(){
        productRepository.deleteAll();
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
}
