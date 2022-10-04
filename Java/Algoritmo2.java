public class Algoritmo2 {

    public int Complejidad(int numero) {
        long tiempoinicial = System.nanoTime();
        int Suma = 0;
        Suma =(numero * (numero + 1)) / 2;

        long tiempofinal = System.nanoTime();

        long tiempototal = tiempofinal - tiempoinicial;
        System.out.println("El tiempo que tarda el algoritmo en ejecutarse en nanosegundos es: " + tiempototal);
        System.out.println("La suma es: "+ Suma);
        return Suma;
    }
    public static void main(String[] args){
        Algoritmo2 com = new Algoritmo2();
        System.out.println(com.Complejidad(10000000));

    }
}