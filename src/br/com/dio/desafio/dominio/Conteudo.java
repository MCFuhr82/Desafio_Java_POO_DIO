package br.com.dio.desafio.dominio;

public abstract class Conteudo { //abstract significa que a classa não pode ser instanciada.

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo() {
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();

}
