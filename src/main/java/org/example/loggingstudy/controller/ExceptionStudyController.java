package org.example.loggingstudy.controller;

import ch.qos.logback.classic.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ExceptionStudyController {

    @PostMapping("/exception")
    public void exceptionTest() throws Exception{
        throw new Exception();
    }

    //private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    //@ExceptionHandler(value = Exception.class)
    //public ResponseEntity<Map<String, String>> ExceptionHandler(Exception e) {
    //    HttpHeaders responseHeaders = new HttpHeaders();
    //    // responseHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
    //    HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
    //
    //    Logger.info(e.getMessage());
    //    LOGGER.info("Controller 내 ExceptionHandler 호출");
    //
    //    Map<String, String> map = new HashMap<>();
    //    map.put("error type", httpStatus.getReasonPhrase());
    //    map.put("code", "400");
    //    map.put("message", "에러 발생");
    //
    //    return new ResponseEntity<>(map, responseHeaders, httpStatus);
    //}
}
