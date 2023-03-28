package com.alva.pagos.application_services.departamento;

import com.alva.pagos.infraestructure_cross_cuting.ra_responses.RaRestServiceResponse;

public interface DepartamentoService {
    RaRestServiceResponse<String> saludo();
}
