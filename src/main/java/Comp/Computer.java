package Comp;

public class Computer {

    private String proc;
    private int operativ;
    private int disk;
    private int resource;

    public Computer(String pr, int op, int di, int res) {
        proc = pr;
        operativ = op;
        disk = di;
        resource = res;
    }

    public void displayInfo() {
        System.out.printf(" Процессор: %s \n Оперативная память: %s \n Жесткий диск: %s \n Ресурс: %s \n", proc, operativ, disk, resource);
    }

    public void turnOn() {

        if (resource > 0) {
            resource = resource - 1;
            System.out.println("Включен");
        } else {
            System.out.println("Превышен лимит ресурса включения. Компбьютер сгорел.");
        }

    }
}


