package org.example.loggingstudy.controller;

import lombok.RequiredArgsConstructor;
import org.example.loggingstudy.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/purchase")
    public ResponseEntity<String> purchaseProduct(@RequestParam String userId, @RequestParam String productId) {
        productService.purchaseProduct(userId, productId);
        return ResponseEntity.ok("Purchase successful");
    }
}
