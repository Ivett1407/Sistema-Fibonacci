public class SistemaFibonacci {
        public static void main(String[] args) {

            int n = 5;
            int a = 0;
            int b = 1;
            int c = 0;
            int[] arreglo = new int[n];

            for (int i = 1; i <= n; i++) {
                System.out.println(a);
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
// En programacion se lee de arriba para abajo y de derecha a izquierda
// i = 3
// a = 3
// b = 5
// c = 5
//imrprimir = 0,1,1,2,3

