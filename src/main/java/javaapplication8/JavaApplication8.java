package javaapplication8;/*Задача 1.1.1 Создайте новый проект и запустите в main распечатку. Должен получиться примерно такой код:*/

/*Задача 1.1.2-а Запустите в main следующий код. Подумайте, почему деление даёт ноль, хотя это просто дробь
меньше единицы. Замените у всех переменных тип int на double и посмотрите, что будет.
Теперь дробь будет ненулевой и это правильно.*/

public class JavaApplication8 {
    public static void main(String[] args) {
        System.out.println("Поздравляю Председателя Свободной КНДР с успешным запуском в епонском море!");

        int x = 5;
        int y = 7;
        int z = 0;

        z = x + y; // помещаем в z значение суммы 5+7=12
        System.out.println(z);
        z = x - y; // помещаем в z значение разности 5-7=-2
        System.out.println(z);
        z = x * y; // помещаем в z значение произведения 5*7=35
        System.out.println(z);
        z = x / y; // помещаем в z значение произведения 5/7=0, так как тип int
        System.out.println(z);
    }
}
