public class partedos {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.añadirPuerta();
        miCoche.añadirPuerta();
        miCoche.añadirPuerta();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 0;

    public void añadirPuerta() {
        this.puertas++;
    }
}
