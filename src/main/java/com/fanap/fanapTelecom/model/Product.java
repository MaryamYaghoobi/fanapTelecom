package com.fanap.fanapTelecom.model;

import javax.persistence.*;


@Entity
@Table(name = "interview_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Integer price;


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getPrice() {

        return price;
    }

    public void setPrice(Integer price) {

        this.price = price;
    }


    @Override
    public String toString() {

        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
