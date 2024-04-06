package br.nicolas.audiolover.modelos;

public class Preferidos {
    public void inclui(Audio a){
        if(a.getClassificacao() >= 9){
            System.out.println(a.getTitulo() +" foi incluido em seus preferidos!");
        }else{
            System.out.println(a.getTitulo() + " Não se esqueça, adicione no mais tarde!");
        }
    }
}
