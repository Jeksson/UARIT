package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName2;
import com.jekss.repository.CategoriesName2Repositiry;
import com.jekss.service.CategoriesName2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName2ServiceImpl implements CategoriesName2Service {

    private CategoriesName2 categoriesName2;

    @Autowired
    private CategoriesName2Repositiry categoriesName2Repositiry;

    @Override
    public CategoriesName2 addCategoriesName2(CategoriesName2 categoriesName2) {
        CategoriesName2 categoriesName21 = categoriesName2Repositiry.saveAndFlush(categoriesName2);
        return categoriesName21;
    }

    @Override
    public void deleteCategoriesName2(int id_categoriesName2) {

        categoriesName2Repositiry.delete(id_categoriesName2);
    }

    @Override
    public CategoriesName2 getByNameCategoriesName2(String name_categoriesName2) {
        return categoriesName2Repositiry.findByName(name_categoriesName2);
    }
    @Override
    public boolean isNameCategoriesName(String name_categoriesName2) {
        categoriesName2 = getByNameCategoriesName2(name_categoriesName2);
        if (categoriesName2.equals(null) || !categoriesName2.getName().equals(name_categoriesName2)){
            return true;
        }else return false;
    }

    @Override
    public CategoriesName2 editCategoriesName2(CategoriesName2 categoriesName2) {
        return categoriesName2Repositiry.saveAndFlush(categoriesName2);
    }

    @Override
    public List<CategoriesName2> getAll() {
        return categoriesName2Repositiry.findAll();
    }
}
