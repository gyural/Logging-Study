package org.example.loggingstudy.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void purchaseProduct(String userId, String productId) {
        try {
            // 상품 구매 로직
            boolean success = processPurchase(userId, productId);
            if (true) {
                // message에 상세 정보를 추가
                throw new IllegalArgumentException(String.format(
                        "상품 구매 실패 - UserId: %s, ProductId: %s", userId, productId
                ));
            }
        } catch (Exception e) {
            // 추가 로깅 (필요 시)
            System.out.println("Exception in purchaseProduct: " + e.getMessage());
            throw e; // 예외를 다시 던짐
        }
    }

    private boolean processPurchase(String userId, String productId) {
        // 예제 로직: 구매 실패
        return false;
    }
}
