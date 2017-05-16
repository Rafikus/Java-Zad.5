package zad;

import java.util.Scanner;
import java.util.regex.*;
/**
 * Created by po2-62 on 16.05.17.
 */
public class VectorReader {

    public static void read(Vector v)
    {
        Scanner reader = new Scanner(System.in);
        String temp = new String();
        Pattern p = Pattern.compile("(-?(?:\\d*\\.|\\d*\\,)?\\d+)");
        Matcher m;

        temp = reader.nextLine();
        m = p.matcher(temp);
        while (m.find())
        {
            v.add(Integer.parseInt(m.group()));
        }
    }

}
