package Comp;

public class Computer {
    private String proc;
    private int operativ;
    private int disk;
    private int resourse;

    public Computer(String pr, int op, int di, int res) {
        proc = pr;
        operativ = op;
        disk = di;
        resourse = res;
    }

    public void setProc(String proc) {
        if (proc.length() <= 3) {
            this.proc = proc;
        } else {
            System.out.println("Нельзя!");
        }
    }

    public int summ() {
        return operativ + disk + resourse;
    }

    public String getProc() {
        return proc;
    }

    public int getDisk() {
        return disk;
    }

    public int getOperativ() {
        return operativ;
    }

    public int getResourse() {
        return resourse;
    }

    public static void main(String[] args) {
        Computer param = new Computer("My", 8, 254, 100);

        System.out.println(param.getProc());

        param.setProc("Proc");

        System.out.println(param.getProc());

        param.setProc("Pro");

        System.out.println(param.getProc());

        int Name = param.summ();

        System.out.println(Name);
    }
}


