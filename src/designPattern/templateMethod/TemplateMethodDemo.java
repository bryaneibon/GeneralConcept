package designPattern.templateMethod;

/**
 * In the Demo class we create programmer and actor instances and call the template method :
 */

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Worker programmer = new Programmer();
        Worker actor = new Actor();
        programmer.work();
        System.out.println("_____________");
        actor.work();
    }
}
