package okBusinessComponent;

import okBusinessComponent.okServices.okAlimento;
import okBusinessComponent.okServices.okIngestaNativa;

public class okHormigaLarva extends okHormiga{

    public okHormigaLarva(Integer idHormiga, String idHormigaTipo, String idSexo, String estado) {
        super(idHormiga, idHormigaTipo, idSexo, estado);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Boolean okComer(okAlimento okAlimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'okComer'");
    }

    @Override
    public okHormiga okComer(okIngestaNativa okIngestaNativa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'okComer'");
    }

}
