package java100.app.contllor;

import java.util.ArrayList;
import java.util.Scanner;

import java100.app.domain.Score;


public abstract class GenericController<T> {
    
    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>();
    
    public abstract void execute();
    
}
