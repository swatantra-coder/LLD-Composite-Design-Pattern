package DesignFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<File> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void ls(){
        System.out.println("DesignFileSystem.Directory Name: "+directoryName);
        for(File file: files) {
            file.ls();
        }
    }
}
