package zad;

/**
 * Created by Rafikus on 25.03.2017.
 */

class WektoryRoznejDlugosciException extends Exception {
    int v1Length;
    int v2Length;

    WektoryRoznejDlugosciException(Vector v1, Vector v2)
    {
        v1Length = v1.getLength();
        v2Length = v2.getLength();
    }
}
