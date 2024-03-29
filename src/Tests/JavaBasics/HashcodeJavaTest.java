/*Если во время работы приложения несколько раз обратиться к методу hashCode()
одного и того же объекта с одним и тем же состоянием, то будет возвращаться одно и то же значение.
А если то же самое сделать после перезапуска приложения, это значение может стать другим?

Да

Пояснение:

Метод hashCode() любого объекта должен удовлетворять требованиям, перечисленным в спецификации:
Если во время работы приложения несколько раз обратиться к одному и тому же объекту, метод hashCode должен постоянно возвращать одно и то же целое число.
Это значение не обязано оставаться неизменным при перезапусках одного и того же приложения.
 */

package Tests.JavaBasics;

public class HashcodeJavaTest {

    public static void main(String args[]) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());
    }
}

