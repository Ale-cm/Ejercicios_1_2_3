package org.example;

public class Saludo {
    private String mesaje;

    public Saludo() {
        System.out.println("pro");
    }

    public Saludo(String mesaje) {
        this.mesaje = mesaje;
    }

    public void imprimirSaludo() {
        System.out.println(this.mesaje);
    }

    public String getMesaje() {
        return mesaje;
    }

    public void setMesaje(String mesaje) {
        this.mesaje = mesaje;
    }
}
