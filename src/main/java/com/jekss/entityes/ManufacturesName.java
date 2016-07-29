package com.jekss.entityes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jekss on 09.07.16.
 */
@Entity
@Table(name = "manufacturesname")
public class ManufacturesName extends BaseClass implements Serializable {

    private int id;
    private String name;

    public ManufacturesName() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id_manufactures) {
        this.id = id_manufactures;
    }

    @Column(name = "name_manufactures", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name_manufactures) {
        this.name = name_manufactures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManufacturesName that = (ManufacturesName) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ManufacturesName{" +
                "id_manufactures=" + id +
                ", name_manufactures='" + name + '\'' +
                '}';
    }
}
