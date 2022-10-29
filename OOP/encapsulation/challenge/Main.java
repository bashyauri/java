package OOP.encapsulation.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        printer.setPaper(1000);
       printer.printPages(40);
        System.out.println(printer.getPaper());
       System.out.println(printer.getPrintedPages());
    }
    
}
