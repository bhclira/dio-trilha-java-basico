public class Metodos {

    // definição de metodo somar
    public int somar (int n1, int n2) {
        // LOGICA - FINALIDADE DO MÉTODO
        return n1 + n2;
    }
    
    // definição de método findById
    public int findById (int id) {
        // LOGICA - FINALIDADE DO MÉTODO
        return id;
        // código para buscar um registro no banco de dados
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO
        // nao retorna nada
        System.out.println("Imprimindo..." + texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        // LOGICA - FINALIDADE DO MÉTODO
        // retorna um valor
        if (divisor == 0) { // throws Exception - exceção
            throw new Exception("Divisão por zero");
        }
        return dividendo / divisor;
    }
    

    public static void main(String[] args) throws Exception {
/*      
    // criterios para criação de métodos, parâmetros e visibilidade
        // 1. Métodos devem ser criados dentro de uma classe
        // 2. Métodos devem ser criados fora de outros métodos
        // 3. Métodos retornam valores
        // 4. Métodos podem receber parâmetros
        // 5. Métodos podem ter visibilidade public, private, protected ou default
        
        // conceitos de classes: são moldes para objetos. é definida por atributos e métodos.
            // atributos são variáveis de diferentes tipos e valores
            // métodos são funções que definem o comportamento da classe. são funções, ações ou subrotinas (buzinar, frear etc.)

        // métodos são blocos de código que são executados quando chamados

        // sintaxe de um método:
            // <modificador de acesso> <tipo de retorno> <nome do método> (<parâmetros>) {
            //     <corpo do método>
            // }

            // deve ser nomeado como verbo
            // deve ser camelCase
            // deve ser claro e objetivo ex. calcularImposto, calcularSalario, calcularMedia
            // deve ser reutilizável
            // deve ser pequeno e fazer uma única coisa
            // deve ser testável
            // deve ser documentado

        // exemplo de método
 */
    
    // instanciando a classe
    Metodos metodos = new Metodos();

    // chamando o método
    int resultado = metodos.somar(10, 20);
    System.out.println("Resultado da Soma: " + resultado);
    

    int dataBase = metodos.findById(1);
    System.out.println("Resultado da busca: " + dataBase);
    }

}
