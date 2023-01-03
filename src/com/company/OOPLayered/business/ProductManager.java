package com.company.OOPLayered.business;

import com.company.OOPLayered.dataAccess.ProductInterface;
import com.company.OOPLayered.entities.Product;
import com.company.OOPLayered.log.Logger;

public class ProductManager {
    private ProductInterface productInterface;
    private Logger[] loggers;

    public ProductManager(ProductInterface productInterface, Logger[] loggers) {
        this.productInterface = productInterface;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı ondan küçük olamaz!");
        }
        productInterface.add(product);
        for (Logger logger : loggers) {
            logger.login(product.getName());
        }

    }

    public void Append(int id, String name, String description, int stockAmount, double price) {

    }
}
