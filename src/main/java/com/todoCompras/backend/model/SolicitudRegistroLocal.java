package com.todoCompras.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SolicitudRegistroLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EstadoSolicitud estado; // "PENDIENTE", "APROBADA", "DENEGADA"

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "administrador_id")
    private Usuario administrador; // Usuario que la aprueba o la rechaza (puede ser null si aún no fue revisada)

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "local_id")
    private Local local;

    @OneToMany(mappedBy = "solicitud", cascade = CascadeType.ALL)
    private List<MotivoRechazo> motivosRechazo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<MotivoRechazo> getMotivosRechazo() {
        return motivosRechazo;
    }

    public void setMotivosRechazo(List<MotivoRechazo> motivosRechazo) {
        this.motivosRechazo = motivosRechazo;
    }
}

