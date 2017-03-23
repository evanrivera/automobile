package edu.jalc.automobile.onlinebuilder.components.body;
import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;
import edu.jalc.automobile.parts.Cabin;
import edu.jalc.automobile.parts.StandardCabin;

public class EconomySuv extends Suv{
  public EconomySuv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                        StandardCabin standardCabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, standardCabin, standardTrunk);
  }
  public StandardCabin getCabin(){
    return (StandardCabin) this.getCabin();
  }

  public String toString(){
    return "Adding StandardCabin to EconomySuv";
  }
}
