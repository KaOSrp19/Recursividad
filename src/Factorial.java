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


}
