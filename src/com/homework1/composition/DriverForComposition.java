package com.homework1.composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverForComposition {
    public static void run() {
        // Create sub-folders
        Folder php_demo1 = new Folder("php_demo1");
        Folder source_files = new Folder("Source Files");
        php_demo1.addSubFolder(source_files);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        source_files.addSubFolder(phalcon);
        source_files.addSubFolder(app);

        Folder config =  new Folder("config");
        Folder controllers =  new Folder("controllers");
        Folder library =  new Folder("library");
        Folder migrations =  new Folder("migrations");
        Folder models =  new Folder("models");
        Folder views =  new Folder("views");
        app.addSubFolders(new ArrayList<>(Arrays.asList(config, controllers, library, migrations, models, views)));

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("publicFolder");
        source_files.addSubFolders(new ArrayList<>(Arrays.asList(cache, publicFolder)));
        // Create files
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");
        publicFolder.addFiles(new ArrayList<>(Arrays.asList(htaccess, htrouter, index)));


        // Step 2: Print out the folder structure
        System.out.println("Folder Structure before deletion:");
        php_demo1.print();
        System.out.println();

        // Step 3: Delete the 'app' folder and print out the updated folder structure
        source_files.removeSubFolder(app);
        System.out.println("Folder Structure after deleting 'app' folder:");
        php_demo1.print();
        System.out.println();

        // Step 4: Delete the 'publicFolder' folder and print out the updated folder structure
        source_files.removeSubFolder(publicFolder);
        System.out.println("Folder Structure after deleting 'publicFolder' folder:");
        php_demo1.print();

    }
}
