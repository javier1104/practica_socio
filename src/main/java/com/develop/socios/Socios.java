package com.develop.socios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.develop.socios.datos.Clientesjdbc;

public class Socios{

    
    public static void readFile(String fileName){
        File archivo = new File(fileName);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            while((lectura = entrada.readLine()) !=null){
                //System.out.println(lectura);
                String tipoRegistro = lectura.substring(0,1);//N 1
                int tipoRegis = Integer.parseInt(tipoRegistro);
                String marca = lectura.substring(1, 6);//N 2
                int marc = Integer.parseInt(marca);
                String entidad = lectura.substring(6,11);//N 3
                int entida = Integer.parseInt(entidad);
                String sucursal = lectura.substring(11, 16);//N 4
                int sucursa = Integer.parseInt(sucursal);
                String numDeCuenta = lectura.substring(16, 26);//N 5
                int numCuent = Integer.parseInt(numDeCuenta);
                String digitoVerif = lectura.substring(26, 27);//N 6
                int digitoVeri = Integer.parseInt(digitoVerif);
                String grupoCtaCte = lectura.substring(27, 30);//N 7
                int grupoCtaCt = Integer.parseInt(grupoCtaCte);
                String estadoCuenta  = lectura.substring(30, 33);//N 8
                int estadoCuent = Integer.parseInt(estadoCuenta);
                String fechaEstadoCuenta = lectura.substring(33, 41);//C 9
                String codigoDeProducto = lectura.substring(41, 44);//N 10
                int codigoDeProduct = Integer.parseInt(codigoDeProducto);
                String tipoDeSocio = lectura.substring(44, 46);//N 11
                int tipoDeSici = Integer.parseInt(tipoDeSocio);
                String tipoDeProducto = lectura.substring(46, 49);//N 12
                int tipoDeproduct = Integer.parseInt(tipoDeProducto);
                String cartera = lectura.substring(49,54);//N 13
                int carter = Integer.parseInt(cartera);
                String grupoDeAfinidad = lectura.substring(54,59);//C 14
                String descripcionAfinidad = lectura.substring(59,99);//C 15
                String persona = lectura.substring(99,109);//N 16
                int person = Integer.parseInt(persona);
                String tipoDePersona = lectura.substring(109,112);//N 17
                int tipoDePerson = Integer.parseInt(tipoDePersona);
                String estadoDeLaTarjeta = lectura.substring(112,115);//N 18
                int estadoDeLaTarjet = Integer.parseInt(estadoDeLaTarjeta);
                String fechaEstado = lectura.substring(115,123);//C 19
                String fechaAlta = lectura.substring(123,131);//C 20
                String tarjeNume = lectura.substring(131,147);//N 21 numeros con x

                //int tarjeNum = Integer.parseInt(tarjeNume);
                String venciminetoTarjeta = lectura.substring(147,155);//C 22
                String codigoDePrecio = lectura.substring(155,158);//N 23
                int codigoDePreci = Integer.parseInt(codigoDePrecio);
                String cargoPorAlta = lectura.substring(158,177);//N 24
                int cargoPorAlt = Integer.parseInt(cargoPorAlta);
                String catCuotasAltas = lectura.substring(177,180);//N 25
                int catCuotasAlta = Integer.parseInt(catCuotasAltas);
                String cargoPorRemplazo = lectura.substring(180,199);//N 26
                int cargoPorRemplaz = Integer.parseInt(cargoPorRemplazo);
                String cantCuotasRemplazo = lectura.substring(199,202);//N 27
                int cantCuotasRemplaz = Integer.parseInt(cantCuotasRemplazo);
                String cargoPorRenovacion = lectura.substring(202,221);//N 28
                int cargoPorRenovacio = Integer.parseInt(cargoPorRenovacion);
                String cantCuotasRenovacion = lectura.substring(221,224);//N 29
                int cantCuotasRenovacio = Integer.parseInt(cantCuotasRenovacion);
                String autoReno = lectura.substring(224,225);//N 30
                int autoRen = Integer.parseInt(autoReno);
                String limiteDeCompra = lectura.substring(225,244);//N 31
                int limiteDeCompr = Integer.parseInt(limiteDeCompra);
                String porcLimiteParaTarjeta = lectura.substring(244,250);//N 32
                int porcLimiteParaTarjet = Integer.parseInt(porcLimiteParaTarjeta);
                String porcLimiteParaPrestamos = lectura.substring(250,256);//N 33
                int porcLimiteParaPrestamo = Integer.parseInt(porcLimiteParaPrestamos);
                String porcLimitePorPeriodo = lectura.substring(256,262);//N 34
                int porcLimitePorPeriod = Integer.parseInt(porcLimitePorPeriodo);
                String porcSobregiro = lectura.substring(262,268);//N 35
                int porcSobregir = Integer.parseInt(porcSobregiro);
                String porcentualLimiteDeCompra = lectura.substring(268,274);//N 36
                int porcentualLimiteDeCompr = Integer.parseInt(porcentualLimiteDeCompra);
                String porcentualLimiteDeCompraCuotas = lectura.substring(274,280);//N 37
                int porcentualLimiteDeCompraCuota = Integer.parseInt(porcentualLimiteDeCompraCuotas);
                String porcentualLimiteAdelantos = lectura.substring(280,286);//N 38
                int porcentualLimiteAdelanto = Integer.parseInt(porcentualLimiteAdelantos);
                String porcentualLimiteAdelantosCuotas = lectura.substring(286,292);//N 39
                int porcentualLimiteAdelantosCuota = Integer.parseInt(porcentualLimiteAdelantosCuotas);
                String limiteDeCredito = lectura.substring(292,311);//N 40
                int limiteDeCredit = Integer.parseInt(limiteDeCredito);
                String amplTranLimi = lectura.substring(311,330);//N 41
                int amplTranLim = Integer.parseInt(amplTranLimi);
                String vigenAmplTranLimi = lectura.substring(330,338);//C 42
                String apellido1 = lectura.substring(338,388);//C 43
                String apellido2 = lectura.substring(388,438);//C 44
                String nombre1 = lectura.substring(438,488);//C 45
                String nombre2 = lectura.substring(488,538);//C 46
                String fechaDeNacimiento = lectura.substring(538,546);//C 47
                String sexo = lectura.substring(546, 547);//C 48
                String civilEstaCodi = lectura.substring(547,550);//N 49
                int civilEstaCod = Integer.parseInt(civilEstaCodi);
                String email = lectura.substring(550,610);//C 50
                String tipoDeDocumento1 = lectura.substring(610,615);//N 51
                int tipoDeDocument1 = Integer.parseInt(tipoDeDocumento1);
                String numeroDeDocumento1 = lectura.substring(615,630);//C 52
                String tipoDeDocumento2 = lectura.substring(630,635);//N 53
                int tipoDeDocument2 = Integer.parseInt(tipoDeDocumento2);
                String numeroDeDocumento2 = lectura.substring(635,650);//C 54
                String calle = lectura.substring(650,710);//C 55
                String puerta = lectura.substring(710,720);//C 56
                String depto = lectura.substring(720,735);//C 57
                String piso = lectura.substring(735,737);//c 58
                String barrio = lectura.substring(737,762);//C 59
                String cp = lectura.substring(762,770);//C 60
                String local = lectura.substring(770,776);//N 61
                int loca = Integer.parseInt(local);
                String partido = lectura.substring(776,782);//N 62
                int partid = Integer.parseInt(partido);
                String provincia = lectura.substring(782,785);//N 63
                int provinci = Integer.parseInt(provincia);
                String pais = lectura.substring(785,788);//N 64
                int pai = Integer.parseInt(pais);
                String teleTipo1 = lectura.substring(788,791);//N 65
                int teleTip1 = Integer.parseInt(teleTipo1);
                String numTel1 = lectura.substring(791,809);//c 66
                String teleTipo2 = lectura.substring(809,812);//N 67
                int teleTip2 = Integer.parseInt(teleTipo2);
                String numtel2 = lectura.substring(812,830);//C 68
                String calleCorres = lectura.substring(830,890);//c 69
                String puertaCorres = lectura.substring(890,900);//c 70
                String deptoCorres = lectura.substring(900,915);//c 71
                String pisoCorres = lectura.substring(915,917);//c 72
                String barrioCorres = lectura.substring(917,942);//C 73
                String cpCorres = lectura.substring(942,950);//C 74
                String localCorres = lectura.substring(950,956);//N 75
                int localCorre = Integer.parseInt(localCorres);
                String partidoCorres = lectura.substring(956,962);//N 76
                int partidoCorre = Integer.parseInt(partidoCorres);
                String provinciaCorres = lectura.substring(962,965);//N 77
                int provinciaCorre = Integer.parseInt(provinciaCorres);
                String teleCodiCorres = lectura.substring(965,968);//N 78
                int teleCodiCorre = Integer.parseInt(teleCodiCorres);
                String numTeleCorres = lectura.substring(968,986);//C 79
                String ocupacion = lectura.substring(986,991);//N 80
                int ocupacio = Integer.parseInt(ocupacion);
                String formaPagoTipoMl = lectura.substring(991,993);//N 81
                int formaPagoTipMl = Integer.parseInt(formaPagoTipoMl);
                String formaPagoTipoDeCuentaMl = lectura.substring(993,996);//N 82
                int formaPagoTipoDeCuentMl = Integer.parseInt(formaPagoTipoDeCuentaMl);
                String formaPagoDebitoMl = lectura.substring(996,999);//N 83
                int formaPagoDebitMl = Integer.parseInt(formaPagoDebitoMl);
                String formaPagoCuentaMl = lectura.substring(999,1014);//N 84
                int formaPagoCuentMl = Integer.parseInt(formaPagoCuentaMl);
                String formaPagoTipoMe = lectura.substring(1014,1016);//N 85
                int formaPagoTipMe = Integer.parseInt(formaPagoTipoMe);
                String formaPagoTipoDeCuentaMe = lectura.substring(1016,1019);//N 86
                int formaPagoTipoDeCuentMe = Integer.parseInt(formaPagoTipoDeCuentaMe);
                String formaPagoDebitoMe = lectura.substring(1019,1022);//N 87
                int formaPagoDebitMe = Integer.parseInt(formaPagoDebitoMe);
                String formaPagoCuentaMe = lectura.substring(1022,1037);//N 88
                int formaPagoCuentMe = Integer.parseInt(formaPagoCuentaMe);
                String grupoDeCierreCambio = lectura.substring(1037,1040);//N 89
                int grupoDeCierreCambi = Integer.parseInt(grupoDeCierreCambio);
                String marcaBole = lectura.substring(1040,1041);//N 90
                int marcaBol = Integer.parseInt(marcaBole);
                String tarjeNumeAnt = lectura.substring(1041,1057);//N 91
               
                //int tarjeNumAnt = Integer.parseInt(tarjeNumeAnt); datos numeros y letras
                String limiCodi = lectura.substring(1057,1062);//N 92
                //int limiCod = Integer.parseInt(limiCodi); no permite conversion 
                String nroClienteEntidad = lectura.substring(1062,1082);//c 93
                String porcentajeLimiteAdicional = lectura.substring(1082,1087);//N 94
                int porcentajeLimiteAdiciona = Integer.parseInt(porcentajeLimiteAdicional);
                String importeLimoteAdicional = lectura.substring(1087,1106);//N 95
                int importeLimoteAdiciona = Integer.parseInt(importeLimoteAdicional);
                String filler = lectura.substring(1106,1200);//c 96

                Cliente cliente = new Cliente(tipoRegis, marc, entida, sucursa, numCuent, digitoVeri, grupoCtaCt, estadoCuent, fechaEstadoCuenta, codigoDeProduct, tipoDeSici, tipoDeproduct, carter, grupoDeAfinidad, descripcionAfinidad, person, tipoDePerson, estadoDeLaTarjet, fechaEstado, fechaAlta, tarjeNume, venciminetoTarjeta, codigoDePreci, cargoPorAlt, catCuotasAlta, cargoPorRemplaz, cantCuotasRemplaz, cargoPorRenovacio, cantCuotasRenovacio, autoRen, limiteDeCompr, porcLimiteParaTarjet, porcLimiteParaPrestamo, porcLimitePorPeriod, porcSobregir, porcentualLimiteDeCompr, porcentualLimiteDeCompraCuota, porcentualLimiteAdelanto, porcentualLimiteAdelantosCuota, limiteDeCredit, amplTranLim, vigenAmplTranLimi, apellido1, apellido2, nombre1, nombre2, fechaDeNacimiento, sexo, civilEstaCod, email, tipoDeDocument1, numeroDeDocumento1, tipoDeDocument2, numeroDeDocumento2, calle, puerta, depto, piso, barrio, cp, loca, partid, provinci, pai, teleTip1, numTel1, teleTip2, numtel2, calleCorres, puertaCorres, deptoCorres, pisoCorres, barrioCorres, cpCorres, localCorre, partidoCorre, provinciaCorre, teleCodiCorre, numTeleCorres, ocupacio, formaPagoTipMl, formaPagoTipoDeCuentMl, formaPagoDebitMl, formaPagoCuentMl, formaPagoTipMe, formaPagoTipoDeCuentMe, formaPagoDebitMe, formaPagoCuentMe, grupoDeCierreCambi, marcaBol, tarjeNumeAnt, limiCodi, nroClienteEntidad, porcentajeLimiteAdiciona, importeLimoteAdiciona, filler);
                Clientesjdbc clientejdbc = new Clientesjdbc();
                clientejdbc.insertarDatos(cliente);

                // System.out.println("datos estraidos: "+tipoRegistro +" "
                // + tarjeNume + " "+ limiCodi);

                            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("error al leer el archivo "+ ex.getMessage());
            
        }catch(IOException iex){
            System.out.println("error al leer en el archivo "+ iex.getMessage());

        }

    }


}