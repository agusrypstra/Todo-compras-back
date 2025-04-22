package com.todoCompras.backend.dto.solicitudes;

public class SolicitudRegistroLocalResponseDTO {
    public SolicitudRegistroLocalResponseDTO(Long id, String nombre, String direccion, String provincia, String localidad, String telefonoLlamadas, String telefonoWhatsapp, String ubicacionGoogleMaps, String descripcion, String diasAtencionDesde, String diasAtencionHasta, String horarioAtencionDesde, String horarioAtencionHasta, boolean es24Horas, String linkInstagram, String linkFacebook, String linkPaginaWeb, String fotoPerfil, String fotoBanner, String estado, String categoriaNombre, String usuarioNombre) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
        this.telefonoLlamadas = telefonoLlamadas;
        this.telefonoWhatsapp = telefonoWhatsapp;
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
        this.descripcion = descripcion;
        this.diasAtencionDesde = diasAtencionDesde;
        this.diasAtencionHasta = diasAtencionHasta;
        this.horarioAtencionDesde = horarioAtencionDesde;
        this.horarioAtencionHasta = horarioAtencionHasta;
        this.es24Horas = es24Horas;
        this.linkInstagram = linkInstagram;
        this.linkFacebook = linkFacebook;
        this.linkPaginaWeb = linkPaginaWeb;
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
        this.estado = estado;
        this.categoriaNombre = categoriaNombre;
        this.usuarioNombre = usuarioNombre;
    }

    private Long id;
    private String nombre;
    private String direccion;
    private String provincia;
    private String localidad;
    private String telefonoLlamadas;
    private String telefonoWhatsapp;
    private String ubicacionGoogleMaps;
    private String descripcion;
    private String diasAtencionDesde;
    private String diasAtencionHasta;
    private String horarioAtencionDesde;
    private String horarioAtencionHasta;
    private boolean es24Horas;
    private String linkInstagram;
    private String linkFacebook;
    private String linkPaginaWeb;
    private String fotoPerfil;
    private String fotoBanner;
    private String estado;
    private String categoriaNombre;
    private String usuarioNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoLlamadas() {
        return telefonoLlamadas;
    }

    public void setTelefonoLlamadas(String telefonoLlamadas) {
        this.telefonoLlamadas = telefonoLlamadas;
    }

    public String getTelefonoWhatsapp() {
        return telefonoWhatsapp;
    }

    public void setTelefonoWhatsapp(String telefonoWhatsapp) {
        this.telefonoWhatsapp = telefonoWhatsapp;
    }

    public String getUbicacionGoogleMaps() {
        return ubicacionGoogleMaps;
    }

    public void setUbicacionGoogleMaps(String ubicacionGoogleMaps) {
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiasAtencionDesde() {
        return diasAtencionDesde;
    }

    public void setDiasAtencionDesde(String diasAtencionDesde) {
        this.diasAtencionDesde = diasAtencionDesde;
    }

    public String getDiasAtencionHasta() {
        return diasAtencionHasta;
    }

    public void setDiasAtencionHasta(String diasAtencionHasta) {
        this.diasAtencionHasta = diasAtencionHasta;
    }

    public String getHorarioAtencionDesde() {
        return horarioAtencionDesde;
    }

    public void setHorarioAtencionDesde(String horarioAtencionDesde) {
        this.horarioAtencionDesde = horarioAtencionDesde;
    }

    public String getHorarioAtencionHasta() {
        return horarioAtencionHasta;
    }

    public void setHorarioAtencionHasta(String horarioAtencionHasta) {
        this.horarioAtencionHasta = horarioAtencionHasta;
    }

    public boolean isEs24Horas() {
        return es24Horas;
    }

    public void setEs24Horas(boolean es24Horas) {
        this.es24Horas = es24Horas;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkPaginaWeb() {
        return linkPaginaWeb;
    }

    public void setLinkPaginaWeb(String linkPaginaWeb) {
        this.linkPaginaWeb = linkPaginaWeb;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getFotoBanner() {
        return fotoBanner;
    }

    public void setFotoBanner(String fotoBanner) {
        this.fotoBanner = fotoBanner;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }
}
