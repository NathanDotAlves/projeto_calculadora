package calculadora;

/**
 * <p><strong>Testes da Calculadora</strong></p>
 *
 * <p>Classe responsável por testar de forma unitária o funcionamento da classe
 * {@link Calculadora}. Cada chamada informa as entradas utilizadas e, no
 * comentário ao lado, o resultado esperado; o resultado obtido é exibido no console.</p>
 *
 * <p>Casos testados:</p>
 * <ul>
 *     <li>Soma</li>
 *     <li>Subtração</li>
 *     <li>Multiplicação</li>
 *     <li>Divisão</li>
 *     <li>Divisão por zero (exceção tratada)</li>
 *     <li>Operação inválida (exceção tratada)</li>
 * </ul>
 *
 * @author Nathan Alves
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Construtor padrão da classe de testes.
     */
    public TesteCalculadora() {
    }

    /**
     * Método principal que executa os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operações básicas
        System.out.println(calc.calcular(2, 3, "+"));  // esperado: 5
        System.out.println(calc.calcular(10, 4, "-")); // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));  // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));  // esperado: 4

        // Divisão por zero: a exceção é capturada para não interromper o programa
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Operador inválido: a exceção é capturada para não interromper o programa
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
