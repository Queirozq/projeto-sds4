package com.devsuperior.dsvendas.DTO;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO() {
    }

    public SellerDTO(Seller obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
