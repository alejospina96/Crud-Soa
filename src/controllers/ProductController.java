/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Product;

/**
 *
 * @author Estudiante
 */
public class ProductController {

    private final ArrayList<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();
    }

    public boolean create(long id, String description, double value) {
        if (read(id) == null) {
            products.add(new Product(id, description, value));
            return true;
        }
        return false;
    }

    public Product read(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product update(long lastId, long id, String description, double value) {
        Product p = read(lastId);
        Product lastProduct = p;
        p.setId(id);
        p.setDescription(description);
        p.setValue(value);
        return lastProduct;
    }

    public Product destroy(long id) {
        Product p = read(id);
        products.remove(p);
        return p;
    }

    public ArrayList<Product> list() {
        return this.products;
    }
}
