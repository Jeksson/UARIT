package com.jekss.entityes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jekss on 09.07.16.
 */
@Entity
@Table(name = "categoriesname5")
public class CategoriesName5 extends BaseClass implements Serializable {
    private int id_categories;
    private String name_categories;


    public CategoriesName5() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 6, nullable = false)
    public int getId() {
        return id_categories;
    }

    public void setId(int id_categories) {
        this.id_categories = id_categories;
    }

    @Column(name = "name_categories")
    public String getName() {
        return name_categories;
    }

    public void setName(String name_categories) {
        this.name_categories = name_categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesName5 that = (CategoriesName5) o;

        return name_categories != null ? name_categories.equals(that.name_categories) : that.name_categories == null;

    }

    @Override
    public int hashCode() {
        return name_categories != null ? name_categories.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CategoriesName5{" +
                "id_categories=" + id_categories +
                ", name_categories='" + name_categories + '\'' +
                '}';
    }
}
