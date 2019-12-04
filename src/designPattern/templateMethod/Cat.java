package designPattern.templateMethod;

import java.util.Scanner;

public class Cat {

    // write static and instance variables
    static Scanner scanner = new Scanner(System.in);
    public String name;
    public int age;
    public static int counter = scanner.nextInt();

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter+=1;
        hasTooManyCats(Cat.counter);
    }

    public static void main(String[] args) {
        Cat.getNumberOfCats();
        Cat c1 = new Cat("kate", 1);
    }

    public static int getNumberOfCats() {
        hasTooManyCats(Cat.counter);
        System.out.println(counter);
        return counter;
    }


    public static void hasTooManyCats(int counter){
        if (counter > 5){
            System.out.println("You have too many cats");
        }
    }
}