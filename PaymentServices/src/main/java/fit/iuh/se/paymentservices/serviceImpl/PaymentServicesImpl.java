package fit.iuh.se.paymentservices.serviceImpl;

import fit.iuh.se.paymentservices.entity.Payment;
import fit.iuh.se.paymentservices.repository.PaymentRepository;
import fit.iuh.se.paymentservices.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment findPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
}
