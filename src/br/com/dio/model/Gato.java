package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String none;
    private String cor;
    private Integer idade;

    public Gato(String none, String cor, Integer idade) {
        this.none = none;
        this.cor = cor;
        this.idade = idade;
    }

    public Gato() {

    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(none, gato.none) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(none, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "none='" + none + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
