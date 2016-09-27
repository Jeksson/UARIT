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
    private String name;
    private double price;
    private String dateAdded;
    private String manufactures;
    private String categoriesName1;
    private String categoriesName2;
    private String categoriesName3;
    private String categoriesName5;
    private String categoriesName4;
    private String categoriesName6;
    private String description;
    private String picture;




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


    @Column(name = "name", length = 300)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Column(name = "dateadded")
    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Column(name = "manufactures")
    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }


    @Column(name = "categoriesName1")
    public String getCategoriesName1() {
        return categoriesName1;
    }

    public void setCategoriesName1(String categoriesName1) {
        this.categoriesName1 = categoriesName1;
    }


    @Column(name = "categoriesname2")
    public String getCategoriesName2() {
        return categoriesName2;
    }

    public void setCategoriesName2(String categoriesName2) {
        this.categoriesName2 = categoriesName2;
    }

    @Column(name = "categoriesname3")
    public String getCategoriesName3() {
        return categoriesName3;
    }

    public void setCategoriesName3(String categoriesName3) {
        this.categoriesName3 = categoriesName3;
    }

    @Column(name = "categoriesname5")
    public String getCategoriesName5() {
        return categoriesName5;
    }

    public void setCategoriesName5(String categoriesName5) {
        this.categoriesName5 = categoriesName5;
    }

    @Column(name = "categoriesname4")
    public String getCategoriesName4() {
        return categoriesName4;
    }

    public void setCategoriesName4(String categoriesName4) {
        this.categoriesName4 = categoriesName4;
    }

    @Column(name = "categoriesname6")
    public String getCategoriesName6() {
        return categoriesName6;
    }


    public void setCategoriesName6(String categoriesName6) {
        this.categoriesName6 = categoriesName6;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "url_picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}
