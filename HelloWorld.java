public class HelloWorld {
    private static String helloMessage = "Hello, World!";
    private static String goodbyeMessage = "Goodbye, World!";

    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
    }

    public static void sayHello() {
        System.out.println(helloMessage);
    }

    public static void sayGoodbye() {
        System.out.println(goodbyeMessage);
    }

    public static void setHelloMessage(String message) {
        helloMessage = message;
    }

    public static void setGoodbyeMessage(String message) {
        goodbyeMessage = message;
    }
}