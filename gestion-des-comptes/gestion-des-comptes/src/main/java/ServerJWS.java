import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS
{
    public static void main(String[] args)
    {
        //permet de démarer un petit serveur http qui va utiliser le prot 9191
        // Ce serveur http est utilisé pour consulter uniquement le ws "BanqueService"
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.printf("Web service déplyé sur http://0.0.0.0:9191/ ");
    }

}
