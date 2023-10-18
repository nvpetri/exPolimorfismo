package br.senai.sp.jandira.model;

public class Aviao implements Veiculo{
    @Override
    public void freiar() {
        System.out.println("O avião está freiando");
    }

    @Override
    public void acelerar() {
        System.out.println("O avião está acelerando");
    }

    @Override
    public void buzinar() {
        System.out.println("O avião está buzinando");
    }
}
