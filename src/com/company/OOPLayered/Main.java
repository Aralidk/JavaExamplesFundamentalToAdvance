package com.company.OOPLayered;
import com.company.OOPLayered.business.ProductManager;
import com.company.OOPLayered.dataAccess.ProductDao;
import com.company.OOPLayered.entities.Product;
import com.company.OOPLayered.log.DatabaseLogger;
import com.company.OOPLayered.log.FileLogger;
import com.company.OOPLayered.log.Logger;
import com.company.OOPLayered.log.MailLogger;

public class Main {
    public static void main(String[] args) throws  Exception{
        Product product = new Product(1, "IPhone Xr", 100000);
        Logger[] logger = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(new ProductDao(), logger);
        productManager.add(product);

    }
}
