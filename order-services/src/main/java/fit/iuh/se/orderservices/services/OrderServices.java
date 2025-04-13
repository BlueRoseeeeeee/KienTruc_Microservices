package fit.iuh.se.orderservices.services;

import fit.iuh.se.orderservices.entity.Order;

import java.util.List;

public interface OrderServices {
    public List<Order> getAllOrder();
    public Order saveOrder(Order order);
    public Order getOrderById(Long id);
    public void deleteOrder(Long id);

}
