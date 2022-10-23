import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        //cette ligne de code permet de cree un petit serveur http pour consulter que le service banque
        //si l'addresse est localhost... on peut consulter le service que en local mais si on veut le consulter a travers un LAN on met 0.0.0.0
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service deployer sur l'addresse http://0.0.0.0:9191/");
        System.out.println("pour visualiser le wsdl il sufit de taper localhost:9191/BanqueWS?wsdl dans votre navigateur");
        System.out.println("wsdl cest fichier xml qui contient la description de linterface du web service(les methode, les parameter,type de retour)");
        System.out.println("grace au schemas xml le wsdl s'amarche");

        /*
        pout tester un web service vous avez besoin de connaitre le type de web service (soap ou rest ) s'il est soap vous besoin de wsdl
         */
        /*
        pour consulter un Web Service avec un client java jaxWS besoin d'une librairie pour convertir l'objet dans laquelle aurait besoin en xml pour cela jaxWS a
        besoin d'une librairie pour cette tache (JaxB api qui permet le mapping objet xml)
            * @XmlTransient//sert a exclude un attribut lors du mapping objet xml
            * pou utiliser les annotaion offerte par JaxB il faut utiliser l'annotation @XmlAccessorType(XmlAccessType.FIELD)
            * @XmlAccessorType(XmlAccessType.FIELD) signifie que je veux utiliser @XmlTransient sur les attribut et  non sur les getters et les setters
            * @XmlRootElement(name = "compte") signifie que lorque j'utilise JaxB pour le mapping objet xml d'un objet specifie je recoit en sortie une balise xml nommée compte
         */

        System.out.println("pour cree un client java il suffit de generer le code java a travers wsdl a laide du plagin " +
                "Jakarta EE : web Service (jax-ws)  souvent on lappele proxy ou skeleton");
    }
}
