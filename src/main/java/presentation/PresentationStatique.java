package presentation;
import dao.DaoIMP;
import dao.IDao;
import metier.MetierIMP;

public class PresentationStatique {
    public static void main(String[] args) {

        IDao dao = new DaoIMP();

        MetierIMP metier = new MetierIMP();

        metier.setDao(dao);

        System.out.println(metier.calcul());
    }
}
