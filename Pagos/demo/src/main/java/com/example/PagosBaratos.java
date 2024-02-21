package com.example;

public class PagosBaratos {

    public CrearPago obtenerPago (MetodoPago metodoPago) throws NoSuchFieldException{
        return switch (metodoPago){
            case APPLE -> new PagoApple();
            case EFECTIVO-> new PagoEfectivo();
            case BITCOIN -> new PagoBitcoin();
            case CREDITO-> new PagoCredito();
            case PAYPAL -> new PagoPaypal();
            case DEBITO -> new PagoDebito();
            case GOOGLE -> new PagoGoogle();
            case TRANSFERENCIA-> new PagoTransferencia();
           

            default -> throw new NoSuchFieldException("El tipo de pago no existe.");
        };
        

    }
    
}
