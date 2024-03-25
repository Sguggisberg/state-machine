package ch.guggisberg.experiment.service;

import ch.guggisberg.experiment.domain.Payment;
import ch.guggisberg.experiment.domain.PaymentEvent;
import ch.guggisberg.experiment.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
