package br.ada.visitService.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.ada.visitService.exception.DefaultExceptionResponse;
import br.ada.visitService.exception.IdNotFoundException;

@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = IdNotFoundException.class)
    protected ResponseEntity<DefaultExceptionResponse> handleNotFoundExceptionHandler(IdNotFoundException idNotFoundException){

        HttpStatus notFound = HttpStatus.NOT_FOUND;
        DefaultExceptionResponse defaultResponse = new DefaultExceptionResponse();
        defaultResponse.setStatusResponse(notFound.value());
        defaultResponse.setMessage(idNotFoundException.getMessage());
        return new ResponseEntity<>(defaultResponse, notFound);
    }

}
