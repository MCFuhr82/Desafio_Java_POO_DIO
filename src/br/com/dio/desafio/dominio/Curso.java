package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{ //HERANÇA. Usando extends, a classe Curso herda os atributos e metodos da classe abstrata Conteudo.

    private int cargaHoraria; //usando modificadores de acesso private para atributos. ENCAPSULAMENTO

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override //POLIMORFISMO. O mesmo método retorna um valor diferente, de acordo com a lógico implantada na classe.
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
