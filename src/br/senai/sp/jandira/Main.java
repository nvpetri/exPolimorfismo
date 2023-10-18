package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aviao;
import br.senai.sp.jandira.model.Caminhao;
import br.senai.sp.jandira.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo caminhao1 = new Caminhao();
        Veiculo aviao1 = new Aviao();

        caminhao1.acelerar();
        aviao1.freiar();
        aviao1.buzinar();
        caminhao1.freiar();
        aviao1.acelerar();
        caminhao1.buzinar();
        caminhao1.acelerar();
    }

}
