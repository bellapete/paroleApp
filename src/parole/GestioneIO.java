package parole;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class GestioneIO {

    int numeroParole, numeroParoleDiverse = 0;
    String[] parole = null;
    ArrayList al = new ArrayList();
    Map map = new HashMap();
    Set set = new HashSet();

    public int getInt() {
        Scanner lettore = new Scanner(System.in);
        System.out.println("1)HashSet");
        System.out.println("2)HashMap");
        System.out.println("3)ArrayList");
        System.out.println("4)Exit");
        System.out.println("Scegli: ");
        return lettore.nextInt();
    }

    public int readFromFileHashSet() {
        try {
            FileInputStream fis = new FileInputStream("dati/romanzo.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while (br.ready()) {
                String str = br.readLine();
                System.out.println(str);
                parole = str.split(" |,|\\.|;|:|'|-|!|\\?");
                for (int i = 0; i < parole.length; i++) {
                    if (set.contains(parole[i])) {
                        numeroParoleDiverse++;
                    }
                    set.add(parole[i]);
                    numeroParole++;
                }
            }
            System.out.println("\n-------------------------");
            System.out.println(set.toString());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                System.out.print("Value:(" + it.next().toString() + ")\t");
            }
            System.out.println("\n-------------------------");
            System.out.println("Numero di parole: " + numeroParole);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroParoleDiverse;

    }

    public int readFromFileHashMap() {
        try {
            FileInputStream fis = new FileInputStream("dati/romanzo.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while (br.ready()) {
                String str = br.readLine();
                System.out.println(str);
                parole = str.split(" |,|\\.|;|:|'|-|!|\\?");
                for (int i = 0; i < parole.length; i++) {
                    if (map.containsValue(parole[i])) {
                        numeroParoleDiverse++;
                    }
                    map.put(parole[i], parole[i]);
                    numeroParole++;
                }
            }
            System.out.println("Numero di parole: " + numeroParole);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroParoleDiverse;

    }

    public int readFromFileArrayList() {
        try {
            FileInputStream fis = new FileInputStream("dati/romanzo.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while (br.ready()) {
                String str = br.readLine();
                System.out.println(str);
                parole = str.split(" |,|\\.|;|:|'|-|!|\\?");            


                for (int i = 0; i < parole.length; i++) {
                    al.add(parole[i]);
                }
                for (int i = 0; i < al.size(); i++) {
                }
            }
            System.out.println("Numero di parole: " + al.size());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroParoleDiverse;
    }

}
