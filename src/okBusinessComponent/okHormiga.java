package okBusinessComponent;

import okBusinessComponent.okInterfaces.IokHormiga;

public abstract class okHormiga implements IokHormiga{

    private Integer idHormiga;
    private String  idHormigaTipo;
    private String  idSexo;
    private String  Estado;

    public okHormiga(Integer idHormiga, String idHormigaTipo, String idSexo, String estado) {
        this.idHormiga = idHormiga;
        this.idHormigaTipo = idHormigaTipo;
        this.idSexo = idSexo;
        Estado = estado;
    }

    
}
