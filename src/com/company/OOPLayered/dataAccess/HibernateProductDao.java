package com.company.OOPLayered.dataAccess;
import com.company.OOPLayered.entities.Product;

public class HibernateProductDao implements ProductInterface{
    public void add(Product product){
        System.out.println("Hibernate İle Veri Tabanına Eklendi");
    }
}
