package com.jekss.entityes;

import javax.persistence.*;

/**
 * Created by jekss on 26.09.16.
 */
@Entity
@Table(name = "product")
public class Product{

    private int id_product;
    private int id;
    private String name_product;
    private double price_product;
    private String dateAdded_product;
    private String manufacturesName_product;
    private String categoriesName1_product;
    private String categoriesName2_product;
    private String categoriesName3_product;
    private String categoriesName5_product;
    private String categoriesName4_product;
    private String categoriesName6_product;
    private String description_product;
    private String picture_product;




    @Column(name = "id_product")
    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 6, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name_product", length = 300)
    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }


    @Column(name = "price_product")
    public double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(double price_product) {
        this.price_product = price_product;
    }


    @Column(name = "dateadded_product")
    public String getDateAdded_product() {
        return dateAdded_product;
    }

    public void setDateAdded_product(String dateAdded_product) {
        this.dateAdded_product = dateAdded_product;
    }

    @Column(name = "manufacturesname_id")
    public String getManufacturesName_product() {
        return manufacturesName_product;
    }

    public void setManufacturesName_product(String manufacturesName_product) {
        this.manufacturesName_product = manufacturesName_product;
    }


    @Column(name = "categoriesname1_id")
    public String getCategoriesName1_product() {
        return categoriesName1_product;
    }

    public void setCategoriesName1_product(String categoriesName1_product) {
        this.categoriesName1_product = categoriesName1_product;
    }


    @Column(name = "categoriesname2_id")
    public String getCategoriesName2_product() {
        return categoriesName2_product;
    }

    public void setCategoriesName2_product(String categoriesName2_product) {
        this.categoriesName2_product = categoriesName2_product;
    }

    @Column(name = "categoriesname3_id")
    public String getCategoriesName3_product() {
        return categoriesName3_product;
    }

    public void setCategoriesName3_product(String categoriesName3_product) {
        this.categoriesName3_product = categoriesName3_product;
    }

    @Column(name = "categoriesname5_id")
    public String getCategoriesName5_product() {
        return categoriesName5_product;
    }

    public void setCategoriesName5_product(String categoriesName5_product) {
        this.categoriesName5_product = categoriesName5_product;
    }

    @Column(name = "categoriesname4_id")
    public String getCategoriesName4_product() {
        return categoriesName4_product;
    }

    public void setCategoriesName4_product(String categoriesName4_product) {
        this.categoriesName4_product = categoriesName4_product;
    }

    @Column(name = "categoriesname6_id")
    public String getCategoriesName6_product() {
        return categoriesName6_product;
    }


    public void setCategoriesName6_product(String categoriesName6_product) {
        this.categoriesName6_product = categoriesName6_product;
    }

    @Column(name = "description_product")
    public String getDescription_product() {
        return description_product;
    }

    public void setDescription_product(String description_product) {
        this.description_product = description_product;
    }

    @Column(name = "url_picture")
    public String getPicture_product() {
        return picture_product;
    }

    public void setPicture_product(String picture_product) {
        this.picture_product = picture_product;
    }


}
