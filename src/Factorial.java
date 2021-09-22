public class Factorial {
    /**
     * 5! = 5 * 4 * 3 * 2 * 1
     *
     * */
    public static int factorialSinRecursividad(int numero){
        int factorial = 1;

        for (int i = numero; i > 0 ; i--) {
            factorial= factorial * i;
        }

        return factorial;
    }


    /**
     * 5! = 5 * 4 * 3 * 2 * 1
     * 4! = 4 * 3 * 2 * 1
     * 3! = 3 * 2 * 1
     * 2! = 2 * 1
     * 1! = 1
     *
     * 5! = 5 * 4!
     * 4! = 4 * 3!
     * 3! = 3 * 2!
     * 2! = 2 * 1!
     * 1! = 1 (caso base  la condicion de culminacion)
     * */
    public static int factorial(int numero) {
        //codigo fuente
        int factorial;


        if (numero == 1) { //CASP BASE
            factorial = numero;
        } else {
            factorial = numero * factorial(numero - 1);
        }
        //System.out.println(factorial);


        return factorial;
    }


    /**MAXIMO COMUN DIVISOR (MCD)
     * a=412 b=184
     * */

    public static int mcd(int a,int b){
        int mcd;
        if (a==b){
            //caso base
            mcd=b;
        }else {
            if (a>b){
                a= a-b;
            }else{
                b=b-a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }

    /*suma de los elementos de un vector
    * vector = {2, 4, 6}
    * suma = 2 + {4, 6}
    * suma = 4 + {6}
    * suma = 6(caso base)*/

    public  static  int sumaVector(int[] vector, int indice){
        int suma;
        if (indice == vector.length - 1){
            //caso base
            suma = vector[indice];
        }else{
            suma = vector[indice] + sumaVector(vector,indice + 1);
        }
        return suma;
    }

    //INVERTIR PALABRA
    public static String invertirPalabra(String palabra){
        if (palabra.length() == 1){
            return palabra;
        }
        return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
    }
}
