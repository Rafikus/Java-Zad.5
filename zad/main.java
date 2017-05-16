package zad;

/**
 * Created by Rafikus on 25.03.2017.
 */

public class main {
    public static void main(String[] args)
    {
        Vector v1 = new Vector(), v2 = new Vector(), wynik;
        while(true)
        {
            try {
                v1.readVector();
                v2.readVector();
                wynik = Vector.addVectors(v1, v2);
                wynik.print();
                VectorFile.saveToFile("wynik", wynik);
                break;
            } catch (WektoryRoznejDlugosciException e) {
                System.out.printf("Zły rozmiar wektorów\nWektor 1: %d, Wektor 2: %d", v1.getLength(), v2.getLength());
                v1.clear();
                v2.clear();
            } catch (Exception e){
				e.printStackTrace();
	    	}
        }
    }
}
