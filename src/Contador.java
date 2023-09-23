public class Contador {
    public static void main(String[] args) {


    }
    static void contar(int parametroUm, int parametroDois ) throws Exception {
        if (parametroUm>parametroDois) {
            throw new Exception("O parâmetro um é maior que o parâmetro dois");
        }

        int contagem = parametroDois - parametroUm;
        for (int indice=0;indice<contagem;indice++)
        {
            System.out.println("Imprimindo Índice: " + (indice+1));
        }
    }

}
