package com.nikischultz.salesapp.domain;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Sales {

    @Id @GeneratedValue
    private Integer id;

    @NonNull
    private String salesType;

    public Sales() {

    }

    public Sales(String salesType) {
        this.salesType = salesType;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", salesType='" + salesType + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return Objects.equals(id, sales.id) &&
                Objects.equals(salesType, sales.salesType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, salesType);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType;
    }
}
