package com.etiquetas.qrsys.s.model;
// Generated Jul 18, 2018 1:30:24 PM by Hibernate Tools 4.3.1



/**
 * Numser01Id generated by hbm2java
 */
public class Numser01Id  implements java.io.Serializable {


     private String cveArt;
     private String numSer;
     private int almacen;

    public Numser01Id() {
    }

    public Numser01Id(String cveArt, String numSer, int almacen) {
       this.cveArt = cveArt;
       this.numSer = numSer;
       this.almacen = almacen;
    }
   
    public String getCveArt() {
        return this.cveArt;
    }
    
    public void setCveArt(String cveArt) {
        this.cveArt = cveArt;
    }
    public String getNumSer() {
        return this.numSer;
    }
    
    public void setNumSer(String numSer) {
        this.numSer = numSer;
    }
    public int getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Numser01Id) ) return false;
		 Numser01Id castOther = ( Numser01Id ) other; 
         
		 return ( (this.getCveArt()==castOther.getCveArt()) || ( this.getCveArt()!=null && castOther.getCveArt()!=null && this.getCveArt().equals(castOther.getCveArt()) ) )
 && ( (this.getNumSer()==castOther.getNumSer()) || ( this.getNumSer()!=null && castOther.getNumSer()!=null && this.getNumSer().equals(castOther.getNumSer()) ) )
 && (this.getAlmacen()==castOther.getAlmacen());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCveArt() == null ? 0 : this.getCveArt().hashCode() );
         result = 37 * result + ( getNumSer() == null ? 0 : this.getNumSer().hashCode() );
         result = 37 * result + this.getAlmacen();
         return result;
   }   


}

