/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Daniel
 */
public class DocenteNombramiento extends Docente {

    float valor_sueldo;
    float valor_hora_extra;
    float numero_hora_extra;
    float sueldoFinal;

    public void establecerValorSueldo(float c) {
        valor_sueldo = c;
    }

    public void establecerValorHoraExtra(float c) {
        valor_hora_extra = c;
    }

    public void establecerNumeroHorasExtra(float c) {
        numero_hora_extra = c;
    }

    public void establecerSueldoFinal() {
        sueldoFinal = valor_sueldo + (valor_hora_extra * numero_hora_extra);
    }

    public float obtenerValorSueldo() {
        return valor_sueldo;
    }

    public float obtenerValorHoraExtra() {
        return valor_hora_extra;
    }

    public float obtenerNumeroHorasExtra() {
        return numero_hora_extra;
    }

    public float obtenerValorSueldoFinal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombres: %s\n"
                + "Identificacion: %s\n"
                + "Valor Sueldo: %.1f\n"
                + "Valor Horas Extra: %.1f\n"
                + "Numero de Horas Extra: %.1f\n"
                + "Sueldo Final: %.2f\n",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHorasExtra(),
                obtenerValorSueldoFinal());
        return reporte;
    }

}
