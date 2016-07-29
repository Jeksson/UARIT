package com.jekss.service;

import com.jekss.entityes.Picture;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface PictureService {

    Picture addPicture(Picture picture);
    void deletePicture(int id_picture);
    //Picture getByNamePicture(String name_picture);
    Picture editPicture(Picture picture);
    List<Picture> getAll();
}
