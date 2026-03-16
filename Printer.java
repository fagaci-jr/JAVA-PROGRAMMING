class Printer {

    // Method to print a String
    void print(String text) {
        System.out.println("String: " + text);
    }

    // Method to print an int
    void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Method to print a double
    void print(double value) {
        System.out.println("Double: " + value);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello World");
        printer.print(10);
        printer.print(5.75);
    }
}