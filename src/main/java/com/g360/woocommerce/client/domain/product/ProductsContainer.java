package com.g360.woocommerce.client.domain.product;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * The json is not only an array. The array is preceded by
 * a key "product"
 *
 * That caused a problem on the gson.fromJson function
 * Therefore the json string is mapped to ProductsContainer
 * instead of Product
 */
public class ProductsContainer {

    private List<Product> products;
    private Gson gson;

    public ProductsContainer() {
        gson = new Gson();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}