package com.jekss.entityes;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

/**
 * Created by jekss on 13.01.17.
 */
@Entity
@Table(name = "bucket")
public class Bucket {

    private int id;
    private String idSession;
    private Map<Integer, Integer> productListInBucket;
    private boolean statusZayavk;
    private boolean statusObrabotk;
    private Date dataZakaz;

    public Bucket() {
    }

    public Bucket(String idSession) {
        this.idSession = idSession;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "idSession")
    public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    @ElementCollection(fetch = FetchType.EAGER) //храним в коллекции количество товара и id товара
    public Map<Integer, Integer> getProductListInBucket() {
        return productListInBucket;
    }

    public void setProductListInBucket(Map<Integer, Integer> productListInBucket) {
        this.productListInBucket = productListInBucket;
    }

    @Column(name = "statusZak")
    public boolean isStatusZayavk() {
        return statusZayavk;
    }

    public void setStatusZayavk(boolean statusZayavk) {
        this.statusZayavk = statusZayavk;
    }

    @Column(name = "statusObrabtk")
    public boolean isStatusObrabotk() {
        return statusObrabotk;
    }

    public void setStatusObrabotk(boolean statusObrabotk) {
        this.statusObrabotk = statusObrabotk;
    }

    @Column(name = "dataZakaz")
    @Temporal(value = TemporalType.DATE)
    public Date getDataZakaz() {
        return dataZakaz;
    }

    public void setDataZakaz(Date dataZakaz) {
        this.dataZakaz = dataZakaz;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "id=" + id +
                ", idSession=" + idSession +
                ", productListInBucket=" + productListInBucket +
                ", statusZayavk=" + statusZayavk +
                ", statusObrabotk=" + statusObrabotk +
                ", dataZakaz=" + dataZakaz +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bucket bucket = (Bucket) o;

        if (id != bucket.id) return false;
        if (idSession != bucket.idSession) return false;
        if (statusZayavk != bucket.statusZayavk) return false;
        if (statusObrabotk != bucket.statusObrabotk) return false;
        if (productListInBucket != null ? !productListInBucket.equals(bucket.productListInBucket) : bucket.productListInBucket != null)
            return false;
        return dataZakaz != null ? dataZakaz.equals(bucket.dataZakaz) : bucket.dataZakaz == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idSession!= null ? idSession.hashCode() : 0);
        result = 31 * result + (productListInBucket != null ? productListInBucket.hashCode() : 0);
        result = 31 * result + (statusZayavk ? 1 : 0);
        result = 31 * result + (statusObrabotk ? 1 : 0);
        result = 31 * result + (dataZakaz != null ? dataZakaz.hashCode() : 0);
        return result;
    }
}
