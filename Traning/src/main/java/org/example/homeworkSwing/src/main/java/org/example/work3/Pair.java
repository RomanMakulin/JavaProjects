package org.example.work3;

//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//        Класс должен иметь методы getFirst(), getSecond() для получения значений каждого
//        из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары.
public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public void printClassNames(){
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair pair = new Pair("hello", 1);

        System.out.println(pair.getFirst() + " and " + pair.getSecond());
        System.out.println("\n" + pair + "\n");
        pair.printClassNames();
    }
}
