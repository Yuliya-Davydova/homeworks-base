package FileSystem;

import java.util.Scanner;

public class App {
    static Folder tree;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (result == "print") {
                printTree();
            } else {
                addTree(result);
            }
        }

    }

    static void printTree() {
        // TODO: 11/26/20 Вывод дерева
        System.out.println("Здесь должен быть вывод дерева");
    }

    static void addTree(String stringTree) {

    }
}
