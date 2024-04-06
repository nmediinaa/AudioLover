package br.nicolas.audiolover.modelos;

public class Podcast extends Audio{
    private String host;
    private String desc;

    private int episodio;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() >= 500){
            return 10;
        }else{
            return 8;
        }
    }
}
