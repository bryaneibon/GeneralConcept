package designPattern.strategyPattern;

/**
 * An example: sending messages
 * Suppose there's an application that needs to send messages to the customers.
 * There are different ways to reach out to them: via SMS or e-mail.
 * In addition, new sending methods will be added in future (for instance, push sending).
 * It would be nice to change the existing code as little as possible when adding new strategies.
 *
 * According to the strategy pattern, we need to define a family of algorithms (sending methods).
 * Each algorithm must encapsulate a logic to send a message using a concrete transport (SMS/email).
 *
 * Here is our hierarchy of sending methods:
 */

interface SendingMethod {
    void send(String from, String to, String msg);
}

class SmsSendingMethod implements SendingMethod {
    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("send SMS from '%s' to '%s'", from, to));
    }
}

class EmailSendingMethod implements SendingMethod {
    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("Email from '%s' to '%s'", from, to));
    }
}


/**
 * 1) Field and constructors. A concrete strategy may need its own settings stored in fields.
 * Here is a class PushSendingMethod with a setting field which we fill in the constructor:
 */
class PushSendingMethod implements SendingMethod {

    private final boolean magicFlag;

    public PushSendingMethod(boolean magicFlag) {
        this.magicFlag = magicFlag;
    }

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("Send push from '%s' to '%s'", from, to));
    }
}

/**
 *Our Context is MessageSender which references a sending method and
 * allows us to change the currently used method:
 */
class MessageSender {

    private SendingMethod method;

    // it may contain additional fields as well

    public void setMethod(SendingMethod method) {
        this.method = method;
    }

    public void send(String from, String to, String msg) {
        this.method.send(from, to, msg);
    }
}

/**
 * In the client code, we should create an instance of MessageSender,
 * set a sending method and invoke the method send with three string arguments.
 * Also, we can change the sending method to another one.
 */
class DemoMsg{
    public static void main(String[] args) {
        MessageSender sender = new MessageSender(); // create an email message sender.

        sender.setMethod(new EmailSendingMethod()); // set a concrete sending method

        sender.send("alice@gmail.com", "bob@gmail.com", "Hello!");

        sender.setMethod(new PushSendingMethod(true));

        sender.send("push_sender","push_receiver","Test push");

        sender.setMethod(new PushSendingMethod(false));

        sender.send("push_senderII","push_receiverII","Test push II");

        sender.setMethod(new SmsSendingMethod()); // set another sending method

        sender.send("1-541-444-3333", "1-541-555-2222", "Hello!");
    }
}
