package designPattern.encapsulatingObjectCreation;

import java.util.Scanner;

/**
 * In the very heart of suburbia, there stood a motor factory; in the very
 * heart of that factory worked a programmer.
 * Implement the static method make of the MotorStaticFactory that produces motors of different types.
 * The method takes three parameters: the type of a motor as a character, model as a string,
 * and power as a long number.
 * It should return a new motor according to the type with initialized fields.
 *
 * Here is the correspondence between the passed type and the class of the motor:
 * 'P' for pneumatic, 'H' for hydraulic, 'E' for electric and 'W' for warp.
 *
 * Ignore the upper/lower case when creating motors, i.e. 'p' must work as well as 'P'.
 * If an invalid character is given, the method should return null.
 *
 * Do not change the provided code of the motor classes.
 */
class MotorStaticFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        if (Character.toUpperCase(type) == 'P') {
            return new PneumaticMotor(model, power);
        } else if (Character.toUpperCase(type) == 'H') {
            return new HydraulicMotor(model, power);
        } else if(Character.toUpperCase(type) == 'E') {
            return new ElectricMotor(model, power);
        } else if (Character.toUpperCase(type) == 'W') {
            return new WarpDrive(model, power);
        } else {
            return null; // if not a suitable type
        }

        /**
         * OU ENCORE DE CETTE FACON:
         *
         *         type = Character.toUpperCase(type);
         *         switch (type) {
         *             case 'P':
         *                 return new PneumaticMotor(model, power);
         *             case 'H':
         *                 return new HydraulicMotor(model, power);
         *             case 'E':
         *                 return new ElectricMotor(model, power);
         *             case 'W':
         *                 return new WarpDrive(model, power);
         *             default:
         *                 return null;
         */
    }
}

/* Do not change code below */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }
}

class PneumaticMotor extends Motor {

    public PneumaticMotor(String model, long power) {
        super(model, power);
    }
}

class HydraulicMotor extends Motor {

    public HydraulicMotor(String model, long power) {
        super(model, power);
    }
}

class ElectricMotor extends Motor {

    public ElectricMotor(String model, long power) {
        super(model, power);
    }
}

class WarpDrive extends Motor {

    public WarpDrive(String model, long power) {
        super(model, power);
    }
}

public class MainMotor {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        final Motor motor = MotorStaticFactory.make(type, model, power);
        if (motor == null) {
            System.out.println(motor);
        } else {
            System.out.println(motor.getClass().getName() + " " + motor.model + " " + motor.power);
        }
    }
}
