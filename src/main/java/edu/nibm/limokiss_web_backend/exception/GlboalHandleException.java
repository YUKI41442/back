package edu.nibm.limokiss_web_backend.exception;

import edu.nibm.limokiss_web_backend.exception.impl.ErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlboalHandleException{

    @ExceptionHandler(ErrorException.class)
    public ResponseEntity<edu.nibm.limokiss_web_backend.model.ErrorException> notFountExecption(ErrorException ex){
        return ResponseEntity.ok().body(edu.nibm.limokiss_web_backend.model.ErrorException.builder().status("Failed").message(ex.getMessage()).build());
    }

}
