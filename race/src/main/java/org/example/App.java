package org.example;

import org.eclipse.jgit.api.Git;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int num = plusTen(10);

    }



    public static int plusTen(int num){

        return num + 10;
    }

}
