package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ma.tarikKerrou.StationMetierImpl;
import ma.tarikKerrou.entities.Carburant;
import ma.tarikKerrou.entities.HistoCarb;
import ma.tarikKerrou.entities.Station;

@Path("/station")
public class StaionService {
	private StationMetierImpl metier;
	
	public StaionService() {
		metier=new StationMetierImpl();
		metier.initialiser();
	}
	@GET
	@Path("/stations")
public List<Station> consulterStation(){
	return metier.listStation();
}
	@GET
	@Path("/carburants")
	@Produces(MediaType.APPLICATION_JSON)
public List<Carburant> consulterCarburant(){
	return metier.listCarburant();

}
	@GET
	@Path("/histocarb")
	@Produces(MediaType.APPLICATION_JSON)
public List<HistoCarb> consulterhistocarb(){
	return metier.listHistoCarb();}
	@GET
	@Path("/findstation/{mc}")
	@Produces(MediaType.APPLICATION_JSON)
public	List<Station> FindStation(@QueryParam (value="mc") String mc){
	return metier.FindStation(mc);
}
} 
