package io.github.cursodsousa.msavaliadorcredito.application.ex;

import lombok.Getter;

@Getter
public class ErroComunicacaoMicroservicesException extends Exception{

    private final Integer status;

    public ErroComunicacaoMicroservicesException(String mensagem, Integer status){
        super(mensagem);
        this.status = status;
    }
}
