public class Main {
    public static void main(String[] args) {
        suma(15, 30, 45);
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche {
    public int puertas = 4;

    public void SumarPuertas() {
        this.puertas++;
        }
    }

