package zad;

import java.util.Arrays;
/**
 * Created by Rafikus on 25.03.2017.
 */

public class Vector
{
    private int array[] = new int[0];

    void add(int a)
    {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = a;
    }

    public static Vector addVectors(Vector v1, Vector v2) throws WektoryRoznejDlugosciException
    {
        Vector wynik = new Vector();
        if(!v1.isEqual(v2))
            throw new WektoryRoznejDlugosciException(v1, v2, "Nie są równe!");

        for (int i = 0; i < v1.array.length; i++)
        {
            wynik.add(v1.array[i] + v2.array[i]);
        }

        return wynik;
    }

    public void readVector()
    {
        VectorReader.read(this);
    }

    public void clear()
    {
        array = new int[0];
    }

    public void print()
    {
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
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

    //Getters & Setters

    public int getLength()
    {
        return array.length;
    }

    public int[] getArray() {
        return array;
    }
}
