/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Daniel
 */
public class DocenteFactura extends Docente {

    float valor_factura;
    float valor_iva_factura;
    float valor_cancelar;

    public void establecerValorFactura(float c) {
        valor_factura = c;
    }

    public void establecerValorIvaFactura(float c) {
        valor_iva_factura = c;
    }

    public void establecerValorCancelar() {
        valor_cancelar = valor_factura - (valor_factura * (valor_iva_factura / 100));
    }

    public float obtenerValorFactura() {
        return valor_factura;
    }

    public float obtenerValorIvaFactura() {
        return valor_iva_factura;
    }

    public float obtenerValorCancelar() {
        return valor_cancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombres: %s\n"
                + "Identificacion: %s\n"
                + "Valor Factura %.1f\n"
                + "Valor Iva Descuento: %.1f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIvaFactura(),
                obtenerValorCancelar());
        return reporte;
    }
}
