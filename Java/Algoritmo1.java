public class Algoritmo1 {

    public int Complejidad(int numero) {
        long tiempoinicial = System.nanoTime();
        int Suma = 0;
        for (float a = 1; a < numero+1; a++){
            Suma += a;
        }

        long tiempofinal = System.nanoTime();

        long tiempototal = tiempofinal - tiempoinicial;
        System.out.println("\"El tiempo que tarda el algoritmo en ejecutarse en nanosegundos es: " + tiempototal);
        System.out.println("La suma es: "+ Suma);
        return Suma;
    }
    public static void main(String[] args){
        Algoritmo1 com = new Algoritmo1();
        System.out.println(com.Complejidad(10000000));

    }
}