package com.company.OOPLayered.dataAccess;
import com.company.OOPLayered.entities.Product;

public class ProductDao implements ProductInterface{
    public void add(Product product){
     System.out.println("Veri Tabanına Eklendi");
    }
}
