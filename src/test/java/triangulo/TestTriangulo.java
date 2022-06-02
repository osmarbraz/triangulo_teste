package triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTriangulo {

    @Test
    @DisplayName("(3 * 2)/2.0 = 3.0")
    void testGetArea1() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 3.0;
        Triangulo triangulo = new Triangulo("", base, altura);
        double retornoFeito = triangulo.getArea();        
        assertEquals(retornoEsperado, retornoFeito, "(3 * 2)/2 deve ser 3.0");
    }

    @Test
    @DisplayName("Construtor")
    void testTriangulo() {
        Triangulo triangulo = new Triangulo();
        assertTrue(("".equals(triangulo.getCor()) && triangulo.getAltura() == 0 && triangulo.getBase() == 0));
    }
}
