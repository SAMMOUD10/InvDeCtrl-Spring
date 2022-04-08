package PRESENTATION;

import DAO.DaoImpl;
import EXT.DaoImpl2;
import METIER.MetierImpl;

public class Presentation {
    // la logique présenation est en fait une simple application java
    public static void main(String[] args) {
        /*
            Injection des dépendances par
            instanciation statique c'est â dire "new" autrement dite
            en implémentant une couplage fort
         */
        //DaoImpl dao = new DaoImpl();
        DaoImpl2 dao2 = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao2);
        //metier.setDao(dao2);
        System.out.println("Résultat = "+ metier.calcul());
    }
}
