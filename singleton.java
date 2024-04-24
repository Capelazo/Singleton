import java.util.LinkedList;

public class Fila {
    private static Fila instancia;
    private LinkedList<String> documentos;

    private Fila() {
        documentos = new LinkedList<>();
    }

    public static synchronized Fila getInstance() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento() {
        if (!documentos.isEmpty()) {
            String documento = documentos.getFirst();
            System.out.println("Imprimindo documento: " + documento);
        } else {
            System.out.println("Fila vazia. Nenhum documento para imprimir.");
        }
    }

    public void RemoveDocumento() {
        if (!documentos.isEmpty()) {
            String documentoRemovido = documentos.removeFirst();
            System.out.println("Documento removido: " + documentoRemovido);
        } else {
            System.out.println("Fila vazia. Nenhum documento para remover.");
        }
    }

    public void RemoveTodosDocumentos() {
        if (!documentos.isEmpty()) {
            documentos.clear();
            System.out.println("Todos os documentos removidos.");
        } else {
            System.out.println("Fila vazia. Nenhum documento para remover.");
        }
    }
}
