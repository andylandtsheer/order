package be.landtlord.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionController {
    private Logger logger = LoggerFactory.getLogger(ExceptionController.class);
}
