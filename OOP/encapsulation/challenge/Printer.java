package OOP.encapsulation.challenge;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private int papers;
    private boolean isDuplex = false;

    public Printer(int tonerLevel,  boolean isDuplex) {
        this.tonerLevel = tonerLevel;
     
        this.isDuplex = isDuplex;
    }

    public void setPaper(int papers) {
        this.papers = papers < 0 ? 0 : papers;

    }

    public int getPaper() {
      
        return papers -= printedPages;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return this.printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillToner(int toner) {
        if (tonerLevel + toner <= 100) {
             this.tonerLevel += toner;
        }
        
    }

    public int printPages(int pages) {
        if (getPaper() <= 0 || pages > getPaper() || pages < 0) {
            System.out.println("No papers to print");
            return 0;
        } else if (pages > 1 && this.isDuplex ) {
            return this.printedPages = pages / 2;
        }
        return this.printedPages += pages;
    }

    
    


    
}
