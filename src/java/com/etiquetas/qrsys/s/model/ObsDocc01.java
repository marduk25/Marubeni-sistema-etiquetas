package com.etiquetas.qrsys.s.model;
// Generated Jul 18, 2018 1:30:24 PM by Hibernate Tools 4.3.1



/**
 * ObsDocc01 generated by hbm2java
 */
public class ObsDocc01  implements java.io.Serializable {


     private int cveObs;
     private String strObs;

    public ObsDocc01() {
    }

	
    public ObsDocc01(int cveObs) {
        this.cveObs = cveObs;
    }
    public ObsDocc01(int cveObs, String strObs) {
       this.cveObs = cveObs;
       this.strObs = strObs;
    }
   
    public int getCveObs() {
        return this.cveObs;
    }
    
    public void setCveObs(int cveObs) {
        this.cveObs = cveObs;
    }
    public String getStrObs() {
        return this.strObs;
    }
    
    public void setStrObs(String strObs) {
        this.strObs = strObs;
    }




}

