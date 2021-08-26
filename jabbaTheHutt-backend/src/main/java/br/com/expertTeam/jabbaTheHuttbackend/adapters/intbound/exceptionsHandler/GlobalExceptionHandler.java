package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.exceptionsHandler;

import br.com.expertTeam.jabbaTheHuttbackend.core.exceptions.NaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<ErroPadrao> naoExistente(NaoEncontradoException exception){
        ErroPadrao erro = new ErroPadrao(HttpStatus.NOT_FOUND.value(), exception.getMessage());
        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
    }
}
