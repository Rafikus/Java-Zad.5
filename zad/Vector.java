package zad;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
/**
 * Created by Rafikus on 25.03.2017.
 */

public class Vector
{
    private int array[] = new int[0];

    public void Vector()
    {

    }

    public static Vector addVectors(Vector v1, Vector v2) throws WektoryRoznejDlugosciException
    {
        Vector wynik = new Vector();
        if(!v1.isEqual(v2))
            throw new WektoryRoznejDlugosciException(v1, v2);

        for (int i = 0; i < v1.array.length; i++)
        {
            wynik.add(v1.array[i] + v2.array[i]);
        }

        return wynik;
    }

    public void write()
    {
        boolean flag = true;
        int inInt = 0;
        String input = new String();
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj wartości wektora");
        while(true)
        {
            try {
                input = read.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                inInt = Integer.parseInt(input);
            }
            catch(NumberFormatException e)
            {
                flag = false;
            }

            if (flag)
            {
                add(inInt);
            }
            else
            {
                flag = true;
            }
        }
    }

    public void clear()
    {
        array = new int[0];
    }

    public void print()
    {
        for(int i = 0; i < array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public void printToFile(String FILENAME)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(".\\" + FILENAME + ".txt"));
            for(int i = 0; i < array.length; i++) {
                bw.write(array[i] + "");
                bw.append(System.lineSeparator());
            }
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Błąd zapisu do pliku!");
        }
    }

    public int getLength()
    {
        return array.length;
    }

    boolean isEqual(Vector v)
    {
        if (this.getLength() == v.getLength())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void add(int a)
    {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = a;
    }

}
