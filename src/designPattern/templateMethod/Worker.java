package designPattern.templateMethod;

/**
 * Template method pattern
 * An abstract base class implements standard algorithm steps and can provide a default implementation for custom steps. Specific subclasses provide concrete implementation for each of these steps.
 *
 * Template Method has the following components:
 *
 * Abstract Class describes primitive operations and the template method itself which calls primitive operations;
 *
 * Concrete Class implements the primitive operations.
 */

public abstract class Worker {

    public void work() {
        goToWork();

        workingProcess();

        goHome();
    }

    public void goToWork() {
        System.out.println("= I'm going to work sadly =");
    }

    public void goHome() {
        System.out.println("= I'm going home happy =");
    }

    public abstract void workingProcess();

    /**
     * The common algorithm of actions is already determined.
     * Now, we will create two concrete classes: Programmer and Actor:
     */
}

