package com.etiquetas.qrsys.dao;

import com.etiquetas.qrsys.e.model.Factura;
import java.util.List;

public interface FacturaDao {

    public List<Factura> listaFactura();

    public List<Factura> listaBuscarFactura(String nofactura);

    public Factura obtenerIdFactura(Factura factura);

    public Factura returnIdFactura(Factura factura);

    public void saveFactura(Factura factura);

    public void updateFactura(Factura factura);

    public void deleteFactura(Factura factura);

}