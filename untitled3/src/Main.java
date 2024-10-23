import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();
        // Создание объектов класса Person (в maine) Задача 1.2
        out.print("Задача 1.2 \nЧеловек\n");

        Person cleopatra = new Person("Клеопатра", 152);
        Person pushkin = new Person("Пушкин", 167);
        Person vladimir = new Person("Владимир", 189);

        // Вывод на экран
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(vladimir);
        out.print("\n");

        // Задача 1.3
        out.print("Задача 1.3 \nИмена\n");

        Name name1 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name2 = new Name("Маяковский", "Владимир");
        Name name3 = new Name("Клеопатра");

        System.out.println(name1); // Пушкин Александр Сергеевич
        System.out.println(name2); // Маяковский Владимир
        System.out.println(name3); // Клеопатра
        out.print("\n");

        //Задача 2.2
        out.print("Задача 2.2 \nЧеловек с именем\n");

        Person person1 = new Person(name1, 167);
        Person person2 = new Person(name2, 189);
        Person person3 = new Person(name3, 152);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        out.print("\n");

        // Создание городов Задача 3.3
        out.print("Задача 3.3 \nГорода\n");
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Добавление путей между городами с указанной стоимостью
        A.addRoute(B, 5);
        A.addRoute(D, 6);
        B.addRoute(A, 5);
        B.addRoute(C, 3);
        B.addRoute(F, 1);
        C.addRoute(B, 3);
        C.addRoute(D, 4);
        D.addRoute(C, 4);
        D.addRoute(A, 6);
        E.addRoute(D, 2);
        E.addRoute(F, 2);
        F.addRoute(A, 1);
        F.addRoute(E, 2);

        // Вывод информации о городах и путях
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        out.print("\n");

        // Создание нескольких дробей Задача 5.5
        out.print("Задача 5.5 \nДроби\n");
        // Ввод данных для первой дроби
        System.out.print("Введите числитель первой дроби: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Введите знаменатель первой дроби: ");
        int denominator1 = scanner.nextInt();
        Fraction f1 = new Fraction(numerator1, denominator1);

        // Ввод данных для второй дроби
        System.out.print("Введите числитель второй дроби: ");
        int numerator2 = scanner.nextInt();
        System.out.print("Введите знаменатель второй дроби: ");
        int denominator2 = scanner.nextInt();
        Fraction f2 = new Fraction(numerator2, denominator2);

        // Ввод данных для третьей дроби
        System.out.print("Введите числитель третьей дроби: ");
        int numerator3 = scanner.nextInt();
        System.out.print("Введите знаменатель третьей дроби: ");
        int denominator3 = scanner.nextInt();
        Fraction f3 = new Fraction(numerator3, denominator3);

        // Вывод введённых дробей
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        // Комплексное выражение: f1.sum(f2).div(f3).minus(5)
        Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println(f1 + " + " + f2 + " / " + f3 + " - 5 = " + result); 
        out.print("\n");
    }
}