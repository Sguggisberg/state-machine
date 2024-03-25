package ch.guggisberg.experiment.repository;


import ch.guggisberg.experiment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}