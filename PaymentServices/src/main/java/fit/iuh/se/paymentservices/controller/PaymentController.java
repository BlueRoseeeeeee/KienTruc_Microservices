package fit.iuh.se.paymentservices.controller;

import fit.iuh.se.paymentservices.entity.Payment;
import fit.iuh.se.paymentservices.enumerate.PaymentStatus;
import fit.iuh.se.paymentservices.services.PaymentServices;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentServices paymentServices;
    @PostMapping
    public Payment pay(@RequestBody Payment p){
        p.setStatus(PaymentStatus.CONFIRMED);
        return paymentServices.createPayment(p);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Payment> find(@PathVariable Long id) {
        Payment payment = paymentServices.findPaymentById(id);
        if (payment != null) {
            return ResponseEntity.ok(payment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
