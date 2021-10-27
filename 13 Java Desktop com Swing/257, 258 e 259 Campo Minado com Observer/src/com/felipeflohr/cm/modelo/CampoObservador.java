package com.felipeflohr.cm.modelo;

public interface CampoObservador {

    // Quando o evento aconteceu, será necessário dizer em qual campo aconteceu e
    // qual foi o tipo de evento
    void eventoOcorreu(Campo campo, CampoEvento evento);

}
