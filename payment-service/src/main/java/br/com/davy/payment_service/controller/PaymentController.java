package br.com.davy.payment_service.controller;

import br.com.davy.payment_service.dto.PaymentRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Project: payment-service
 * Package: br.com.davy.payment_service.controller
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 29/07/2025
 * Time: 08:37
 * <p>
 */
@RestController
@RequestMapping("/api/payments")
@Tag(name = "Payment API", description = "API para processamento de pagamentos")
public class PaymentController {

    @Operation(summary = "Processa um novo pagamento", description = "Recebe e processa uma requisição de pagamento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento processado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados de pagamento inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    @PostMapping
    public ResponseEntity<?> processPayment(@RequestBody PaymentRequest paymentRequest) {
        System.out.println("Recebe pagamento para usuário: " + paymentRequest.userId());
        System.out.println("Valor: " + paymentRequest.amount()) ;

        if(paymentRequest.amount() == null || paymentRequest.amount().compareTo(BigDecimal.ZERO) <= 0){
            return ResponseEntity.badRequest().body(Map.of("message", "Valor do pagamento inválido."));
        }
        System.out.println("Pagamento para o pedido: " + paymentRequest.orderId());

        return ResponseEntity.ok(Map.of(
                "status", "APROVADO",
                "transactionId", java.util.UUID.randomUUID().toString()
        ));
    }
}
