package javaCore.level15;

import java.io.*;

public class NOtask366_lev15_lec12_parse_hard_patterns {
    public static void main(String[] args)  throws IOException{
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();     //читаем строку из консоли
        String txt = input.replaceAll("^(.+\\?)","");                       // удаляем все до знака вопроса
        String[] txtArray = txt.split("&+");                                  //создаем массив строк из строки txt, каждый элемент массива это выражение между знаками &

        for (String s : txtArray){                          // печатаем каждый эл-т массива до знака =
            String tmp = s.replaceAll("=.+$","");
            System.out.print(tmp + " ");
        }

        System.out.println();                               //переходим на следующую строку
        String value = "";                                  // значение параметра obj

        for (String s : txtArray){                                  //если какой то эл-т массива содержит "obj",
            if (s.contains("obj")){
                value = s.replaceAll("^(.+=)","");
            }
        }

        //записываем все что после знака = в поле value
        try {
            alert(Double.parseDouble(value));               //пробуем value как DOUBLE
        } catch (NumberFormatException e) {                 //если поймали ошибку,
            alert(value);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
