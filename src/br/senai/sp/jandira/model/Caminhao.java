package br.senai.sp.jandira.model;

public class Caminhao implements Veiculo{
    @Override
    public void freiar() {
        System.out.println("O caminhão está freiando");
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
    }

    @Override
    public void buzinar() {
        System.out.println("O caminhão está buzinando");
    }
}
