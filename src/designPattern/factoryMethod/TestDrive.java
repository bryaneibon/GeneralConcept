package designPattern.factoryMethod;

/**
 * Let's make our abstract example from the beginning a little more vivid and detailed.
 * As you remember, you are the boss of a factory.
 * Suppose the factory makes tables: they are truly indispensable in the house.
 * You work with a qualified employee, an engineer, who, as you might have guessed,
 * is your factory method.
 *
 * First, let's define the abstract class Table:
 */

abstract class Table {
    private String name;

    Table(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachLegs() {
        System.out.println("Attaching Legs");
    }

    void attachTableTop() {
        System.out.println("Attaching tabletop");
    }
}

/**
 * Second, we should define two specific tables: OfficeTable and KitchenTable classes.
 * Note that the abstract class has a constructor, which is sometimes tricky for
 * Java developers with little experience.
 */

class TableOffice extends Table {
    TableOffice(String name) {
        super(name);
    }
}

class TableKitchen extends Table {
    TableKitchen(String name) {
        super(name);
    }
}

/**
 * Third, let's create your factory. I called it TableStore, the implementation of abstract TableFactory:
 */
abstract class TableFactory {

    abstract Table createTable(String type);  // Will be implement only in the concreteCreator (TableStore)...

    Table orderTable(String type) throws InterruptedException {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, we are not able to create this kind of table\n");
            return null;
        }
        System.out.println("Making a " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        Thread.sleep(1500L);
        System.out.println("Done a " + table.getName() + "\n");
        return table;
    }
}

class TableStore extends TableFactory {
    @Override
    Table createTable(String type) {
        if (type.equals("office")) {
            return new TableOffice("Office Table");
        } else if (type.equals("kitchen")) {
            return new TableKitchen("Kitchen Table");
        } else return null;
    }
}

/**
 * Finally, our TestDrive code and the output:
 */
public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        TableStore tableStore = new TableStore();

        Table strangeTable = tableStore.orderTable("Mysterious table");
        Table officeTable = tableStore.orderTable("office");
        Table kitchenTable = tableStore.orderTable("kitchen");

    }
}
