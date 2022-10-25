package main.facade.impl;

import main.facade.BusquedaFacade;
import main.model.BusquedaHotel;
import main.model.BusquedaVuelo;
import main.service.HotelService;
import main.service.VueloService;

public class BusquedaFacadeImpl implements BusquedaFacade {

    private HotelService hotelService;
    private VueloService vueloService;

    public BusquedaFacadeImpl() {
        hotelService = new HotelService();
        vueloService = new VueloService();
    }

    @Override
    public String verificarBusqueda(BusquedaHotel busquedaHotel, BusquedaVuelo busquedaVuelo) {

        return hotelService.obtenerHotel(busquedaHotel) + " y " + vueloService.obtenerVuelo(busquedaVuelo);
    }
}
