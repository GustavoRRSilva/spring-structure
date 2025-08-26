package io.github.gustavorrsilva.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHrv extends Carro{

    public HondaHrv(String modelo) {
        super(modelo);
        setModelo("HRV");
        setCor(Color.black);
        setMontadora(Montadora.HONDA);
    }
}
