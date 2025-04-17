package fit.iuh.se.orderservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServicesApplication.class, args);
    }

}
