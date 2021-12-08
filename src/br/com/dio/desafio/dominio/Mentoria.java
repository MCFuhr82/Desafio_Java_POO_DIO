package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ //HERANÇA. Usando extends, a classe Mentoria herda os atributos e metodos da classe abstrata Conteudo.

    private LocalDate data; //usando modificadores de acesso private para atributos. ENCAPSULAMENTO

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override //POLIMORFISMO. O mesmo método retorna um valor diferente, de acordo com a lógico implantada na classe.
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
