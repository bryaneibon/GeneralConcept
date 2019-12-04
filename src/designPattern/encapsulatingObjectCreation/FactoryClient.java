package designPattern.encapsulatingObjectCreation;

/**
 * So, a factory is a way of creating objects when one part of a program (a class or a method)
 * creates objects and another one processes them.
 *
 * There are several kinds of factories: static factory, simple factory, factory method and abstract factory.
 * In this topic, we will study only the first two;
 * they are often referred to as idioms rather than design patterns.
 * But the latter two are real design patterns that rely on similar principles as those idioms.
 *
 * Static factory idiom
 * As an example, we will consider the following hierarchy of computers:
 */
class Computer {

    private long ram;
    private long cpu;

    // getters and setters
}

class PC extends Computer {

    // additional members
}

class Laptop extends Computer {

    // additional members
}

/**
 * The static factory is the simplest factory that we can write.
 * It has one static method which creates objects of the hierarchy.
 * The method takes a required type as a string or enum argument and returns
 * a corresponding subclass instance through the base class.
 *
 * To create new computers, we invoke the static factory passing a required type:
 */

class ComputerStaticFactory {

    public static Computer newInstance(String type) {
        if (type.equals("Computer")) {
            return new Computer();
        } else if (type.equals("PC")) {
            return new PC();
        } else if (type.equals("Laptop")) {
            return new Laptop();
        }
        return null; // if not a suitable type
    }
}

/**
 * Depending on the passed type, a suitable branch will work.
 * We also can write the same using switch.
 *
 * The following client code creates two computers: a laptop and a PC:
 */
public class FactoryClient {

    public static void main(String args[]) {

        Computer pc = ComputerStaticFactory.newInstance("PC");
        System.out.println(pc instanceof PC); // prints "true"

        Computer laptop = ComputerStaticFactory.newInstance("Laptop");
        System.out.println(laptop instanceof Laptop); // prints "true"


        ComputerFactory factory = new ComputerFactory();
        Computer pc2 = factory.newInstance("PC");
    }
}

/**
 * There are several possible implementation features:
 *
 * the method newInstance of ComputerStaticFactory takes an enum type to restrict possible values;
 * the method newInstance throws an exception if an unsuitable type is passed instead of returning null;
 * move the method newInstance directly to the base of the hierarchy: Computer class;
 * a factory can have multiple methods that produce instances of different classes or an instance of a default class.
 *
 */


/**
 * Simple factory idiom
 * The simple factory idioms differ from the static factory
 * because the method for creating objects is non-static.
 */
class ComputerFactory {

    // it may contain some fields

    public Computer newInstance(String type) {
        if (type.equals("Computer")) {
            return new Computer();
        } else if (type.equals("PC")) {
            return new PC();
        } else if (type.equals("Laptop")) {
            return new Laptop();
        }
        return null;
    }
}