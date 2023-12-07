public class Printer {
    private String queue = ""; //список документов на печать
    private int pageInQueue;
    private int printedPagesCount;
    public void append(String text, String name, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pageInQueue = pageInQueue + pagesCount;
    }
    public void append(String text) {
        queue = queue + "\nDocument without name - " + text;
        pageInQueue += 1;
    }
    public void append(String text, int pagesCount) {
        queue = queue + "\nDocument without name - " + text;
        pageInQueue += pagesCount;
    }
    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pageInQueue += 1;
    }
    public void clear() {
        pageInQueue = 0;
        queue = "";
    }
    public void print() {
        printedPagesCount = printedPagesCount + pageInQueue;
        System.out.println(queue);
        clear();
    }
    public int getPagesCount() {
        return pageInQueue;
    }

    public int getPrintedPagesCount() {
        return printedPagesCount;
    }
}
