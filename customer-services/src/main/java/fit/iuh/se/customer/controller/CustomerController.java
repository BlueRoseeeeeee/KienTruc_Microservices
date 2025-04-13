package fit.iuh.se.customer.controller;

import fit.iuh.se.customer.entity.Customer;
import fit.iuh.se.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @GetMapping("/{id}")
    public Customer getOne(@PathVariable long id) {
        return customerService.findById(id);
    }

}
