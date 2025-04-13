package fit.iuh.se.orderservices.serviceImpl;

import fit.iuh.se.orderservices.entity.Order;
import fit.iuh.se.orderservices.repository.OrderRepository;
import fit.iuh.se.orderservices.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderServices {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrder() {
        return List.of();
    }

    @Override
    public Order saveOrder(@RequestBody Order order) {
        return orderRepository.save(order) ;
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);

    }
}
