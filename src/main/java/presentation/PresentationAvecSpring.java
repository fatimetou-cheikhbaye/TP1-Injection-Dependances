package presentation;

import metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext contexte =
                     new ClassPathXmlApplicationContext("config.xml")) {

            IMetier metier = contexte.getBean("metier", IMetier.class);

            System.out.println(
                    "Résultat = " + metier.calcul());
        }
    }
}
