public class Fraction {
    private int numerator;   // числитель
    private int denominator; // знаменатель

    // Конструктор для создания дроби
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Приводим дробь к упрощённому виду
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator)); // НОД числителя и знаменателя
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { // Переносим знак к числителю
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для нахождения наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Строковое представление дроби
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Сложение с другой дробью
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Вычитание другой дроби
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Умножение на другую дробь
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Деление на другую дробь
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Сложение с целым числом
    public Fraction add(int number) {
        return this.add(new Fraction(number, 1));
    }

    // Вычитание целого числа
    public Fraction subtract(int number) {
        return this.subtract(new Fraction(number, 1));
    }

    // Умножение на целое число
    public Fraction multiply(int number) {
        return this.multiply(new Fraction(number, 1));
    }

    // Деление на целое число
    public Fraction divide(int number) {
        return this.divide(new Fraction(number, 1));
    }
}
