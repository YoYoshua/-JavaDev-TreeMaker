package main.java.tree;

import java.util.Scanner;

public class InputHandler
{
    Scanner inputScanner = new Scanner(System.in);

    public int readInt()
    {
        return inputScanner.nextInt();
    }

    public String readString()
    {
        return inputScanner.next();
    }

}
