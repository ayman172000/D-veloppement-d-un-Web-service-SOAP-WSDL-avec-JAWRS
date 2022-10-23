import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        //cette ligne de code permet de cree un middleware
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(1));
        Compte compte=stub.getAccount(1);
        System.out.println(compte.getSolde());
    }
}
