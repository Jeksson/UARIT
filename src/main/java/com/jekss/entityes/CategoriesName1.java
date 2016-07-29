package com.jekss.entityes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jekss on 09.07.16.
 */
@Entity
@Table(name = "categoriesname1")
public class CategoriesName1 extends BaseClass implements Serializable {
    private int id;
    private String name;

    public CategoriesName1() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 6)
    public int getId() {
        return id;
    }

    public void setId(int id_categories) {
        this.id = id_categories;
    }

    @Column(name = "name_categories")
    public String getName() {
        return name;
    }

    public void setName(String name_categories) {
        this.name = name_categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesName1 that = (CategoriesName1) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CategoriesName1{" +
                "id_categories=" + id +
                ", name_categories='" + name + '\'' +
                '}';
    }
}
