package com.todoCompras.backend.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

// Entidad Local actualizada
@Entity
public class Local {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    @OneToOne
    @JoinColumn(name = "solicitud_id", nullable = false, unique = true)
    private SolicitudRegistroLocal solicitud;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "La provincia es obligatoria")
    private String provincia;
    @NotBlank(message = "La localidad es obligatoria")
    private String localidad;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotBlank(message = "El teléfono para llamadas es obligatorio")
    private String telefonoLlamadas;

    @NotBlank(message = "El teléfono para WhatsApp es obligatorio")
    private String telefonoWhatsapp;

    private String ubicacionGoogleMaps; // Opcional

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    @NotBlank(message = "El día de atención desde es obligatorio")
    private String diasAtencionDesde;

    @NotBlank(message = "El día de atención hasta es obligatorio")
    private String diasAtencionHasta;

    @NotBlank(message = "El horario de atención desde es obligatorio")
    private String horarioAtencionDesde;

    @NotBlank(message = "El horario de atención hasta es obligatorio")
    private String horarioAtencionHasta;

    private boolean es24Horas;

    private String linkInstagram; // Opcional
    private String linkFacebook; // Opcional
    private String linkPaginaWeb; // Opcional

    @NotBlank(message = "La foto de perfil es obligatoria")
    private String fotoPerfil;

    @NotBlank(message = "La foto del banner es obligatoria")
    private String fotoBanner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SolicitudRegistroLocal getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudRegistroLocal solicitud) {
        this.solicitud = solicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFotoBanner(String fotoBanner) {
        this.fotoBanner = fotoBanner;
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

    public void setHorarioCierre(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHorarioCierre'");
    }
}
