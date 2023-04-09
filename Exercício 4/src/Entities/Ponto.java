package Entities;

import java.time.LocalTime;

public interface Ponto {
    void entrada(LocalTime hora);
    void saida(LocalTime hora);
}