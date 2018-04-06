/*
Интерфейс SimpleObject
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.


Требования:
1. Класс StringObject должен реализовывать интерфейс SimpleObject.
2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
4. Класс StringObject должен существовать в классе Solution.
5. Класс StringObject должен быть статическим.
 */
package javaCore.level13;

public class task313_lev13_lec11 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject<Object> implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject<Object>();
        }
    }
}
