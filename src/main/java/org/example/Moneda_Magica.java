package org.example;

import java.util.Scanner;

public class Moneda_Magica {
    private static final int MAX_CLIENTES = 31;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombre = new String[MAX_CLIENTES];
        String[] codigo = new String[MAX_CLIENTES];
        String[] tipo = new String[MAX_CLIENTES];

        nombre[0]="MARTA AGUILAR RAMOS";
        nombre[1]="CARLA AYALA ALSINA";
        nombre[2]="MARIA NOELIA ALVAREZ TROYANO";
        nombre[3]="CRISTINA ALINS GONZÁLEZ";
        nombre[4]="CARLOS ACUÑA TORT";
        nombre[5]="DAVID ALGUÉ TRANCHO";
        nombre[6]="CRISTIAN BADIA CASTILLO";
        nombre[7]="JULIO ALBERTO BENITEZ FLORES";
        nombre[8]="SERGI TORRUELLA GARCIA";
        nombre[9]="ALEIX ALBERICH RODRIGUEZ";
        nombre[10]="VERÒNICA ARMENCOT PUIG";
        nombre[11]="MARIONA ALIGUÉ RIVERA";
        nombre[12]="MARC BARRIGA RIU";
        nombre[13]="GEMMA PORTELLA GISPETS";
        nombre[14]="RICARD AGUILERA BAENA";
        nombre[15]="JUAN RODRIGUEZ GARCÍA";
        nombre[16]="MARTA AGUILAR SUNYÉ";
        nombre[17]="NATÀLIA BARRIGA TARDÀ";
        nombre[18]="MARTA BARCONS LARA";
        nombre[19]="LAURA AGUILERA TATJÉ";
        nombre[20]="JOAN ALEU PRAT";
        nombre[21]="ALEXIA VALLÉS GIRVENT";
        nombre[22]="FERRAN MOLINA GARRIDO";
        nombre[23]="CRISTINA ARISSA HERMOSO";
        nombre[24]="JOSÉ ANTONIO BARALDÉS PARDO";
        nombre[25]="JORDI SUAREZ GARZÓN";
        nombre[26]="BEGONYA ARPA MORENO";
        nombre[27]="INGRID ALOY FARRANDO";
        nombre[28]="MIQUEL LUQUE GARRIGASAIT";
        nombre[29]="AGUSTÍ RIDÓ GÓMEZ";
        nombre[30]="ANTONI SANTAMARIA FLOTATS";
        // Datos codigo Ciente
        codigo[0]="CL01";
        codigo[1]="CL02";
        codigo[2]="CL03";
        codigo[3]="CL04";
        codigo[4]="CL05";
        codigo[5]="CL06";
        codigo[6]="CL07";
        codigo[7]="CL08";
        codigo[8]="CL09";
        codigo[9]="CL10";
        codigo[10]="CL11";
        codigo[11]="CL12";
        codigo[12]="CL13";
        codigo[13]="CL14";
        codigo[14]="CL15";
        codigo[15]="CL16";
        codigo[16]="CL17";
        codigo[17]="CL18";
        codigo[18]="CL19";
        codigo[19]="CL20";
        codigo[20]="CL21";
        codigo[21]="CL22";
        codigo[22]="CL23";
        codigo[23]="CL24";
        codigo[24]="CL25";
        codigo[25]="CL26";
        codigo[26]="CL27";
        codigo[27]="CL28";
        codigo[28]="CL29";
        codigo[29]="CL30";
        codigo[30]="CL31";
        // Datos Tipo de Cliente
        tipo[0]="T1";
        tipo[1]="T2";
        tipo[2]="T3";
        tipo[3]="T4";
        tipo[4]="T1";
        tipo[5]="T2";
        tipo[6]="T3";
        tipo[7]="T4";
        tipo[8]="T1";
        tipo[9]="T2";
        tipo[10]="T3";
        tipo[11]="T4";
        tipo[12]="T1";
        tipo[13]="T2";
        tipo[14]="T3";
        tipo[15]="T4";
        tipo[16]="T1";
        tipo[17]="T2";
        tipo[18]="T3";
        tipo[19]="T4";
        tipo[20]="T1";
        tipo[21]="T2";
        tipo[22]="T3";
        tipo[23]="T4";
        tipo[24]="T1";
        tipo[25]="T2";
        tipo[26]="T3";
        tipo[27]="T4";
        tipo[28]="T1";
        tipo[29]="T2";
        tipo[30]="T3";




        // Proceso General
        String tDivisa = null;
        int init = 1;

        do {
            System.out.println("Seleccione el tipo de divisa para la transacción: (d)ollar - (e)uro");
            tDivisa = sc.next(); // Selección del tipo de divisa (d)ollar ó (e)uro
            if (tDivisa.equalsIgnoreCase("d") || tDivisa.equalsIgnoreCase("e")) {
                init = 0;
            } else {
                System.out.println("Se ha seleccionado un tipo no válido");
            }
        } while (init == 1);

        String tTransac;
        init = 1;

        do {
            System.out.println("Seleccione el tipo de transacción: (c)ompra - (v)enta");
            tTransac = sc.next(); // Selección del tipo de divisa (c)ompra ó (v)enta
            if (tTransac.equalsIgnoreCase("c") || tTransac.equalsIgnoreCase("v")) {
                init = 0;
            } else {
                System.out.println("Se ha seleccionado un tipo no válido");
            }
        } while (init == 1);

        System.out.println("Ingrese el tipo de cambio");
        double tcambio = sc.nextDouble(); // Tipo de cambio.
        System.out.println("Ingrese el monto a cambiar: ");
        double monto = sc.nextDouble();

        init = 1;
        String tBusqueda = null;

        do {
            System.out.println("Busqueda de Cliente Frecuente por: (c)ódigo - (n)ombre");
            tBusqueda = sc.next();
            if (tBusqueda.equalsIgnoreCase("c") || tBusqueda.equalsIgnoreCase("n")) {
                init = 0;
            } else {
                System.out.println("Se ha seleccionado un tipo no válido");
            }
        } while (init == 1);

        String inCodigo = null;
        String tCliente = null;
        String inNombre = null;

        if (tBusqueda.equalsIgnoreCase("c")) {
            do {
                System.out.println("Ingrese código de cliente: ");
                inCodigo = sc.next();
                tCliente = tclintCod(tipo, codigo, inCodigo);
            } while (tCliente.equalsIgnoreCase("nulo"));
        } else if (tBusqueda.equalsIgnoreCase("n")) {
            do {
                System.out.println("Ingrese nombre y apellido del cliente: ");
                inNombre = sc.next();
                tCliente = tclintNombre(tipo, nombre, inNombre);
            } while (tCliente.equalsIgnoreCase("nulo"));
        }

        System.out.println("El tipo de cliente es: " + tCliente);
        double mejoraTc = obtenerMejora(tDivisa, tCliente, monto);

        double cambioMoneda = calcularCambioMoneda(tTransac, mejoraTc, monto, tcambio);
        System.out.println("El resultado del cambio es: " + cambioMoneda);
    }

    static String tclintCod(String tipo[], String codigo[], String inCodigo) {
        String tipoCliente = "nulo";
        for (int i = 0; i < codigo.length; i++) {
            if (codigo[i].equalsIgnoreCase(inCodigo)) {
                tipoCliente = tipo[i];
            }
        }
        if (tipoCliente.equalsIgnoreCase("nulo")) {
            System.out.println("Código de Cliente no válido");
        }
        return tipoCliente;
    }

    static String tclintNombre(String tipo[], String nombre[], String inNombre) {
        String tipoCliente = "nulo";
        for (int i = 0; i < nombre.length; i++) {
            if (nombre[i].equalsIgnoreCase(inNombre)) {
                tipoCliente = tipo[i];
            }
        }
        if (tipoCliente.equalsIgnoreCase("nulo")) {
            System.out.println("Código de Cliente no válido");
        }
        return tipoCliente;
    }

    static double obtenerMejora(String tDivisa, String tCliente, double monto) {
        double mejoraCambio = 0;

        if (tDivisa.equalsIgnoreCase("d")) {
            mejoraCambio = mejoraDollar(tCliente, monto);
        } else if (tDivisa.equalsIgnoreCase("e")) {
            mejoraCambio = mejoraEuro(tCliente, monto);
        }

        return mejoraCambio;
    }

    static double mejoraDollar(String tCliente, double monto) {
        double mejoraCambio=0;
        if (monto<=200){
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0;
                    break;
                case "T2":
                    mejoraCambio = 0.01;
                    break;
                case "T3":
                    mejoraCambio = 0.013;
                    break;
                case "T4":
                    mejoraCambio = 0.016;
                    break;
            }

        } else if (monto>200 && monto<=500) {
            switch (tCliente){
                case "T1":
                    mejoraCambio=0.013;
                    break;
                case "T2":
                    mejoraCambio=0.017;
                    break;
                case "T3":
                    mejoraCambio=0.02;
                    break;
                case "T4":
                    mejoraCambio=0.025;
                    break;
            }
        } else if (monto>500 && monto<=2000) {
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0.022;
                    break;
                case "T2":
                    mejoraCambio = 0.026;
                    break;
                case "T3":
                    mejoraCambio = 0.03;
                    break;
                case "T4":
                    mejoraCambio = 0.035;
                    break;
            }

        } else if (monto>2000) {
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0.033;
                    break;
                case "T2":
                    mejoraCambio = 0.035;
                    break;
                case "T3":
                    mejoraCambio = 0.04;
                    break;
                case "T4":
                    mejoraCambio = 0.042;
                    break;
            }
        }
        return mejoraCambio;
    }

    static double mejoraEuro(String tCliente, double monto) {
        double mejoraCambio=0;
        if (monto<=180){
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0;
                    break;
                case "T2":
                    mejoraCambio = 0.01;
                    break;
                case "T3":
                    mejoraCambio = 0.013;
                    break;
                case "T4":
                    mejoraCambio = 0.016;
                    break;
            }

        } else if (monto>180 && monto<=400) {
            switch (tCliente){
                case "T1":
                    mejoraCambio=0.013;
                    break;
                case "T2":
                    mejoraCambio=0.017;
                    break;
                case "T3":
                    mejoraCambio=0.02;
                    break;
                case "T4":
                    mejoraCambio=0.025;
                    break;
            }
        } else if (monto>400 && monto<=2000) {
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0.022;
                    break;
                case "T2":
                    mejoraCambio = 0.026;
                    break;
                case "T3":
                    mejoraCambio = 0.03;
                    break;
                case "T4":
                    mejoraCambio = 0.035;
                    break;
            }

        } else if (monto>2000) {
            switch (tCliente) {
                case "T1":
                    mejoraCambio = 0.033;
                    break;
                case "T2":
                    mejoraCambio = 0.035;
                    break;
                case "T3":
                    mejoraCambio = 0.04;
                    break;
                case "T4":
                    mejoraCambio = 0.042;
                    break;
            }
        }
        return mejoraCambio;
    }


    static double calcularCambioMoneda(String tTransaccion, double mejora, double monto, double tasaCambio) {
        double cambioM = 0;
        switch (tTransaccion) {
            case "c": // Si es compra
                cambioM = monto * (tasaCambio + mejora);
                break;
            case "v": // Si es venta
                cambioM = monto * (tasaCambio - mejora);
                break;
        }
        return cambioM;
    }
}
