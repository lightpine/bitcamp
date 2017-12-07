package java100.app.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> implements Controller {
    protected ArrayList<T> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    
    public abstract void excute();
    
}
