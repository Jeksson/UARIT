package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jekss on 26.07.16.
 */

@Service
public class CashingDB {
    private boolean aBoolean = false;

    <T> boolean getCashing(String name, List<T> list) {
        List listNew = list;

        System.out.println(name + " name getCaehing");
        for (int i = 1; i < (listNew.size()); i++) {
            BaseClass baseClass = (BaseClass) list.get(i);
            //System.out.println(baseClass.getName()+"+++++= " + i);
            if (baseClass.getName()!=name) {aBoolean = true;}
            else aBoolean = false;
        }
        return aBoolean;
    }







}
