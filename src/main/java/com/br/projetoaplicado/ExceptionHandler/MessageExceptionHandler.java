package com.br.projetoaplicado.ExceptionHandler;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MessageExceptionHandler {

    private Date timestamp;
    private Integer status;
    private String message;

    public MessageExceptionHandler(){
        super();
    }
    public MessageExceptionHandler (Date timestamp, Integer status,String message){
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }


}
