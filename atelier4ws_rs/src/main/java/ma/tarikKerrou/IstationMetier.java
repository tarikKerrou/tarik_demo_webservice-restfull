package ma.tarikKerrou;

import java.util.List;

import ma.tarikKerrou.entities.Carburant;
import ma.tarikKerrou.entities.HistoCarb;
import ma.tarikKerrou.entities.Station;

public interface IstationMetier {
public Station addStation (Station s);
public Carburant addCarburant(Carburant c);
public HistoCarb addHistoCard(HistoCarb hc);
public List<Station> listStation();
public List<Carburant> listCarburant();
public List<HistoCarb> listHistoCarb();
public List<Station> FindStation(String mc);
public List<Carburant> FindCarburant(String mc);
public List<HistoCarb> FindHistoCarb(Long mc);
public Station updateStation (Station s);
public Carburant updateCarburant(Carburant c);
public HistoCarb updateHistoCard(HistoCarb hc);
public boolean deleteStation (String nom);
public boolean deleteCarburant (String nom);
public boolean deleteHistoCarb (String nom);

}
