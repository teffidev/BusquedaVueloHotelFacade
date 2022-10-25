package main;

import main.facade.BusquedaFacade;
import main.facade.impl.BusquedaFacadeImpl;
import main.model.BusquedaHotel;
import main.model.BusquedaVuelo;

public class Main {
    public static void main(String[] args) {

        BusquedaFacade busquedaFacade = new BusquedaFacadeImpl();

        BusquedaHotel busquedaHotel = new BusquedaHotel("2022", "4528", "Medellin");
        BusquedaVuelo busquedaVuelo = new BusquedaVuelo("20558", "16875", "Cali", "Bogota");


        System.out.println(busquedaFacade.verificarBusqueda(busquedaHotel, busquedaVuelo));

    }
}