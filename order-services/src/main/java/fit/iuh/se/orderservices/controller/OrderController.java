package fit.iuh.se.orderservices.controller;

import fit.iuh.se.orderservices.entity.Order;
import fit.iuh.se.orderservices.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderServices orderServices;
    @GetMapping
    public List<Order> getOrders() {
        return orderServices.getAllOrder();
    }
    @PostMapping
    public Order create(@RequestBody Order order){
        return orderServices.saveOrder(order);
    }
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id){
        return orderServices.getOrderById(id);
    }

}

