package principal;


import triangulo.Triangulo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Triangulo triangulo = new Triangulo();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura Triângulo "
                    + "\n2 - Área Triângulo "
                    + "\n9 - Sair");

            switch (opcao) {
                case "1": {
                    triangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Triângulo"));
                    triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triângulo")));
                    triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triângulo")));
                    break;
                }
                case "2": {
                    JOptionPane.showMessageDialog(null, "Área Triangulo: " + triangulo.getArea());
                    break;
                }
                case "9": {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
