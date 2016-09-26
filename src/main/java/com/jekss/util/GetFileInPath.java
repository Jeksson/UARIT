package com.jekss.util;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jekss on 07.08.16.
 */
// находит файл в директории и отдает их на upload page
@Service
public class GetFileInPath {

    private List <String> listNameFileInDir;

    public List<String> getFileNameFromFolder(String path) {

        listNameFileInDir = new ArrayList<>();

        File folder = new File(path);

        if (!folder.exists()) folder.mkdir();

        File[] listOfFiles = folder.listFiles();

        for(int i=0; i<listOfFiles.length; i++) {
            listNameFileInDir.add(listOfFiles[i].getName());
        }

        return listNameFileInDir;

    }






















}
