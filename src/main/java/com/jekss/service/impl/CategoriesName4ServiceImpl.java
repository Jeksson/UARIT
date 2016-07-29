package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName4;
import com.jekss.repository.CategoriesName4Repositiry;
import com.jekss.service.CategoriesName4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName4ServiceImpl implements CategoriesName4Service {

    private CategoriesName4 categoriesName4;
    @Autowired
    private CategoriesName4Repositiry categoriesName4Repositiry;

    @Override
    public CategoriesName4 addCategoriesName4(CategoriesName4 categoriesName4) {
        CategoriesName4 categoriesName41 = categoriesName4Repositiry.saveAndFlush(categoriesName4);
        return categoriesName41;
    }

    @Override
    public void deleteCategoriesName4(int id_categoriesName4) {

        categoriesName4Repositiry.delete(id_categoriesName4);
    }

    @Override
    public CategoriesName4 getByNameCategoriesName4(String name_categoriesName4) {
        return categoriesName4Repositiry.findByName(name_categoriesName4);
    }
    @Override
    public boolean isNameCategoriesName(String name_categoriesName4) {
        categoriesName4 = getByNameCategoriesName4(name_categoriesName4);
        if (categoriesName4.equals(null) || !categoriesName4.getName().equals(name_categoriesName4)){
            return true;
        }else return false;
    }

    @Override
    public CategoriesName4 editCategoriesName4(CategoriesName4 categoriesName4) {
        return categoriesName4Repositiry.saveAndFlush(categoriesName4);
    }

    @Override
    public List<CategoriesName4> getAll() {
        return categoriesName4Repositiry.findAll();
    }
}
