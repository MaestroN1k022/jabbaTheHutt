package br.com.expertTeam.jabbaTheHuttbackend.core.exceptions;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(String message) {
        super(message);
    }
}