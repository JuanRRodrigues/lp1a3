package Entities;

import java.time.LocalDateTime;

public interface Ponto {
    void entrada(LocalDateTime hora);
    void saida(LocalDateTime hora);
}