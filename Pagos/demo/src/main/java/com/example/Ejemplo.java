package com.example;

public class Ejemplo {
    public static void main(String[] args) throws NoSuchFieldException {

        procesarPago(MetodoPago.PAYPAL);
        procesarPago(MetodoPago.CREDITO);
        procesarPago(MetodoPago.BITCOIN);
        procesarPago(MetodoPago.APPLE);
    }

    public static void ejemploConIF(MetodoPago metodoPago) {
        if (metodoPago == MetodoPago.PAYPAL) {
            crearPagoPayPal();
        } else if(metodoPago == MetodoPago.CREDITO){
            crearPagoCredito();

        } else if(metodoPago == MetodoPago.DEBITO){

        } else if(metodoPago == MetodoPago.TRANSFERENCIA){

        } else if(metodoPago == MetodoPago.BITCOIN){

        } else if(metodoPago == MetodoPago.EFECTIVO){

        } else if(metodoPago == MetodoPago.APPLE){

        } else if(metodoPago == MetodoPago.GOOGLE){

        } else {

        }
    }

    public static void crearPagoPayPal() {
    
    }

    public static void crearPagoCredito() {
    
    }

    public static void procesarPago(MetodoPago metodoPago) throws NoSuchFieldException {
        PagosBaratos pagosBaratos = new PagosBaratos();
        CrearPago pago = pagosBaratos.obtenerPago(metodoPago);
        pago.Crearpago();
    }

}
