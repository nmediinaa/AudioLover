package br.nicolas.audiolover.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducao++;
    }
}
