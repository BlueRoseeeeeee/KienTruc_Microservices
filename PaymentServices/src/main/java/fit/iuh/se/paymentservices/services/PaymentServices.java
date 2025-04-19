package fit.iuh.se.paymentservices.services;

import fit.iuh.se.paymentservices.entity.Payment;
import fit.iuh.se.paymentservices.repository.PaymentRepository;

import java.util.Optional;

public interface PaymentServices {
 public Payment createPayment(Payment payment);
 public Payment findPaymentById(Long id);
}
