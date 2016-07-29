package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName1;
import com.jekss.repository.CategoriesName1Repositiry;
import com.jekss.service.CategoriesName1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName1ServiceImpl implements CategoriesName1Service {
    private CategoriesName1 categoriesName1;

    @Autowired
    private CategoriesName1Repositiry categoriesName1Repositiry;

    @Override
    public CategoriesName1 addCategoriesName1(CategoriesName1 categoriesName1) {
        CategoriesName1 categoriesName11 = categoriesName1Repositiry.saveAndFlush(categoriesName1);
        return categoriesName11;
    }

    @Override
    public void deleteCategoriesName1(int id_categoriesName1) {

        categoriesName1Repositiry.delete(id_categoriesName1);
    }
    public void deleteCategoriesName1All(){
        categoriesName1Repositiry.deleteAll();
    }

    @Override
    public CategoriesName1 getByNameCategoriesName1(String name_categoriesName1) {
        return categoriesName1Repositiry.findByName(name_categoriesName1);
    }

    @Override
    public boolean isNameCategoriesName(String name_categoriesName1) {
         categoriesName1 = getByNameCategoriesName1(name_categoriesName1);
        if (categoriesName1.equals(null) || !categoriesName1.getName().equals(name_categoriesName1)){
            return true;
        }else return false;
    }

    @Override
    public CategoriesName1 editCategoriesName1(CategoriesName1 categoriesName1) {
        return categoriesName1Repositiry.saveAndFlush(categoriesName1);
    }

    @Override
    public List<CategoriesName1> getAll() {
        return categoriesName1Repositiry.findAll();
    }
}
