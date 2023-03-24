package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ParkingSpotExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ParkingSpotErrorResponse> parkingSpotNotFoundHandler(
            ParkingSpotNotFoundException exception,
            HttpServletRequest req) {

        ParkingSpotErrorResponse error = new ParkingSpotErrorResponse(
                ZonedDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                req.getRequestURI(),
                exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}
