package com.develop.socios;

public class Cliente {

    private int tipoRegistro;//N 1
    private int marca;//N 2
    private int entidad;//N 3 
    private int sucursal;//N 4
    private int numDeCuenta;//N 5
    private int digitoVerif;//N 6
    private int grupoCtaCte;//N 7
    private int estadoCuenta;//N 8
    private String fechaEstadoCuenta;//C 9
    private int codigoDeProducto;//N 10
    private int tipoDeSocio;//N 11
    private int tipoDeProducto;//N 12
    private int cartera;//N 13
    private String grupoDeAfinidad;//C 14
    private String descripcionAfinidad;//C 15
    private int persona;//N 16
    private int tipoDePersona;//N 17
    private int estadoDeLaTarjeta;//N 18
    private String fechaEstado;//C 19
    private String fechaAlta;//C 20
    private String tarjeNume;//N 21 no permite conversion
    private String venciminetoTarjeta;//C 22
    private int codigoDePrecio;//N 23
    private int cargoPorAlta;//N 24
    private int catCuotasAltas;//N 25
    private int cargoPorRemplazo;//N 26
    private int cantCuotasRemplazo;//N 27
    private int cargoPorRenovacion;//N 28
    private int cantCuotasRenovacion;//N 29
    private int autoReno;//N 30
    private int limiteDeCompra;//N 31
    private int porcLimiteParaTarjeta;//N 32
    private int porcLimiteParaPrestamos;//N 33
    private int porcLimitePorPeriodo;//N 34
    private int porcSobregiro;//N 35
    private int porcentualLimiteDeCompra;//N 36
    private int porcentualLimiteDeCompraCuotas;//N 37
    private int porcentualLimiteAdelantos;//N 38
    private int porcentualLimiteAdelantosCuotas;//N 39
    private int limiteDeCredito;//N 40
    private int amplTranLimi;//N 41
    private String vigenAmplTranLimi;//C 42
    private String apellido1;//C 43
    private String apellido2;//C 44
    private String nombre1;//C 45
    private String nombre2;//C 46
    private String fechaDeNacimiento;//C 47
    private String sexo;//C 48
    private int civilEstaCodi;//N 49
    private String email;//C 50
    private int tipoDeDocumento1;//N 51
    private String numeroDeDocumento1;//C 52
    private int tipoDeDocumento2;//N 53
    private String numeroDeDocumento2;//C 54
    private String calle;//C 55
    private String puerta;//C 56
    private String depto;//C 57
    private String piso;//c 58
    private String barrio;//C 59
    private String cp;//C 60
    private int local;//N 61
    private int partido;//N 62
    private int provincia;//N 63
    private int pais;//N 64
    private int teleTipo1;//N 65
    private String numTel1;//c 66
    private int teleTipo2;//N 67
    private String numtel2;//C 68
    private String calleCorres;//c 69
    private String puertaCorres;//c 70
    private String deptoCorres;//c 71
    private String pisoCorres;//c 72
    private String barrioCorres;//C 73
    private String cpCorres;//C 74
    private int localCorres;//N 75
    private int partidoCorres;//N 76
    private int provinciaCorres;//N 77
    private int teleCodiCorres;//N 78
    private String numTeleCorres;//C 79
    private int ocupacion;//N 80
    private int formaPagoTipoMl;//N 81
    private int formaPagoTipoDeCuentaMl;//N 82
    private int formaPagoDebitoMl;//N 83
    private int formaPagoCuentaMl;//N 84
    private int formaPagoTipoMe;//N 85
    private int formaPagoTipoDeCuentaMe;//N 86
    private int formaPagoDebitoMe;//N 87
    private int formaPagoCuentaMe;//N 88
    private int grupoDeCierreCambio;//N 89
    private int marcaBole;//N 90
    private String tarjeNumeAnt;//N 91 no permite conversion
    private String limiCodi;//N 92 no permite conversion 
    private String nroClienteEntidad;//c 93
    private int porcentajeLimiteAdicional;//N 94
    private int importeLimoteAdicional;//N 95
    private String filler;//c 96

    public Cliente(int tipoRegistro, int marca,int entidad, int sucursal, int numDeCuenta, int digitoVerif, int grupoCtaCte,
            int estadoCuenta, String fechaEstadoCuenta, int codigoDeProducto, int tipoDeSocio, int tipoDeProducto,
            int cartera, String grupoDeAfinidad, String descripcionAfinidad, int persona, int tipoDePersona,
            int estadoDeLaTarjeta, String fechaEstado, String fechaAlta, String tarjeNume, String venciminetoTarjeta,
            int codigoDePrecio, int cargoPorAlta, int catCuotasAltas, int cargoPorRemplazo, int cantCuotasRemplazo,
            int cargoPorRenovacion, int cantCuotasRenovacion, int autoReno, int limiteDeCompra,
            int porcLimiteParaTarjeta, int porcLimiteParaPrestamos, int porcLimitePorPeriodo, int porcSobregiro,
            int porcentualLimiteDeCompra, int porcentualLimiteDeCompraCuotas, int porcentualLimiteAdelantos,
            int porcentualLimiteAdelantosCuotas, int limiteDeCredito, int amplTranLimi, String vigenAmplTranLimi,
            String apellido1, String apellido2, String nombre1, String nombre2, String fechaDeNacimiento, String sexo,
            int civilEstaCodi, String email, int tipoDeDocumento1, String numeroDeDocumento1, int tipoDeDocumento2,
            String numeroDeDocumento2, String calle, String puerta, String depto, String piso, String barrio, String cp,
            int local, int partido, int provincia, int pais, int teleTipo1, String numTel1, int teleTipo2,
            String numtel2, String calleCorres, String puertaCorres, String deptoCorres, String pisoCorres,
            String barrioCorres, String cpCorres, int localCorres, int partidoCorres, int provinciaCorres,
            int teleCodiCorres, String numTeleCorres, int ocupacion, int formaPagoTipoMl, int formaPagoTipoDeCuentaMl,
            int formaPagoDebitoMl, int formaPagoCuentaMl, int formaPagoTipoMe, int formaPagoTipoDeCuentaMe,
            int formaPagoDebitoMe, int formaPagoCuentaMe, int grupoDeCierreCambio, int marcaBole, String tarjeNumeAnt,
            String limiCodi, String nroClienteEntidad, int porcentajeLimiteAdicional, int importeLimoteAdicional,
            String filler) {
        this.tipoRegistro = tipoRegistro;
        this.marca = marca;
        this.entidad = entidad;
        this.sucursal = sucursal;
        this.numDeCuenta = numDeCuenta;
        this.digitoVerif = digitoVerif;
        this.grupoCtaCte = grupoCtaCte;
        this.estadoCuenta = estadoCuenta;
        this.fechaEstadoCuenta = fechaEstadoCuenta;
        this.codigoDeProducto = codigoDeProducto;
        this.tipoDeSocio = tipoDeSocio;
        this.tipoDeProducto = tipoDeProducto;
        this.cartera = cartera;
        this.grupoDeAfinidad = grupoDeAfinidad;
        this.descripcionAfinidad = descripcionAfinidad;
        this.persona = persona;
        this.tipoDePersona = tipoDePersona;
        this.estadoDeLaTarjeta = estadoDeLaTarjeta;
        this.fechaEstado = fechaEstado;
        this.fechaAlta = fechaAlta;
        this.tarjeNume = tarjeNume;
        this.venciminetoTarjeta = venciminetoTarjeta;
        this.codigoDePrecio = codigoDePrecio;
        this.cargoPorAlta = cargoPorAlta;
        this.catCuotasAltas = catCuotasAltas;
        this.cargoPorRemplazo = cargoPorRemplazo;
        this.cantCuotasRemplazo = cantCuotasRemplazo;
        this.cargoPorRenovacion = cargoPorRenovacion;
        this.cantCuotasRenovacion = cantCuotasRenovacion;
        this.autoReno = autoReno;
        this.limiteDeCompra = limiteDeCompra;
        this.porcLimiteParaTarjeta = porcLimiteParaTarjeta;
        this.porcLimiteParaPrestamos = porcLimiteParaPrestamos;
        this.porcLimitePorPeriodo = porcLimitePorPeriodo;
        this.porcSobregiro = porcSobregiro;
        this.porcentualLimiteDeCompra = porcentualLimiteDeCompra;
        this.porcentualLimiteDeCompraCuotas = porcentualLimiteDeCompraCuotas;
        this.porcentualLimiteAdelantos = porcentualLimiteAdelantos;
        this.porcentualLimiteAdelantosCuotas = porcentualLimiteAdelantosCuotas;
        this.limiteDeCredito = limiteDeCredito;
        this.amplTranLimi = amplTranLimi;
        this.vigenAmplTranLimi = vigenAmplTranLimi;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.civilEstaCodi = civilEstaCodi;
        this.email = email;
        this.tipoDeDocumento1 = tipoDeDocumento1;
        this.numeroDeDocumento1 = numeroDeDocumento1;
        this.tipoDeDocumento2 = tipoDeDocumento2;
        this.numeroDeDocumento2 = numeroDeDocumento2;
        this.calle = calle;
        this.puerta = puerta;
        this.depto = depto;
        this.piso = piso;
        this.barrio = barrio;
        this.cp = cp;
        this.local = local;
        this.partido = partido;
        this.provincia = provincia;
        this.pais = pais;
        this.teleTipo1 = teleTipo1;
        this.numTel1 = numTel1;
        this.teleTipo2 = teleTipo2;
        this.numtel2 = numtel2;
        this.calleCorres = calleCorres;
        this.puertaCorres = puertaCorres;
        this.deptoCorres = deptoCorres;
        this.pisoCorres = pisoCorres;
        this.barrioCorres = barrioCorres;
        this.cpCorres = cpCorres;
        this.localCorres = localCorres;
        this.partidoCorres = partidoCorres;
        this.provinciaCorres = provinciaCorres;
        this.teleCodiCorres = teleCodiCorres;
        this.numTeleCorres = numTeleCorres;
        this.ocupacion = ocupacion;
        this.formaPagoTipoMl = formaPagoTipoMl;
        this.formaPagoTipoDeCuentaMl = formaPagoTipoDeCuentaMl;
        this.formaPagoDebitoMl = formaPagoDebitoMl;
        this.formaPagoCuentaMl = formaPagoCuentaMl;
        this.formaPagoTipoMe = formaPagoTipoMe;
        this.formaPagoTipoDeCuentaMe = formaPagoTipoDeCuentaMe;
        this.formaPagoDebitoMe = formaPagoDebitoMe;
        this.formaPagoCuentaMe = formaPagoCuentaMe;
        this.grupoDeCierreCambio = grupoDeCierreCambio;
        this.marcaBole = marcaBole;
        this.tarjeNumeAnt = tarjeNumeAnt;
        this.limiCodi = limiCodi;
        this.nroClienteEntidad = nroClienteEntidad;
        this.porcentajeLimiteAdicional = porcentajeLimiteAdicional;
        this.importeLimoteAdicional = importeLimoteAdicional;
        this.filler = filler;
    }


    public int getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getEntidad() {
        return entidad;
    }

    public void setEntidad(int entidad) {
        this.entidad = entidad;
    }
    

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(int numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public int getDigitoVerif() {
        return digitoVerif;
    }

    public void setDigitoVerif(int digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public int getGrupoCtaCte() {
        return grupoCtaCte;
    }

    public void setGrupoCtaCte(int grupoCtaCte) {
        this.grupoCtaCte = grupoCtaCte;
    }

    public int getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(int estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getFechaEstadoCuenta() {
        return fechaEstadoCuenta;
    }

    public void setFechaEstadoCuenta(String fechaEstadoCuenta) {
        this.fechaEstadoCuenta = fechaEstadoCuenta;
    }

    public int getCodigoDeProducto() {
        return codigoDeProducto;
    }

    public void setCodigoDeProducto(int codigoDeProducto) {
        this.codigoDeProducto = codigoDeProducto;
    }

    public int getTipoDeSocio() {
        return tipoDeSocio;
    }

    public void setTipoDeSocio(int tipoDeSocio) {
        this.tipoDeSocio = tipoDeSocio;
    }

    public int getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(int tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public int getCartera() {
        return cartera;
    }

    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    public String getGrupoDeAfinidad() {
        return grupoDeAfinidad;
    }

    public void setGrupoDeAfinidad(String grupoDeAfinidad) {
        this.grupoDeAfinidad = grupoDeAfinidad;
    }

    public String getDescripcionAfinidad() {
        return descripcionAfinidad;
    }

    public void setDescripcionAfinidad(String descripcionAfinidad) {
        this.descripcionAfinidad = descripcionAfinidad;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getTipoDePersona() {
        return tipoDePersona;
    }

    public void setTipoDePersona(int tipoDePersona) {
        this.tipoDePersona = tipoDePersona;
    }

    public int getEstadoDeLaTarjeta() {
        return estadoDeLaTarjeta;
    }

    public void setEstadoDeLaTarjeta(int estadoDeLaTarjeta) {
        this.estadoDeLaTarjeta = estadoDeLaTarjeta;
    }

    public String getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(String fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getTarjeNume() {
        return tarjeNume;
    }

    public void setTarjeNume(String tarjeNume) {
        this.tarjeNume = tarjeNume;
    }

    public String getVenciminetoTarjeta() {
        return venciminetoTarjeta;
    }

    public void setVenciminetoTarjeta(String venciminetoTarjeta) {
        this.venciminetoTarjeta = venciminetoTarjeta;
    }

    public int getCodigoDePrecio() {
        return codigoDePrecio;
    }

    public void setCodigoDePrecio(int codigoDePrecio) {
        this.codigoDePrecio = codigoDePrecio;
    }

    public int getCargoPorAlta() {
        return cargoPorAlta;
    }

    public void setCargoPorAlta(int cargoPorAlta) {
        this.cargoPorAlta = cargoPorAlta;
    }

    public int getCatCuotasAltas() {
        return catCuotasAltas;
    }

    public void setCatCuotasAltas(int catCuotasAltas) {
        this.catCuotasAltas = catCuotasAltas;
    }

    public int getCargoPorRemplazo() {
        return cargoPorRemplazo;
    }

    public void setCargoPorRemplazo(int cargoPorRemplazo) {
        this.cargoPorRemplazo = cargoPorRemplazo;
    }

    public int getCantCuotasRemplazo() {
        return cantCuotasRemplazo;
    }

    public void setCantCuotasRemplazo(int cantCuotasRemplazo) {
        this.cantCuotasRemplazo = cantCuotasRemplazo;
    }

    public int getCargoPorRenovacion() {
        return cargoPorRenovacion;
    }

    public void setCargoPorRenovacion(int cargoPorRenovacion) {
        this.cargoPorRenovacion = cargoPorRenovacion;
    }

    public int getCantCuotasRenovacion() {
        return cantCuotasRenovacion;
    }

    public void setCantCuotasRenovacion(int cantCuotasRenovacion) {
        this.cantCuotasRenovacion = cantCuotasRenovacion;
    }

    public int getAutoReno() {
        return autoReno;
    }

    public void setAutoReno(int autoReno) {
        this.autoReno = autoReno;
    }

    public int getLimiteDeCompra() {
        return limiteDeCompra;
    }

    public void setLimiteDeCompra(int limiteDeCompra) {
        this.limiteDeCompra = limiteDeCompra;
    }

    public int getPorcLimiteParaTarjeta() {
        return porcLimiteParaTarjeta;
    }

    public void setPorcLimiteParaTarjeta(int porcLimiteParaTarjeta) {
        this.porcLimiteParaTarjeta = porcLimiteParaTarjeta;
    }

    public int getPorcLimiteParaPrestamos() {
        return porcLimiteParaPrestamos;
    }

    public void setPorcLimiteParaPrestamos(int porcLimiteParaPrestamos) {
        this.porcLimiteParaPrestamos = porcLimiteParaPrestamos;
    }

    public int getPorcLimitePorPeriodo() {
        return porcLimitePorPeriodo;
    }

    public void setPorcLimitePorPeriodo(int porcLimitePorPeriodo) {
        this.porcLimitePorPeriodo = porcLimitePorPeriodo;
    }

    public int getPorcSobregiro() {
        return porcSobregiro;
    }

    public void setPorcSobregiro(int porcSobregiro) {
        this.porcSobregiro = porcSobregiro;
    }

    public int getPorcentualLimiteDeCompra() {
        return porcentualLimiteDeCompra;
    }

    public void setPorcentualLimiteDeCompra(int porcentualLimiteDeCompra) {
        this.porcentualLimiteDeCompra = porcentualLimiteDeCompra;
    }

    public int getPorcentualLimiteDeCompraCuotas() {
        return porcentualLimiteDeCompraCuotas;
    }

    public void setPorcentualLimiteDeCompraCuotas(int porcentualLimiteDeCompraCuotas) {
        this.porcentualLimiteDeCompraCuotas = porcentualLimiteDeCompraCuotas;
    }

    public int getPorcentualLimiteAdelantos() {
        return porcentualLimiteAdelantos;
    }

    public void setPorcentualLimiteAdelantos(int porcentualLimiteAdelantos) {
        this.porcentualLimiteAdelantos = porcentualLimiteAdelantos;
    }

    public int getPorcentualLimiteAdelantosCuotas() {
        return porcentualLimiteAdelantosCuotas;
    }

    public void setPorcentualLimiteAdelantosCuotas(int porcentualLimiteAdelantosCuotas) {
        this.porcentualLimiteAdelantosCuotas = porcentualLimiteAdelantosCuotas;
    }

    public int getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(int limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public int getAmplTranLimi() {
        return amplTranLimi;
    }

    public void setAmplTranLimi(int amplTranLimi) {
        this.amplTranLimi = amplTranLimi;
    }

    public String getVigenAmplTranLimi() {
        return vigenAmplTranLimi;
    }

    public void setVigenAmplTranLimi(String vigenAmplTranLimi) {
        this.vigenAmplTranLimi = vigenAmplTranLimi;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCivilEstaCodi() {
        return civilEstaCodi;
    }

    public void setCivilEstaCodi(int civilEstaCodi) {
        this.civilEstaCodi = civilEstaCodi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoDeDocumento1() {
        return tipoDeDocumento1;
    }

    public void setTipoDeDocumento1(int tipoDeDocumento1) {
        this.tipoDeDocumento1 = tipoDeDocumento1;
    }

    public String getNumeroDeDocumento1() {
        return numeroDeDocumento1;
    }

    public void setNumeroDeDocumento1(String numeroDeDocumento1) {
        this.numeroDeDocumento1 = numeroDeDocumento1;
    }

    public int getTipoDeDocumento2() {
        return tipoDeDocumento2;
    }

    public void setTipoDeDocumento2(int tipoDeDocumento2) {
        this.tipoDeDocumento2 = tipoDeDocumento2;
    }

    public String getNumeroDeDocumento2() {
        return numeroDeDocumento2;
    }

    public void setNumeroDeDocumento2(String numeroDeDocumento2) {
        this.numeroDeDocumento2 = numeroDeDocumento2;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getTeleTipo1() {
        return teleTipo1;
    }

    public void setTeleTipo1(int teleTipo1) {
        this.teleTipo1 = teleTipo1;
    }

    public String getNumTel1() {
        return numTel1;
    }

    public void setNumTel1(String numTel1) {
        this.numTel1 = numTel1;
    }

    public int getTeleTipo2() {
        return teleTipo2;
    }

    public void setTeleTipo2(int teleTipo2) {
        this.teleTipo2 = teleTipo2;
    }

    public String getNumtel2() {
        return numtel2;
    }

    public void setNumtel2(String numtel2) {
        this.numtel2 = numtel2;
    }

    public String getCalleCorres() {
        return calleCorres;
    }

    public void setCalleCorres(String calleCorres) {
        this.calleCorres = calleCorres;
    }

    public String getPuertaCorres() {
        return puertaCorres;
    }

    public void setPuertaCorres(String puertaCorres) {
        this.puertaCorres = puertaCorres;
    }

    public String getDeptoCorres() {
        return deptoCorres;
    }

    public void setDeptoCorres(String deptoCorres) {
        this.deptoCorres = deptoCorres;
    }

    public String getPisoCorres() {
        return pisoCorres;
    }

    public void setPisoCorres(String pisoCorres) {
        this.pisoCorres = pisoCorres;
    }

    public String getBarrioCorres() {
        return barrioCorres;
    }

    public void setBarrioCorres(String barrioCorres) {
        this.barrioCorres = barrioCorres;
    }

    public String getCpCorres() {
        return cpCorres;
    }

    public void setCpCorres(String cpCorres) {
        this.cpCorres = cpCorres;
    }

    public int getLocalCorres() {
        return localCorres;
    }

    public void setLocalCorres(int localCorres) {
        this.localCorres = localCorres;
    }

    public int getPartidoCorres() {
        return partidoCorres;
    }

    public void setPartidoCorres(int partidoCorres) {
        this.partidoCorres = partidoCorres;
    }

    public int getProvinciaCorres() {
        return provinciaCorres;
    }

    public void setProvinciaCorres(int provinciaCorres) {
        this.provinciaCorres = provinciaCorres;
    }

    public int getTeleCodiCorres() {
        return teleCodiCorres;
    }

    public void setTeleCodiCorres(int teleCodiCorres) {
        this.teleCodiCorres = teleCodiCorres;
    }

    public String getNumTeleCorres() {
        return numTeleCorres;
    }

    public void setNumTeleCorres(String numTeleCorres) {
        this.numTeleCorres = numTeleCorres;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getFormaPagoTipoMl() {
        return formaPagoTipoMl;
    }

    public void setFormaPagoTipoMl(int formaPagoTipoMl) {
        this.formaPagoTipoMl = formaPagoTipoMl;
    }

    public int getFormaPagoTipoDeCuentaMl() {
        return formaPagoTipoDeCuentaMl;
    }

    public void setFormaPagoTipoDeCuentaMl(int formaPagoTipoDeCuentaMl) {
        this.formaPagoTipoDeCuentaMl = formaPagoTipoDeCuentaMl;
    }

    public int getFormaPagoDebitoMl() {
        return formaPagoDebitoMl;
    }

    public void setFormaPagoDebitoMl(int formaPagoDebitoMl) {
        this.formaPagoDebitoMl = formaPagoDebitoMl;
    }

    public int getFormaPagoCuentaMl() {
        return formaPagoCuentaMl;
    }

    public void setFormaPagoCuentaMl(int formaPagoCuentaMl) {
        this.formaPagoCuentaMl = formaPagoCuentaMl;
    }

    public int getFormaPagoTipoMe() {
        return formaPagoTipoMe;
    }

    public void setFormaPagoTipoMe(int formaPagoTipoMe) {
        this.formaPagoTipoMe = formaPagoTipoMe;
    }

    public int getFormaPagoTipoDeCuentaMe() {
        return formaPagoTipoDeCuentaMe;
    }

    public void setFormaPagoTipoDeCuentaMe(int formaPagoTipoDeCuentaMe) {
        this.formaPagoTipoDeCuentaMe = formaPagoTipoDeCuentaMe;
    }

    public int getFormaPagoDebitoMe() {
        return formaPagoDebitoMe;
    }

    public void setFormaPagoDebitoMe(int formaPagoDebitoMe) {
        this.formaPagoDebitoMe = formaPagoDebitoMe;
    }

    public int getFormaPagoCuentaMe() {
        return formaPagoCuentaMe;
    }

    public void setFormaPagoCuentaMe(int formaPagoCuentaMe) {
        this.formaPagoCuentaMe = formaPagoCuentaMe;
    }

    public int getGrupoDeCierreCambio() {
        return grupoDeCierreCambio;
    }

    public void setGrupoDeCierreCambio(int grupoDeCierreCambio) {
        this.grupoDeCierreCambio = grupoDeCierreCambio;
    }

    public int getMarcaBole() {
        return marcaBole;
    }

    public void setMarcaBole(int marcaBole) {
        this.marcaBole = marcaBole;
    }

    public String getTarjeNumeAnt() {
        return tarjeNumeAnt;
    }

    public void setTarjeNumeAnt(String tarjeNumeAnt) {
        this.tarjeNumeAnt = tarjeNumeAnt;
    }

    public String getLimiCodi() {
        return limiCodi;
    }

    public void setLimiCodi(String limiCodi) {
        this.limiCodi = limiCodi;
    }

    public String getNroClienteEntidad() {
        return nroClienteEntidad;
    }

    public void setNroClienteEntidad(String nroClienteEntidad) {
        this.nroClienteEntidad = nroClienteEntidad;
    }

    public int getPorcentajeLimiteAdicional() {
        return porcentajeLimiteAdicional;
    }

    public void setPorcentajeLimiteAdicional(int porcentajeLimiteAdicional) {
        this.porcentajeLimiteAdicional = porcentajeLimiteAdicional;
    }

    public int getImporteLimoteAdicional() {
        return importeLimoteAdicional;
    }

    public void setImporteLimoteAdicional(int importeLimoteAdicional) {
        this.importeLimoteAdicional = importeLimoteAdicional;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Cliente [amplTranLimi=" + amplTranLimi + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", autoReno=" + autoReno + ", barrio=" + barrio + ", barrioCorres=" + barrioCorres + ", calle="
                + calle + ", calleCorres=" + calleCorres + ", cantCuotasRemplazo=" + cantCuotasRemplazo
                + ", cantCuotasRenovacion=" + cantCuotasRenovacion + ", cargoPorAlta=" + cargoPorAlta
                + ", cargoPorRemplazo=" + cargoPorRemplazo + ", cargoPorRenovacion=" + cargoPorRenovacion + ", cartera="
                + cartera + ", catCuotasAltas=" + catCuotasAltas + ", civilEstaCodi=" + civilEstaCodi
                + ", codigoDePrecio=" + codigoDePrecio + ", codigoDeProducto=" + codigoDeProducto + ", cp=" + cp
                + ", cpCorres=" + cpCorres + ", depto=" + depto + ", deptoCorres=" + deptoCorres
                + ", descripcionAfinidad=" + descripcionAfinidad + ", digitoVerif=" + digitoVerif + ", email=" + email
                + ", entidad=" + entidad + ", estadoCuenta=" + estadoCuenta + ", estadoDeLaTarjeta=" + estadoDeLaTarjeta
                + ", fechaAlta=" + fechaAlta + ", fechaDeNacimiento=" + fechaDeNacimiento + ", fechaEstado="
                + fechaEstado + ", fechaEstadoCuenta=" + fechaEstadoCuenta + ", filler=" + filler
                + ", formaPagoCuentaMe=" + formaPagoCuentaMe + ", formaPagoCuentaMl=" + formaPagoCuentaMl
                + ", formaPagoDebitoMe=" + formaPagoDebitoMe + ", formaPagoDebitoMl=" + formaPagoDebitoMl
                + ", formaPagoTipoDeCuentaMe=" + formaPagoTipoDeCuentaMe + ", formaPagoTipoDeCuentaMl="
                + formaPagoTipoDeCuentaMl + ", formaPagoTipoMe=" + formaPagoTipoMe + ", formaPagoTipoMl="
                + formaPagoTipoMl + ", grupoCtaCte=" + grupoCtaCte + ", grupoDeAfinidad=" + grupoDeAfinidad
                + ", grupoDeCierreCambio=" + grupoDeCierreCambio + ", importeLimoteAdicional=" + importeLimoteAdicional
                + ", limiCodi=" + limiCodi + ", limiteDeCompra=" + limiteDeCompra + ", limiteDeCredito="
                + limiteDeCredito + ", local=" + local + ", localCorres=" + localCorres + ", marca=" + marca
                + ", marcaBole=" + marcaBole + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", nroClienteEntidad="
                + nroClienteEntidad + ", numDeCuenta=" + numDeCuenta + ", numTel1=" + numTel1 + ", numTeleCorres="
                + numTeleCorres + ", numeroDeDocumento1=" + numeroDeDocumento1 + ", numeroDeDocumento2="
                + numeroDeDocumento2 + ", numtel2=" + numtel2 + ", ocupacion=" + ocupacion + ", pais=" + pais
                + ", partido=" + partido + ", partidoCorres=" + partidoCorres + ", persona=" + persona + ", piso="
                + piso + ", pisoCorres=" + pisoCorres + ", porcLimiteParaPrestamos=" + porcLimiteParaPrestamos
                + ", porcLimiteParaTarjeta=" + porcLimiteParaTarjeta + ", porcLimitePorPeriodo=" + porcLimitePorPeriodo
                + ", porcSobregiro=" + porcSobregiro + ", porcentajeLimiteAdicional=" + porcentajeLimiteAdicional
                + ", porcentualLimiteAdelantos=" + porcentualLimiteAdelantos + ", porcentualLimiteAdelantosCuotas="
                + porcentualLimiteAdelantosCuotas + ", porcentualLimiteDeCompra=" + porcentualLimiteDeCompra
                + ", porcentualLimiteDeCompraCuotas=" + porcentualLimiteDeCompraCuotas + ", provincia=" + provincia
                + ", provinciaCorres=" + provinciaCorres + ", puerta=" + puerta + ", puertaCorres=" + puertaCorres
                + ", sexo=" + sexo + ", sucursal=" + sucursal + ", tarjeNume=" + tarjeNume + ", tarjeNumeAnt="
                + tarjeNumeAnt + ", teleCodiCorres=" + teleCodiCorres + ", teleTipo1=" + teleTipo1 + ", teleTipo2="
                + teleTipo2 + ", tipoDeDocumento1=" + tipoDeDocumento1 + ", tipoDeDocumento2=" + tipoDeDocumento2
                + ", tipoDePersona=" + tipoDePersona + ", tipoDeProducto=" + tipoDeProducto + ", tipoDeSocio="
                + tipoDeSocio + ", tipoRegistro=" + tipoRegistro + ", venciminetoTarjeta=" + venciminetoTarjeta
                + ", vigenAmplTranLimi=" + vigenAmplTranLimi + "]";
    }

    
    
}