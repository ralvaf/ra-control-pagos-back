package com.alva.pagos.infraestructure_cross_cuting.ra_responses;

public class RaRestServiceResponse<T> {
    public String mensajeError;
    public Boolean estado;
    public T content;

    public RaRestServiceResponse() {
        estado = true;
    }

    public RaRestServiceResponse(String mensajeError, Boolean estado, T content) {
        this.mensajeError = mensajeError;
        this.estado = estado;
        this.content = content;
    }

    public String getMensajeDeError(Exception ex) {
        return "\nMensaje:" + ex.getMessage();
    }

    public void setException(Exception ex) {
        this.estado = false;
        this.mensajeError = getMensajeDeError(ex);
    }

    public void setMensajeError(String mensaje) {
        this.estado = false;
        this.mensajeError = mensaje;
    }

}
