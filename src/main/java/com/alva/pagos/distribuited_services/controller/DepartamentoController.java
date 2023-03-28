package com.alva.pagos.distribuited_services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alva.pagos.application_services.departamento.DepartamentoService;
import com.alva.pagos.infraestructure_cross_cuting.ra_responses.RaRestServiceResponse;

@RestController
@RequestMapping("/apr/api/actividad")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping("/saludo")
    public RaRestServiceResponse<String> saludo() {
        return departamentoService.saludo();
    }
}
