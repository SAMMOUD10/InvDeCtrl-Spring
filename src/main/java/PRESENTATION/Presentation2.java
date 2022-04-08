package PRESENTATION;

import DAO.IntDao;
import METIER.IntMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        /*
            tout ça s'intervient dans l'instanciation dynamique
         */
        Scanner scanner = new Scanner(new File("Config.txt"));
        // la classe DAO
        String DaoClassName = scanner.nextLine(); // lire le nom de la classe○
        Class CDao = Class.forName(DaoClassName); // charger la classe obtenue en memoire
        /*
            là on suppose que l'objet instancié
            est un objet d'une classe qui implémente cette interface
         */
        IntDao ObjDao = (IntDao) CDao.newInstance(); // Instancier la classe

        // la classe Metier
        String MetierClassName = scanner.nextLine();
        Class CMetier = Class.forName(MetierClassName);
        IntMetier ObjMetier = (IntMetier) CMetier.newInstance();

        Method method = CMetier.getMethod("setDao",IntDao.class);
        /*
            l'instruction au-dessous est équivalent à l'instruction
            suivant metier.setDao(dao);
        */
        method.invoke(ObjMetier,ObjDao);
        System.out.println("Résultat => "+ObjMetier.calcul());
    }
}
