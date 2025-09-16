package Interfaces.test;

import Interfaces.dominio.Databaseloader;
import Interfaces.dominio.Fileload;

import java.io.File;

public class DataLoaderTest {
    public static void main(String[] args) {
        Databaseloader db = new Databaseloader();
        Fileload f = new Fileload();
        db.load();
        f.load();
        db.Remover();
    }
}
