/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int op;

        System.out.println("Ingrese [1] para crear Docente Nombramiento\n"
                + "Ingrese [2] para crear Docente Factura");
        op = entrada.nextInt();

        if (op < 1 || op > 2) {
            System.err.println("Error, opción no válida.");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese cedula: ");
            String cedula = entrada.nextLine();

            switch (op) {
                case 1:
                    DocenteNombramiento docente = new DocenteNombramiento();
                    docente.establecerNombres(nombres);
                    docente.establecerCedula(cedula);

                    System.out.println("Ingrese el valor del sueldo: ");
                    docente.establecerValorSueldo(entrada.nextFloat());
                    System.out.println("Ingrese el valor de hora extra: ");
                    docente.establecerValorHoraExtra(entrada.nextFloat());
                    System.out.println("Ingrese el numero de horas extra: ");
                    docente.establecerNumeroHorasExtra(entrada.nextFloat());
                    docente.establecerSueldoFinal();
                    System.out.printf("%s\n", docente);
                    break;
                case 2:
                    DocenteFactura docenteF = new DocenteFactura();
                    docenteF.establecerNombres(nombres);
                    docenteF.establecerCedula(cedula);

                    System.out.println("Ingrese el Valor de Factura: ");
                    docenteF.establecerValorFactura(entrada.nextFloat());
                    System.out.println("Ingrese el descuento porcentaje iva: ");
                    docenteF.establecerValorIvaFactura(entrada.nextFloat());
                    docenteF.establecerValorCancelar();
                    System.out.printf("%s\n", docenteF);
                    break;
                default: break;
            }
        }
    }
}
