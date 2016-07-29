package com.jekss.entityes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jekss on 09.07.16.
 */
@Entity
@Table(name = "picture")
public class Picture extends BaseClass implements Serializable {

    private int id_picture;
    private boolean aBoolean_picture;
    private String url_picture;

    private Product product;

    public Picture() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    public int getId() {
        return id_picture;
    }

    public void setId(int id_picture) {
        this.id_picture = id_picture;
    }

    @Column(name = "boolean_picture")
    public boolean isaBoolean_picture() {
        return aBoolean_picture;
    }

    public void setaBoolean_picture(boolean aBoolean_picture) {
        this.aBoolean_picture = aBoolean_picture;
    }

    @Column(name = "url_picture")
    public String getUrl_picture() {
        return url_picture;
    }

    public void setUrl_picture(String url_picture) {
        this.url_picture = url_picture;
    }

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        return url_picture != null ? url_picture.equals(picture.url_picture) : picture.url_picture == null;

    }

    @Override
    public int hashCode() {
        return url_picture != null ? url_picture.hashCode() : 0;
    }
}
