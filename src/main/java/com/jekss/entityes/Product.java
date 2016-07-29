package com.jekss.entityes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jekss on 09.07.16.
 */
@Entity
@Table(name = "product")
public class Product extends BaseClass implements Serializable {
    private int id_product;
    private int id;
    private String name_product;
    private double price_product;
    private String dateAdded_product;
    private ManufacturesName manufacturesName_product;
    private CategoriesName1 categoriesName1_product;
    private CategoriesName2 categoriesName2_product;
    private CategoriesName3 categoriesName3_product;
    private CategoriesName4 categoriesName4_product;
    private CategoriesName5 categoriesName5_product;
    private CategoriesName6 categoriesName6_product;
    private String description_product;
    private Picture picture_product;
    private String coment_product;


    public Product() {
    }

    public Product(int id_product,
                   String name_product,
                   double price_product,
                   ManufacturesName manufacturesName_product) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.manufacturesName_product = manufacturesName_product;
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

    @Column(name = "id_product")
    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    @Column(name = "name_product")
    public String getName() {
        return name_product;
    }

    public void setName(String name_product) {
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "manufacturesname_id")
    public ManufacturesName getManufacturesName_product() {
        return manufacturesName_product;
    }

    public void setManufacturesName_product(ManufacturesName manufacturesName_product) {
        this.manufacturesName_product = manufacturesName_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname1_id")
    public CategoriesName1 getCategoriesName1_product() {
        return categoriesName1_product;
    }

    public void setCategoriesName1_product(CategoriesName1 categoriesName1_product) {
        this.categoriesName1_product = categoriesName1_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname2_id")
    public CategoriesName2 getCategoriesName2_product() {
        return categoriesName2_product;
    }

    public void setCategoriesName2_product(CategoriesName2 categoriesName2_product) {
        this.categoriesName2_product = categoriesName2_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname3_id")
    public CategoriesName3 getCategoriesName3_product() {
        return categoriesName3_product;
    }

    public void setCategoriesName3_product(CategoriesName3 categoriesName3_product) {
        this.categoriesName3_product = categoriesName3_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname4_id")
    public CategoriesName4 getCategoriesName4_product() {
        return categoriesName4_product;
    }

    public void setCategoriesName4_product(CategoriesName4 categoriesName4_product) {
        this.categoriesName4_product = categoriesName4_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname5_id")
    public CategoriesName5 getCategoriesName5_product() {
        return categoriesName5_product;
    }

    public void setCategoriesName5_product(CategoriesName5 categoriesName5_product) {
        this.categoriesName5_product = categoriesName5_product;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "categoriesname6_id")
    public CategoriesName6 getCategoriesName6_product() {
        return categoriesName6_product;
    }

    public void setCategoriesName6_product(CategoriesName6 categoriesName6_product) {
        this.categoriesName6_product = categoriesName6_product;
    }

    @Column(name = "description_product")
    public String getDescription_product() {
        return description_product;
    }

    public void setDescription_product(String description_product) {
        this.description_product = description_product;
    }

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Picture getPicture_product() {
        return picture_product;
    }

    public void setPicture_product(Picture picture_product) {
        this.picture_product = picture_product;
    }

    @Column(name = "coment_product")
    public String getComent_product() {
        return coment_product;
    }

    public void setComent_product(String coment_product) {
        this.coment_product = coment_product;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id_product != product.id_product) return false;
        if (name_product != null ? !name_product.equals(product.name_product) : product.name_product != null)
            return false;
        return coment_product != null ? coment_product.equals(product.coment_product) : product.coment_product == null;

    }

    @Override
    public int hashCode() {
        int result = id_product;
        result = 31 * result + (name_product != null ? name_product.hashCode() : 0);
        result = 31 * result + (coment_product != null ? coment_product.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", id=" + id +
                ", name_product='" + name_product + '\'' +
                ", price_product=" + price_product +
                '}';
    }
}
