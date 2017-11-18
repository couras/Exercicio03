import java.util.Date;
import java.util.List;


class webService {
    private String numero;

    webService() {
        numero = "288247";
    }

    public String imprimir() {
        return numero;
    }

}

interface IWsImprimir  {
	public int imprimir();
}

class webSite {

    public void exibir() {
        webService ws = new webService();
        System.out.println(ws.imprimir());
    }
}

class adapter implements IWsImprimir {

	@Override
	public int imprimir() {
		webService ws = new webService();
		return Integer.parseInt(ws.imprimir());
	}
    //preencher o conteúdo da classe Adapter para fazer com que o método ws.imprimir retorne
    //um valor numérico e não mais string (não vale cast)
}

class app extends adapter {
    public void exibir() {
        
        //Essa linha dá um erro porque ws.imprimir() retorna uma string.
        //Use um adapter (não vale cast) para corrigir o problema.
        //Dica: A classe app deve instanciar o adapter, não o objeto webservice diretamente.
        int total = 282847 + imprimir();

        System.out.println(total);
    }
}



public class adapterExercise {
    public static void main(String args[]) {
        app a = new app();
        webSite w = new webSite();

        w.exibir();
        a.exibir();
    }
}
