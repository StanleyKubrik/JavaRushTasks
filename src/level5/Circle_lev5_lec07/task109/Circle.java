/*
Основа колеса
В классе Circle создать конструктор который проинициализирует все переменные класса.
В конструкторе должно быть три аргумента.


Требования:
1. У класса Circle должны быть переменные x, y и r с типом double.
2. У класса должен быть один конструктор.
3. Конструктор должен быть public.
4. Конструктор должен иметь три параметра типа double.
5. Конструктор должен проинициализировать все переменные класса.
 */
package level5.Circle_lev5_lec07.task109;

public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle (double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static void main(String[] args) {

    }
}