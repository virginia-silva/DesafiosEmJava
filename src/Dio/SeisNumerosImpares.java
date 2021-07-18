package Dio;

/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Exemplo de Entrada
8

Exemplo de Sáida
9
11
13
15
17
19
*/

import java.io.IOException;import java.util.Locale;
import java.util.Scanner;
public class SeisNumerosImpares {

        public static void main(String[] args)  throws IOException {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            Locale.setDefault(new Locale("en", "US"));

            int x, aux, contaimpar = 0;

            x = sc.nextInt();
            aux = x;

            while (contaimpar != 6) {
                if (aux % 2!= 0){
                    contaimpar = contaimpar + 1;
                    System.out.println(aux);
                }
                aux = aux + 1;
            }
            sc.close();
        }
    }

