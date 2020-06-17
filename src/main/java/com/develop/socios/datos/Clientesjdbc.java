package com.develop.socios.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.develop.socios.Cliente;

public class Clientesjdbc {

    private static final String SQL_INSERT = "insert into socios(tipoDeRegistro, marca, entidad, sucursal, numeroDeCuenta, digitoVerific, grupoCtaCte, estadoCuenta, fechaEstadoCuenta, codigoDeProducto, tipoDeSocio, tipoDeProducto, cartera, grupoDeAfinidad, descripcionAfinidad, persona, tipoDePersona, estadoDeLaTarjeta, fechaEstado, fechaDeAlta, tarjenume,vencimientoDeTarjeta, codigoDePrecio,cargoPorAlta,cantCuotasAltas, cargoPorReemplazo, cantCuotasReemplazo, cargoPorRenovacion, cantCuotasRenovacion,autoReno, limiteDeCompra, porcLimiteParaTarjeta, porcLimiteParaPrestamos, porcLimitePorPeríodo, porcSobregiro, porcentualLimiteDeCompra, porcentualLimiteDeCompraCuotas, porcentualLimiteAdelantos, porcentualLimiteAdelantadosCuotas, limiteDeCredito, amplTranLimi, vigenAnplTranLimi, apellido1, apellido2, nombre1, nombre2, fechaDeNacimiento, sexo, civilEstaCodi, email, tipoDeDocumento1, numerodeDocumento1, tipoDeDocumento2, numeroDeDocumento2, calle, puerta, depto, piso, barrio, cP, local, partido, provincia, pais, teleTipo1, numTel1, teleTipo2, numTel2, calleCorres, puertaCorres, deptoCorres, pisoCorres, barrioCorres, cPCorres, localCorres, partidoCorres, provinciaCorres, teleCodiCorres, numTeleCorres, ocupacion, formaPagoTipoML, formaPagoTipoDeCuentaMl,formaPagoDebitoMl, formaPagoCuentaMl, formaPagoTipoME, formaPagoTipoDeCuentaME,formaPagoDebitoME, formaPagoCuentaME, grupoDeCierreCambio, marcaBole, tarjeNumeAnt, limiCodi, nroClienteEntidad, porcentajeLimiteAdicional, importeLimiteAdicional, Filler) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public void insertarDatos(Cliente cliente){
        Connection cn = null;
        PreparedStatement ps = null;
        int rows = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_INSERT);

            ps.setInt(1, cliente.getTipoRegistro());
            ps.setInt(2, cliente.getMarca());
            ps.setInt(3, cliente.getEntidad());
            ps.setInt(4, cliente.getSucursal());
            ps.setInt(5, cliente.getNumDeCuenta());
            ps.setInt(6, cliente.getDigitoVerif());
            ps.setInt(7, cliente.getGrupoCtaCte());
            ps.setInt(8, cliente.getEstadoCuenta());
            ps.setString(9, cliente.getFechaEstadoCuenta());
            ps.setInt(10, cliente.getCodigoDeProducto());
            ps.setInt(11, cliente.getTipoDeSocio());
            ps.setInt(12, cliente.getTipoDeProducto());
            ps.setInt(13, cliente.getCartera());
            ps.setString(14, cliente.getGrupoDeAfinidad());
            ps.setString(15,cliente.getDescripcionAfinidad());
            ps.setInt(16, cliente.getPersona());
            ps.setInt(17, cliente.getTipoDePersona());
            ps.setInt(18, cliente.getEstadoDeLaTarjeta());
            ps.setString(19, cliente.getFechaEstado());
            ps.setString(20, cliente.getFechaAlta());
            ps.setString(21, cliente.getTarjeNume());
            ps.setString(22, cliente.getVenciminetoTarjeta());
            ps.setInt(23, cliente.getCodigoDePrecio());
            ps.setInt(24, cliente.getCargoPorAlta());
            ps.setInt(25, cliente.getCatCuotasAltas());
            ps.setInt(26, cliente.getCargoPorRemplazo());
            ps.setInt(27, cliente.getCantCuotasRemplazo());
            ps.setInt(28, cliente.getCargoPorRenovacion());
            ps.setInt(29, cliente.getCantCuotasRenovacion());
            ps.setInt(30, cliente.getAutoReno());
            ps.setInt(31, cliente.getLimiteDeCompra());
            ps.setInt(32, cliente.getPorcLimiteParaTarjeta());
            ps.setInt(33, cliente.getPorcLimiteParaPrestamos());
            ps.setInt(34, cliente.getPorcLimitePorPeriodo());
            ps.setInt(35, cliente.getPorcSobregiro());
            ps.setInt(36, cliente.getPorcentualLimiteDeCompra());
            ps.setInt(37, cliente.getPorcentualLimiteDeCompraCuotas());
            ps.setInt(38, cliente.getPorcentualLimiteAdelantos());
            ps.setInt(39, cliente.getPorcentualLimiteAdelantosCuotas());
            ps.setInt(40, cliente.getLimiteDeCredito());
            ps.setInt(41, cliente.getAmplTranLimi());
            ps.setString(42, cliente.getVigenAmplTranLimi());
            ps.setString(43, cliente.getApellido1());
            ps.setString(44, cliente.getApellido2());
            ps.setString(45, cliente.getNombre1());
            ps.setString(46, cliente.getNombre2());
            ps.setString(47, cliente.getFechaDeNacimiento());
            ps.setString(48, cliente.getSexo());
            ps.setInt(49, cliente.getCivilEstaCodi());
            ps.setString(50, cliente.getEmail());
            ps.setInt(51, cliente.getTipoDeDocumento1());
            ps.setString(52, cliente.getNumeroDeDocumento1());
            ps.setInt(53, cliente.getTipoDeDocumento2());
            ps.setString(54, cliente.getNumeroDeDocumento2());
            ps.setString(55, cliente.getCalle());
            ps.setString(56, cliente.getPuerta());
            ps.setString(57, cliente.getDepto());
            ps.setString(58, cliente.getPiso());
            ps.setString(59, cliente.getBarrio());
            ps.setString(60, cliente.getCp());
            ps.setInt(61, cliente.getLocal());
            ps.setInt(62, cliente.getPartido());
            ps.setInt(63, cliente.getProvincia());
            ps.setInt(64, cliente.getPais());
            ps.setInt(65, cliente.getTeleTipo1());
            ps.setString(66, cliente.getNumTel1());
            ps.setInt(67, cliente.getTeleTipo2());
            ps.setString(68, cliente.getNumtel2());
            ps.setString(69, cliente.getCalleCorres());
            ps.setString(70, cliente.getPuertaCorres());
            ps.setString(71, cliente.getDeptoCorres());
            ps.setString(72, cliente.getPisoCorres());
            ps.setString(73, cliente.getBarrioCorres());
            ps.setString(74, cliente.getCpCorres());
            ps.setInt(75, cliente.getLocalCorres());
            ps.setInt(76, cliente.getPartidoCorres());
            ps.setInt(77, cliente.getProvinciaCorres());
            ps.setInt(78, cliente.getTeleCodiCorres());
            ps.setString(79, cliente.getNumTeleCorres());
            ps.setInt(80, cliente.getOcupacion());
            ps.setInt(81, cliente.getFormaPagoTipoMl());
            ps.setInt(82, cliente.getFormaPagoTipoDeCuentaMl());
            ps.setInt(83, cliente.getFormaPagoDebitoMl());
            ps.setInt(84, cliente.getFormaPagoCuentaMl());
            ps.setInt(85, cliente.getFormaPagoTipoMe());
            ps.setInt(86, cliente.getFormaPagoTipoDeCuentaMe());
            ps.setInt(87, cliente.getFormaPagoDebitoMe());
            ps.setInt(88, cliente.getFormaPagoCuentaMe());
            ps.setInt(89, cliente.getGrupoDeCierreCambio());
            ps.setInt(90, cliente.getMarcaBole());
            ps.setString(91, cliente.getTarjeNumeAnt());
            ps.setString(92, cliente.getLimiCodi());
            ps.setString(93, cliente.getNroClienteEntidad());
            ps.setInt(94, cliente.getPorcentajeLimiteAdicional());
            ps.setInt(95, cliente.getImporteLimoteAdicional());
            ps.setString(96, cliente.getFiller());


            rows = ps.executeUpdate();
            System.out.println("registros insertados: "+ rows);
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(ps);
            Conexion.close(cn);
        }
        
    }


}