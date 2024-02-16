package com.homework1.composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder);
    }

    public void addSubFolders(ArrayList<Folder> folders) {
        subFolders.addAll(folders);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFiles(ArrayList<File> files1) {
        files.addAll(files1);
    }

    public void removeSubFolder(Folder subFolder) {
        subFolders.remove(subFolder);
    }
    public void print() {
        System.out.println("Folder: " + name);
        System.out.println("Files:");
        for (File file : files) {
            file.print();
        }
        System.out.println("Sub-Folders:");
        for (Folder folder : subFolders) {
            folder.print();
        }
    }
}
