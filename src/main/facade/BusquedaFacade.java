package main.facade;

import main.model.BusquedaHotel;
import main.model.BusquedaVuelo;

public interface BusquedaFacade {

    String verificarBusqueda(BusquedaHotel busquedaHotel, BusquedaVuelo busquedaVuelo);

}
