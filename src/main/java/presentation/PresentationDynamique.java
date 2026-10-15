
package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class PresentationDynamique {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        properties.load(new FileInputStream("src/main/resources/config.txt"));

        String daoClassName = properties.getProperty("Dao");
        String metierClassName = properties.getProperty("Metier");

        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, dao);

        System.out.println("Résultat = " + metier.calcul());
    }
}
