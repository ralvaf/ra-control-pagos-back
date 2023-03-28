package com.alva.pagos.application_services.departamento;

import org.springframework.stereotype.Component;

import com.alva.pagos.infraestructure_cross_cuting.ra_responses.RaRestServiceResponse;

@Component
public class DepartamentoServiceImpl implements DepartamentoService {
    public RaRestServiceResponse<String> saludo() {
        RaRestServiceResponse respuesta = new RaRestServiceResponse<>();

        try {
            respuesta.content = "hola roosbelt";
        } catch (Exception ex) {
            respuesta.estado = false;
            respuesta.mensajeError = ex.getMessage();
        }
        return respuesta;
    }
}
