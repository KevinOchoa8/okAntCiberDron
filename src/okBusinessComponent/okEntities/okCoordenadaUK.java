package okBusinessComponent.okEntities;

public class okCoordenadaUK {

    private String  okGeoposicion;
    private String  okTipoArsenal;
    private Boolean okAccion;

    public okCoordenadaUK(String okGeoposicion, String okTipoArsenal, Boolean okAccion) {
        this.okGeoposicion = okGeoposicion;
        this.okTipoArsenal = okTipoArsenal;
        this.okAccion      = okAccion;
    }
    
    public String getOkGeoposicion() {
        return okGeoposicion;
    }

    public void setOkGeoposicion(String okGeoposicion) {
        this.okGeoposicion = okGeoposicion;
    }

    public String getOkTipoArsenal() {
        return okTipoArsenal;
    }

    public void setOkTipoArsenal(String okTipoArsenal) {
        this.okTipoArsenal = okTipoArsenal;
    }

    public Boolean getOkAccion() {
        return okAccion;
    }

    public void setOkAccion(Boolean okAccion) {
        this.okAccion = okAccion;
    }

    @Override
    public String toString(){
        return getClass().getName()
        + "\n Geoposicion         :"+ getOkGeoposicion()
        + "\n Tipo Arsenal        :"+ getOkTipoArsenal()
        + "\n Accion              :"+ getOkAccion();
    }
    
}
