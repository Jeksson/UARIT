package com.jekss.service.impl;

import com.jekss.entityes.Picture;
import com.jekss.repository.PictureRepository;
import com.jekss.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureRepository pictureRepository;


    @Override
    public Picture addPicture(Picture picture) {
        Picture picture1 = pictureRepository.saveAndFlush(picture);
        return picture1;
    }

    @Override
    public void deletePicture(int id_picture) {

        pictureRepository.delete(id_picture);
    }

//    @Override
//    public Picture getByNamePicture(String name_picture) {
//        return pictureRepository.findByName(name_picture);
//    }

    @Override
    public Picture editPicture(Picture picture) {
        return pictureRepository.saveAndFlush(picture);
    }

    @Override
    public List<Picture> getAll() {
        return pictureRepository.findAll();
    }
}
