package br.com.etecia.myapp;

public class Jogadoras {

    private String nome;
    private String posiçao;
    private String time;

    public Jogadoras(String nome, String posiçao, String time) {
        this.nome = nome;
        this.posiçao = posiçao;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPosiçao() {
        return posiçao;
    }

    public void setPosiçao(String posiçao) {
        this.posiçao = posiçao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
