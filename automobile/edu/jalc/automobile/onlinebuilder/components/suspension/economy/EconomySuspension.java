package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.*;

public class EconomySuspension extends Economy{

   private Shock stockShock;
   private Spring stockSpring;
   private Tire stockTire;
   private Wheel wheel;
   
   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
      this.stockTire = null;
   }
   
   public EconomySuspension(Shock stockShock, Spring stockSpring,Wheel wheel){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
      this.wheel = wheel;


   }
   
   public Shock getShock(){
      return stockShock;
   }
   
   public Spring getSpring(){
      return stockSpring;
   }

   public Tire getTire() {
      return stockTire;
   }

    public Wheel getWheel() {
        return wheel;
    }


    public void setStockTire(double height, double width) {
       this.stockTire = new StockTire(height,width);
    }

    public String toString(){
      return "EconomySuspension has :\n" +
              "\t"+ stockShock.toString()+"\n"+
              "\t"+ stockSpring.toString()+"\n"+
              "\t"+ stockTire.toString();
   }
   
}