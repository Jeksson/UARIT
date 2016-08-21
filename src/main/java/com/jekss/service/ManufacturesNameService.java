package com.jekss.service;

import com.jekss.entityes.ManufacturesName;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by jekss on 16.07.16.
 */
public interface ManufacturesNameService {

    ManufacturesName addManufacturesName(ManufacturesName manufacturesName);
    void deleteManufacturesName(int id_manufacturedName);
    void deleteManufacturesNameAll();
    ManufacturesName getByNameManufacturesName(String name_manufacturesName);
    boolean isNameManufacturesName(String name_manufacturesName1);

    ManufacturesName editManufacturesName(ManufacturesName manufacturesName);

    ManufacturesName getByIdManufacturesName(int id_manufacturedName);

    List<ManufacturesName> getAll();
}
