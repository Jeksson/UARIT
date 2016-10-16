package com.jekss.entityes;

import javax.persistence.*;

/**
 * Created by jekss on 26.09.16.
 */
@Entity
@Table(name = "product")
public class Product{

    private int id;
    private int id_product;
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


    public Product() {
    }

    public Product(int id_product, String name,
                   double price, String dateAdded,
                   String manufactures,
                   String categoriesName1,
                   String categoriesName2,
                   String categoriesName5,
                   String categoriesName3,
                   String categoriesName4,
                   String categoriesName6,
                   String description,
                   String picture) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
        this.dateAdded = dateAdded;
        this.manufactures = manufactures;
        this.categoriesName1 = categoriesName1;
        this.categoriesName2 = categoriesName2;
        this.categoriesName5 = categoriesName5;
        this.categoriesName3 = categoriesName3;
        this.categoriesName4 = categoriesName4;
        this.categoriesName6 = categoriesName6;
        this.description = description;
        this.picture = picture;
    }

    @Id
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

    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateAdded='" + dateAdded + '\'' +
                ", manufactures='" + manufactures + '\'' +
                ", categoriesName1='" + categoriesName1 + '\'' +
                ", categoriesName2='" + categoriesName2 + '\'' +
                ", categoriesName3='" + categoriesName3 + '\'' +
                ", categoriesName5='" + categoriesName5 + '\'' +
                ", categoriesName4='" + categoriesName4 + '\'' +
                ", categoriesName6='" + categoriesName6 + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;


        if (id_product != product.id_product) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (dateAdded != null ? !dateAdded.equals(product.dateAdded) : product.dateAdded != null) return false;
        if (manufactures != null ? !manufactures.equals(product.manufactures) : product.manufactures != null)
            return false;
        if (categoriesName1 != null ? !categoriesName1.equals(product.categoriesName1) : product.categoriesName1 != null)
            return false;
        if (categoriesName2 != null ? !categoriesName2.equals(product.categoriesName2) : product.categoriesName2 != null)
            return false;
        if (categoriesName3 != null ? !categoriesName3.equals(product.categoriesName3) : product.categoriesName3 != null)
            return false;
        if (categoriesName5 != null ? !categoriesName5.equals(product.categoriesName5) : product.categoriesName5 != null)
            return false;
        if (categoriesName4 != null ? !categoriesName4.equals(product.categoriesName4) : product.categoriesName4 != null)
            return false;
        if (categoriesName6 != null ? !categoriesName6.equals(product.categoriesName6) : product.categoriesName6 != null)
            return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        return picture != null ? picture.equals(product.picture) : product.picture == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id_product;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (manufactures != null ? manufactures.hashCode() : 0);
        result = 31 * result + (categoriesName1 != null ? categoriesName1.hashCode() : 0);
        result = 31 * result + (categoriesName2 != null ? categoriesName2.hashCode() : 0);
        result = 31 * result + (categoriesName3 != null ? categoriesName3.hashCode() : 0);
        result = 31 * result + (categoriesName5 != null ? categoriesName5.hashCode() : 0);
        result = 31 * result + (categoriesName4 != null ? categoriesName4.hashCode() : 0);
        result = 31 * result + (categoriesName6 != null ? categoriesName6.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }
}
