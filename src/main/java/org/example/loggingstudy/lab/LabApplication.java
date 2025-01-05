package org.example.loggingstudy.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LabApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LabApplication.class);
            for (int count = 0; count < 10; count++) {
                logger.error("에러임!! {}", count);
                logger.warn("워닝임!! {}", count);
                logger.info("인포임!! {}", count);
                logger.debug("디버그임!! {}", count);
                logger.trace("트레이스임!! {}" +  count);
            }
    }
}
