package com.chinhpc.model.dto;

import com.chinhpc.model.entity.Colour;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public class ProductForm {
    private Long id;

    private String name;

    private String SKU;

    private Long brandId;

    private Long categoryId;

    private double price;

    private String description;

    private String availability ;

    private Set<Long> colourIds;

    private Set<MultipartFile> files;

    public ProductForm() {
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

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Set<Long> getColourIds() {
        return colourIds;
    }

    public void setColourIds(Set<Long> colourIds) {
        this.colourIds = colourIds;
    }

    public Set<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(Set<MultipartFile> files) {
        this.files = files;
    }
}
