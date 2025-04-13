package fit.iuh.se.customer.services;

import fit.iuh.se.customer.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(long id);
    public Customer save(Customer customer);

}
