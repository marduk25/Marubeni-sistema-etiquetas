package com.etiquetas.qrsys.s.model;

import java.util.Date;

public class ParFactf01 implements java.io.Serializable {

    private String cveDoc;
    private int numPar;
    private String cveArt;
    private Double cant;
    private Double pxs;
    private Double prec;
    private Double cost;
    private Double impu1;
    private Double impu2;
    private Double impu3;
    private Double impu4;
    private Short imp1apla;
    private Short imp2apla;
    private Short imp3apla;
    private Short imp4apla;
    private Double totimp1;
    private Double totimp2;
    private Double totimp3;
    private Double totimp4;
    private Double desc1;
    private Double desc2;
    private Double desc3;
    private Double comi;
    private Double apar;
    private String actInv;
    private Integer numAlm;
    private String politApli;
    private Double tipCam;
    private String uniVenta;
    private String tipoProd;
    private Integer cveObs;
    private Integer regSerie;
    private Integer ELtpd;
    private String tipoElem;
    private Integer numMov;
    private Double totPartida;
    private String imprimir;
    private String manIeps;
    private Integer aplManImp;
    private Double cuotaIeps;
    private String aplManIeps;
    private Double mtoPorc;
    private Double mtoCuota;
    private Integer cveEsq;
    private String descrArt;
    private String uuid;
    private Date versionSinc;

    public ParFactf01() {
    }

    public ParFactf01(String cveDoc, int numPar) {
        this.cveDoc = cveDoc;
        this.numPar = numPar;
    }

    public ParFactf01(String cveDoc, int numPar, String cveArt, Double cant, Double pxs, Double prec, Double cost, Double impu1, Double impu2, Double impu3, Double impu4, Short imp1apla, Short imp2apla, Short imp3apla, Short imp4apla, Double totimp1, Double totimp2, Double totimp3, Double totimp4, Double desc1, Double desc2, Double desc3, Double comi, Double apar, String actInv, Integer numAlm, String politApli, Double tipCam, String uniVenta, String tipoProd, Integer cveObs, Integer regSerie, Integer ELtpd, String tipoElem, Integer numMov, Double totPartida, String imprimir, String manIeps, Integer aplManImp, Double cuotaIeps, String aplManIeps, Double mtoPorc, Double mtoCuota, Integer cveEsq, String descrArt, String uuid, Date versionSinc) {
        this.cveDoc = cveDoc;
        this.numPar = numPar;
        this.cveArt = cveArt;
        this.cant = cant;
        this.pxs = pxs;
        this.prec = prec;
        this.cost = cost;
        this.impu1 = impu1;
        this.impu2 = impu2;
        this.impu3 = impu3;
        this.impu4 = impu4;
        this.imp1apla = imp1apla;
        this.imp2apla = imp2apla;
        this.imp3apla = imp3apla;
        this.imp4apla = imp4apla;
        this.totimp1 = totimp1;
        this.totimp2 = totimp2;
        this.totimp3 = totimp3;
        this.totimp4 = totimp4;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.comi = comi;
        this.apar = apar;
        this.actInv = actInv;
        this.numAlm = numAlm;
        this.politApli = politApli;
        this.tipCam = tipCam;
        this.uniVenta = uniVenta;
        this.tipoProd = tipoProd;
        this.cveObs = cveObs;
        this.regSerie = regSerie;
        this.ELtpd = ELtpd;
        this.tipoElem = tipoElem;
        this.numMov = numMov;
        this.totPartida = totPartida;
        this.imprimir = imprimir;
        this.manIeps = manIeps;
        this.aplManImp = aplManImp;
        this.cuotaIeps = cuotaIeps;
        this.aplManIeps = aplManIeps;
        this.mtoPorc = mtoPorc;
        this.mtoCuota = mtoCuota;
        this.cveEsq = cveEsq;
        this.descrArt = descrArt;
        this.uuid = uuid;
        this.versionSinc = versionSinc;
    }

    public String getCveDoc() {
        return cveDoc;
    }

    public void setCveDoc(String cveDoc) {
        this.cveDoc = cveDoc;
    }

    public int getNumPar() {
        return numPar;
    }

    public void setNumPar(int numPar) {
        this.numPar = numPar;
    }

    public String getCveArt() {
        return cveArt;
    }

    public void setCveArt(String cveArt) {
        this.cveArt = cveArt;
    }

    public Double getCant() {
        return cant;
    }

    public void setCant(Double cant) {
        this.cant = cant;
    }

    public Double getPxs() {
        return pxs;
    }

    public void setPxs(Double pxs) {
        this.pxs = pxs;
    }

    public Double getPrec() {
        return prec;
    }

    public void setPrec(Double prec) {
        this.prec = prec;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getImpu1() {
        return impu1;
    }

    public void setImpu1(Double impu1) {
        this.impu1 = impu1;
    }

    public Double getImpu2() {
        return impu2;
    }

    public void setImpu2(Double impu2) {
        this.impu2 = impu2;
    }

    public Double getImpu3() {
        return impu3;
    }

    public void setImpu3(Double impu3) {
        this.impu3 = impu3;
    }

    public Double getImpu4() {
        return impu4;
    }

    public void setImpu4(Double impu4) {
        this.impu4 = impu4;
    }

    public Short getImp1apla() {
        return imp1apla;
    }

    public void setImp1apla(Short imp1apla) {
        this.imp1apla = imp1apla;
    }

    public Short getImp2apla() {
        return imp2apla;
    }

    public void setImp2apla(Short imp2apla) {
        this.imp2apla = imp2apla;
    }

    public Short getImp3apla() {
        return imp3apla;
    }

    public void setImp3apla(Short imp3apla) {
        this.imp3apla = imp3apla;
    }

    public Short getImp4apla() {
        return imp4apla;
    }

    public void setImp4apla(Short imp4apla) {
        this.imp4apla = imp4apla;
    }

    public Double getTotimp1() {
        return totimp1;
    }

    public void setTotimp1(Double totimp1) {
        this.totimp1 = totimp1;
    }

    public Double getTotimp2() {
        return totimp2;
    }

    public void setTotimp2(Double totimp2) {
        this.totimp2 = totimp2;
    }

    public Double getTotimp3() {
        return totimp3;
    }

    public void setTotimp3(Double totimp3) {
        this.totimp3 = totimp3;
    }

    public Double getTotimp4() {
        return totimp4;
    }

    public void setTotimp4(Double totimp4) {
        this.totimp4 = totimp4;
    }

    public Double getDesc1() {
        return desc1;
    }

    public void setDesc1(Double desc1) {
        this.desc1 = desc1;
    }

    public Double getDesc2() {
        return desc2;
    }

    public void setDesc2(Double desc2) {
        this.desc2 = desc2;
    }

    public Double getDesc3() {
        return desc3;
    }

    public void setDesc3(Double desc3) {
        this.desc3 = desc3;
    }

    public Double getComi() {
        return comi;
    }

    public void setComi(Double comi) {
        this.comi = comi;
    }

    public Double getApar() {
        return apar;
    }

    public void setApar(Double apar) {
        this.apar = apar;
    }

    public String getActInv() {
        return actInv;
    }

    public void setActInv(String actInv) {
        this.actInv = actInv;
    }

    public Integer getNumAlm() {
        return numAlm;
    }

    public void setNumAlm(Integer numAlm) {
        this.numAlm = numAlm;
    }

    public String getPolitApli() {
        return politApli;
    }

    public void setPolitApli(String politApli) {
        this.politApli = politApli;
    }

    public Double getTipCam() {
        return tipCam;
    }

    public void setTipCam(Double tipCam) {
        this.tipCam = tipCam;
    }

    public String getUniVenta() {
        return uniVenta;
    }

    public void setUniVenta(String uniVenta) {
        this.uniVenta = uniVenta;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public Integer getCveObs() {
        return cveObs;
    }

    public void setCveObs(Integer cveObs) {
        this.cveObs = cveObs;
    }

    public Integer getRegSerie() {
        return regSerie;
    }

    public void setRegSerie(Integer regSerie) {
        this.regSerie = regSerie;
    }

    public Integer getELtpd() {
        return ELtpd;
    }

    public void setELtpd(Integer ELtpd) {
        this.ELtpd = ELtpd;
    }

    public String getTipoElem() {
        return tipoElem;
    }

    public void setTipoElem(String tipoElem) {
        this.tipoElem = tipoElem;
    }

    public Integer getNumMov() {
        return numMov;
    }

    public void setNumMov(Integer numMov) {
        this.numMov = numMov;
    }

    public Double getTotPartida() {
        return totPartida;
    }

    public void setTotPartida(Double totPartida) {
        this.totPartida = totPartida;
    }

    public String getImprimir() {
        return imprimir;
    }

    public void setImprimir(String imprimir) {
        this.imprimir = imprimir;
    }

    public String getManIeps() {
        return manIeps;
    }

    public void setManIeps(String manIeps) {
        this.manIeps = manIeps;
    }

    public Integer getAplManImp() {
        return aplManImp;
    }

    public void setAplManImp(Integer aplManImp) {
        this.aplManImp = aplManImp;
    }

    public Double getCuotaIeps() {
        return cuotaIeps;
    }

    public void setCuotaIeps(Double cuotaIeps) {
        this.cuotaIeps = cuotaIeps;
    }

    public String getAplManIeps() {
        return aplManIeps;
    }

    public void setAplManIeps(String aplManIeps) {
        this.aplManIeps = aplManIeps;
    }

    public Double getMtoPorc() {
        return mtoPorc;
    }

    public void setMtoPorc(Double mtoPorc) {
        this.mtoPorc = mtoPorc;
    }

    public Double getMtoCuota() {
        return mtoCuota;
    }

    public void setMtoCuota(Double mtoCuota) {
        this.mtoCuota = mtoCuota;
    }

    public Integer getCveEsq() {
        return cveEsq;
    }

    public void setCveEsq(Integer cveEsq) {
        this.cveEsq = cveEsq;
    }

    public String getDescrArt() {
        return descrArt;
    }

    public void setDescrArt(String descrArt) {
        this.descrArt = descrArt;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getVersionSinc() {
        return versionSinc;
    }

    public void setVersionSinc(Date versionSinc) {
        this.versionSinc = versionSinc;
    }

}
