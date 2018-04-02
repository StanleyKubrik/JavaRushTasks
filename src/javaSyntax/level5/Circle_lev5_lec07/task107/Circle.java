/*
Максимум конструкторов
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.


Требования:
1. У класса должно быть хотя бы три переменные.
2. У класса должен быть конструктор по умолчанию.
3. У класса должен быть хотя бы один конструктор.
4. У класса должно быть хотя бы два конструктора.
5. У класса должно быть хотя бы три конструктора.
6. У класса должно быть хотя бы четыре конструктора.
*/
package javaSyntax.level5.Circle_lev5_lec07.task107;

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (double x, double y){
        this.x = x;
        this.y = y;
        radius = 10;
    }

    public Circle (double radius){
        this.radius = radius;
        x = 5;
        y = 8;
    }

    public Circle (){
        radius = 10;
        x = 7;
        y = 7;
    }

    public static void main(String[] args) {

    }
}
