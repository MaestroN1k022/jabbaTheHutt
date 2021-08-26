package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.exceptionsHandler;

import lombok.Getter;

import java.time.Instant;

@Getter
public class ErroPadrao {
    private Instant timestamp;
    private int code;
    private String mensagem;

    public ErroPadrao(int code, String mensagem) {
        timestamp = Instant.now();
        this.code = code;
        this.mensagem = mensagem;
    }
}
