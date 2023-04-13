package org.openbootcamp;

public class TemaTresIntroProgra {
    public static int suma(int num1,int num2,int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        int resultado = suma(15,14,20);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        System.out.println(miCoche.numPuertas);
    }
}

class Coche {
    public int numPuertas = 0;
    public void AnadirPuerta(){
        this.numPuertas++;
    }
}
