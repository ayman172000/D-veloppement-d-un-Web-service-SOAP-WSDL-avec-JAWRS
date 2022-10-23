package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//ce genre de class libre en java il sappelle POJO plain old java object pas un web service
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double converssion(@WebParam(name = "montant") double mt)
    {
        return mt*10.54;
    }

    @WebMethod()
    public Compte getAccount(@WebParam(name = "code")int code)
    {
        return new Compte(code,Math.random(),new Date());
    }

    public List<Compte> getAllAccount()
    {
        return List.of(
                new Compte(1,Math.random(),new Date()),
                new Compte(2,Math.random(),new Date()),
                new Compte(3,Math.random(),new Date())
        );
    }

}
