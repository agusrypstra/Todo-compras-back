package com.todoCompras.backend.dto.local;

public class LocalResponseDTO {
    private Long id;
    private UsuarioMinimalDTO usuario;
    private CategoriaMinimalDTO categoria;
    private SolicitudMinimalDTO solicitud;
    private String nombre;
    private String provincia;
    private String localidad;
    private String direccion;
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

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public UsuarioMinimalDTO getUsuario() { return usuario; }
    public void setUsuario(UsuarioMinimalDTO usuario) { this.usuario = usuario; }


    // Clases DTO anidadas
    public static class UsuarioMinimalDTO {
        private Long id;
        private String nombre;
        private String email;

        public UsuarioMinimalDTO() {}

        public UsuarioMinimalDTO(Long id, String nombre, String email) {
            this.id = id;
            this.nombre = nombre;
            this.email = email;
        }

        // Getters y Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    public static class CategoriaMinimalDTO {
        private Long id;
        private String nombre;

        public CategoriaMinimalDTO() {}

        public CategoriaMinimalDTO(Long id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        // Getters y Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    }

    public static class SolicitudMinimalDTO {
        private Long id;
        private String estado;

        public SolicitudMinimalDTO() {}

        public SolicitudMinimalDTO(Long id, String estado) {
            this.id = id;
            this.estado = estado;
        }

        // Getters y Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
    }

    public CategoriaMinimalDTO getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaMinimalDTO categoria) {
        this.categoria = categoria;
    }

    public SolicitudMinimalDTO getSolicitud() {
        return this.solicitud;
    }

    public void setSolicitud(SolicitudMinimalDTO solicitud) {
        this.solicitud = solicitud;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoLlamadas() {
        return this.telefonoLlamadas;
    }

    public void setTelefonoLlamadas(String telefonoLlamadas) {
        this.telefonoLlamadas = telefonoLlamadas;
    }

    public String getTelefonoWhatsapp() {
        return this.telefonoWhatsapp;
    }

    public void setTelefonoWhatsapp(String telefonoWhatsapp) {
        this.telefonoWhatsapp = telefonoWhatsapp;
    }

    public String getUbicacionGoogleMaps() {
        return this.ubicacionGoogleMaps;
    }

    public void setUbicacionGoogleMaps(String ubicacionGoogleMaps) {
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiasAtencionDesde() {
        return this.diasAtencionDesde;
    }

    public void setDiasAtencionDesde(String diasAtencionDesde) {
        this.diasAtencionDesde = diasAtencionDesde;
    }

    public String getDiasAtencionHasta() {
        return this.diasAtencionHasta;
    }

    public void setDiasAtencionHasta(String diasAtencionHasta) {
        this.diasAtencionHasta = diasAtencionHasta;
    }

    public String getHorarioAtencionDesde() {
        return this.horarioAtencionDesde;
    }

    public void setHorarioAtencionDesde(String horarioAtencionDesde) {
        this.horarioAtencionDesde = horarioAtencionDesde;
    }

    public String getHorarioAtencionHasta() {
        return this.horarioAtencionHasta;
    }

    public void setHorarioAtencionHasta(String horarioAtencionHasta) {
        this.horarioAtencionHasta = horarioAtencionHasta;
    }

    public boolean isEs24Horas() {
        return this.es24Horas;
    }

    public boolean getEs24Horas() {
        return this.es24Horas;
    }

    public void setEs24Horas(boolean es24Horas) {
        this.es24Horas = es24Horas;
    }

    public String getLinkInstagram() {
        return this.linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public String getLinkFacebook() {
        return this.linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkPaginaWeb() {
        return this.linkPaginaWeb;
    }

    public void setLinkPaginaWeb(String linkPaginaWeb) {
        this.linkPaginaWeb = linkPaginaWeb;
    }

    public String getFotoPerfil() {
        return this.fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getFotoBanner() {
        return this.fotoBanner;
    }

    public void setFotoBanner(String fotoBanner) {
        this.fotoBanner = fotoBanner;
    }

}