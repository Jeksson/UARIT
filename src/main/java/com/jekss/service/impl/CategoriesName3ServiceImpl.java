package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName3;
import com.jekss.repository.CategoriesName3Repositiry;
import com.jekss.service.CategoriesName3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName3ServiceImpl implements CategoriesName3Service {

    private CategoriesName3 categoriesName3;
    @Autowired
    private CategoriesName3Repositiry categoriesName3Repositiry;

    @Override
    public CategoriesName3 addCategoriesName3(CategoriesName3 categoriesName3) {
        CategoriesName3 categoriesName31 = categoriesName3Repositiry.saveAndFlush(categoriesName3);
        return categoriesName31;
    }

    @Override
    public void deleteCategoriesName3(int id_categoriesName3) {

        categoriesName3Repositiry.delete(id_categoriesName3);
    }

    @Override
    public CategoriesName3 getByNameCategoriesName3(String name_categoriesName3) {
        return categoriesName3Repositiry.findByName(name_categoriesName3);
    }
    @Override
    public boolean isNameCategoriesName(String name_categoriesName3) {
        categoriesName3 = getByNameCategoriesName3(name_categoriesName3);
        if (categoriesName3.equals(null) || !categoriesName3.getName().equals(name_categoriesName3)){
            return true;
        }else return false;
    }

    @Override
    public CategoriesName3 editCategoriesName3(CategoriesName3 categoriesName3) {
        return categoriesName3Repositiry.saveAndFlush(categoriesName3);
    }

    @Override
    public List<CategoriesName3> getAll() {
        return categoriesName3Repositiry.findAll();
    }
}
