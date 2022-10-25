package com.company.OOP;

public class CustomerService {
    CustomerManager customer = new CustomerManager();

    public void add(String name, String surname, int id, int age){
        customer.setUserName(name);
        customer.setSurname(surname);
        customer.setId(id);
        customer.setAge(age);
        System.out.println(customer.getUserName());
    }
    public void delete(int id){
        customer.setId(id);
    }
    public void update(String name, String surname, int age){
        customer.setAge(age);
        customer.setUserName(name);
        customer.setSurname(surname);

    }

}
