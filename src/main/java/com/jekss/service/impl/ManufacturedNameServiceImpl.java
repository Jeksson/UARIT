package com.jekss.service.impl;

import com.jekss.entityes.ManufacturesName;
import com.jekss.repository.ManufacturesNameRepositiry;
import com.jekss.service.ManufacturesNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class ManufacturedNameServiceImpl implements ManufacturesNameService {
    private ManufacturesName manufacturesName;

    @Autowired
    private ManufacturesNameRepositiry manufacturesNameRepositiry;

    @Override
    public ManufacturesName addManufacturesName(ManufacturesName manufacturesName) {
        ManufacturesName manufacturesName1 = manufacturesNameRepositiry.saveAndFlush(manufacturesName);
        return manufacturesName1;
    }

    @Override
    public void deleteManufacturesName(int id_manufacturedName) {

        manufacturesNameRepositiry.delete(id_manufacturedName);
    }
    public void deleteManufacturesNameAll(){
        manufacturesNameRepositiry.deleteAll();
    }

    @Override
    public ManufacturesName getByNameManufacturesName(String name_manufacturesName) {
        return manufacturesNameRepositiry.findByName(name_manufacturesName);
    }

    @Override
    public boolean isNameManufacturesName(String name_manufacturesName1) {
        manufacturesName = getByNameManufacturesName(name_manufacturesName1);
        if (manufacturesName.equals(null) || manufacturesName.getName().equals(name_manufacturesName1)){
            return true;
        }else return false;
    }

    @Override
    public ManufacturesName editManufacturesName(ManufacturesName manufacturesName) {
        return manufacturesNameRepositiry.saveAndFlush(manufacturesName);
    }

    @Override
    public ManufacturesName getByIdManufacturesName(int id_manufacturedName){

        return manufacturesNameRepositiry.findOne(id_manufacturedName);
    }

    @Override
    public synchronized CopyOnWriteArrayList<ManufacturesName> getAll() {
        return (CopyOnWriteArrayList<ManufacturesName>) manufacturesNameRepositiry.findAll();
    }
}
