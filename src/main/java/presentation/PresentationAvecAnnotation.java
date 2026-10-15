package presentation;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAvecAnnotation {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext contexte =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            IMetier metier = contexte.getBean(IMetier.class);

            System.out.println(
                    "Résultat = " + metier.calcul());
        }
    }
}
