package parole;


public class Parole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestioneIO io = new GestioneIO();

        int option;
        do {
            option = io.getInt();
        } while (option > 4 || option < 0);

        switch (option) {
            case 1:
                versioneHashSet(io);
                break;
            case 2:
                versioneHashMap(io);
                break;
            case 3:
                versioneArrayList(io);
                break;
            case 4:
                System.exit(0);
        }

    }

    public static void versioneArrayList(GestioneIO io) {
        System.out.println("Numero di parole diverse: " + io.readFromFileArrayList());
    }

    public static void versioneHashMap(GestioneIO io) {
        System.out.println("Numero di parole diverse: " + io.readFromFileHashMap());
    }

    public static void versioneHashSet(GestioneIO io) {
        System.out.println("Numero di parole diverse: " + io.readFromFileHashSet());
    }

}
