package chapterTwo;

import org.w3c.dom.ls.LSOutput;

public class PrintOneToFour {
    public static void main(String[] args) {
        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    }
}
