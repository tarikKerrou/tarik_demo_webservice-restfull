package ma.tarikkerrou;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;



public class TarikRest {

	public static void main(String[] args) {
Client client =Client.create(new DefaultClientConfig());
URI uri =UriBuilder.fromUri("http://localhost:8080/atelier4ws_rs/").build();
ClientResponse response=
client.resource(uri)
.path("station")
.path("stations")
.get(Client);
String corpsRepHttp=response.getEntity(String.class);

System.out.println(response.getEntity(c));
	}

}
