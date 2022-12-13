package ma.tarikKerrou;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import ma.tarikKerrou.entities.Carburant;
import ma.tarikKerrou.entities.HistoCarb;
import ma.tarikKerrou.entities.Station;

public class StationMetierImpl implements IstationMetier {
   private Map<Long,Carburant> carburants=new HashMap<Long,Carburant>();
   private Map<Long,HistoCarb> HistoCarb=new HashMap<Long,HistoCarb>();
   private Map<Long,Station> station=new HashMap<Long,Station>();

	@Override
	public Station addStation(Station s) {
		station.put(s.getId_station(), s);
		return s;
	}
	

	@Override
	public Carburant addCarburant(Carburant c) {
		carburants.put(c.getId_carburant(), c);
		return c;
	}

	@Override
	public HistoCarb addHistoCard(HistoCarb hc) {
		HistoCarb.put(hc.getId_Histocarb(), hc);
		return hc;
	}

	@Override
	public List<Station> listStation() {
		
		return new ArrayList <Station>(station.values());
	}

	@Override
	public List<Carburant> listCarburant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistoCarb> listHistoCarb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> FindStation(String mc) {
		List<Station> prods =new ArrayList <Station>();
		for(Station p:station.values())
			if (p.getNom().contains(mc))
            prods.add(p);
		return prods;
	}

	@Override
	public List<Carburant> FindCarburant(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistoCarb> FindHistoCarb(Long mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Station updateStation(Station s) {
		station.put(s.getId_station(), s);
		return s;
	}

	@Override
	public Carburant updateCarburant(Carburant c) {
		carburants.put(c.getId_carburant(), c);
		return c;
	}

	@Override
	public HistoCarb updateHistoCard(HistoCarb hc) {
		HistoCarb.put(hc.getId_Histocarb(), hc);
		return hc;
	}

	@Override
	public boolean deleteStation(String nom) {
		if(station.get(nom)!=null) {station.remove(nom);
		return true;
		}
		else throw new RuntimeException("Station introuvable");
		
	}

	@Override
	public boolean deleteCarburant(String nom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteHistoCarb(String nom) {
		// TODO Auto-generated method stub
		return false;
	}
public void initialiser() {
	station.put(1L, new Station(1L,"Tarikstation1","Tanger","Boukhalef Tanger"));
	station.put(2L, new Station(2L,"Tarikstation2","Tanger","Boukhalef Tanger"));
	station.put(3L, new Station(3L,"Tarikstation3","Tanger","Boukhalef Tanger"));
	station.put(4L, new Station(4L,"Tarikstation4","Tanger","Boukhalef Tanger"));
	carburants.put(1L, new Carburant(1L,"TarikCarburant1","descripton de TarikCarburant1"));
	carburants.put(2L, new Carburant(2L,"TarikCarburant2","descripton de TarikCarburant2"));
	carburants.put(3L, new Carburant(3L,"TarikCarburant3","descripton de TarikCarburant3"));
	carburants.put(4L, new Carburant(4L,"TarikCarburant4","descripton de TarikCarburant4"));
	
}
}
