/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.
 */
package javaSyntax.level7;

import java.io.*;

public class task145_lev7_lec04 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bArr = new int[20];
        int[] smArr1 = new int[10];
        int[] smArr2 = new int[10];

        for (int i = 0; i < bArr.length; i++){
            bArr[i] = Integer.valueOf(reader.readLine());
        }

        for (int x = 0; x < 10; x++){
            smArr1[x] = bArr[x];
        }

        for (int y = 0; y < 10; y++){
            smArr2[y] = bArr[y + 10];
        }

        for (int n:smArr2){
            System.out.println(n);
        }
    }
}
