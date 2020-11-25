package FileSystem;

import java.util.ArrayList;

public class Folder {
    private String name;
    ArrayList<Folder> folders = new ArrayList<>();
    ArrayList<File> files = new ArrayList<>();

    public String name() {
        return name;
    }

    public void add(File file) {
        files.add(file);
    }

    public void add(Folder folder) {
        folders.add(folder);
    }

}
