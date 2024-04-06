package br.nicolas.audiolover.main;

import br.nicolas.audiolover.modelos.Musica;
import br.nicolas.audiolover.modelos.Podcast;
import br.nicolas.audiolover.modelos.Preferidos;

public class main {
    public static void main(String[] args) {
        Podcast FlowPod = new Podcast();

        FlowPod.setHost("Igor3K");
        FlowPod.setDesc("Podcast divertido e discontraido sobre tudo!");
        FlowPod.setEpisodio(1);
        FlowPod.setTitulo("FlowPodcast - Fabio Lima");

        for (int i = 0; i < 500; i++) {
            FlowPod.curte();
        }

        for (int i = 0; i < 100; i++) {
            FlowPod.reproduz();
        }

        Musica musica1 = new Musica();

        musica1.setArtista("Cage The Elephant");
        musica1.setAlbum("Melophobia");
        musica1.setGenero("Inidie");
        musica1.setTitulo("Come A Little Closer");


        for (int i = 0; i < 60; i++) {
            musica1.curte();
        }

        for (int i = 0; i < 100; i++) {
            musica1.reproduz();
        }

        Preferidos preferidos = new Preferidos();

        preferidos.inclui(musica1);
        preferidos.inclui(FlowPod);
    }
}
