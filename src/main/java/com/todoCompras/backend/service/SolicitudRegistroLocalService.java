package com.todoCompras.backend.service;

import com.todoCompras.backend.model.EstadoSolicitud;
import com.todoCompras.backend.model.MotivoRechazo;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.repository.LocalRepository;
import com.todoCompras.backend.repository.MotivoRechazoRepository;
import com.todoCompras.backend.repository.SolicitudRegistroLocalRepository;
import com.todoCompras.backend.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudRegistroLocalService {
    private final SolicitudRegistroLocalRepository solicitudRepo;
    private final LocalRepository localRepo;
    private final UsuarioRepository usuarioRepository;
    private final MotivoRechazoRepository motivoRepo;

    public SolicitudRegistroLocalService(SolicitudRegistroLocalRepository solicitudRepo,
                                         LocalRepository localRepo,
                                         UsuarioRepository usuarioRepository,
                                         MotivoRechazoRepository motivoRepo) {
        this.solicitudRepo = solicitudRepo;
        this.localRepo = localRepo;
        this.usuarioRepository = usuarioRepository;
        this.motivoRepo = motivoRepo;
    }

    public SolicitudRegistroLocal crearSolicitud(SolicitudRegistroLocal solicitud) {
        solicitud.setEstado(EstadoSolicitud.PENDIENTE);
        return solicitudRepo.save(solicitud);
    }

    public List<SolicitudRegistroLocal> obtenerSolicitudesPendientes() {
        return solicitudRepo.findByEstado(EstadoSolicitud.PENDIENTE);
    }

    public SolicitudRegistroLocal aprobarSolicitud(Long id) {
        SolicitudRegistroLocal solicitud = solicitudRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Solicitud no encontrada"));
        solicitud.setEstado(EstadoSolicitud.APROBADA);
        return solicitudRepo.save(solicitud);
    }

    public SolicitudRegistroLocal rechazarSolicitud(Long id, List<String> motivos) {
        SolicitudRegistroLocal solicitud = solicitudRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Solicitud no encontrada"));
        solicitud.setEstado(EstadoSolicitud.DENEGADA);
        for (String motivo : motivos) {
            MotivoRechazo motivoRechazo = new MotivoRechazo();
            motivoRechazo.setDescripcion(motivo);
            motivoRechazo.setSolicitud(solicitud);
            motivoRepo.save(motivoRechazo);
        }
        return solicitudRepo.save(solicitud);
    }
}
