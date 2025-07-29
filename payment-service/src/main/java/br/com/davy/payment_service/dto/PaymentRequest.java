package br.com.davy.payment_service.dto;

import java.math.BigDecimal;

/**
 * Project: payment-service
 * Package: br.com.davy.payment_service.dto
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 29/07/2025
 * Time: 08:34
 */

public record PaymentRequest(Long userId, String orderId, BigDecimal amount) {
}
