package com.etiquetas.qrsys.s.model;
// Generated Jul 18, 2018 1:30:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Numser01 generated by hbm2java
 */
public class Numser01  implements java.io.Serializable {


     private Numser01Id id;
     private String status;
     private Double costo;
     private String doctoEnt;
     private Date fechaEnt;

    public Numser01() {
    }

	
    public Numser01(Numser01Id id) {
        this.id = id;
    }
    public Numser01(Numser01Id id, String status, Double costo, String doctoEnt, Date fechaEnt) {
       this.id = id;
       this.status = status;
       this.costo = costo;
       this.doctoEnt = doctoEnt;
       this.fechaEnt = fechaEnt;
    }
   
    public Numser01Id getId() {
        return this.id;
    }
    
    public void setId(Numser01Id id) {
        this.id = id;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getCosto() {
        return this.costo;
    }
    
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    public String getDoctoEnt() {
        return this.doctoEnt;
    }
    
    public void setDoctoEnt(String doctoEnt) {
        this.doctoEnt = doctoEnt;
    }
    public Date getFechaEnt() {
        return this.fechaEnt;
    }
    
    public void setFechaEnt(Date fechaEnt) {
        this.fechaEnt = fechaEnt;
    }




}

