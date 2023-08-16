package br.com.etecia.myapp;

public class Jogadoras {

    public int getImage;
    private String nome;
    private String posiçao;
    private String time;


    public Jogadoras(int getImage, String nome, String posiçao, String time) {
        this.getImage = getImage;
        this.nome = nome;
        this.posiçao = posiçao;
        this.time = time;
    }

    public int getGetImage() {
        return getImage;
    }

    public void setGetImage(int getImage) {
        this.getImage = getImage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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


