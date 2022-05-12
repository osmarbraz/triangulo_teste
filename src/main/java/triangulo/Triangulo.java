package triangulo;

public class Triangulo {

    private String cor;
    private double altura;
    private double base;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        setCor(cor);
        setBase(base);
        setAltura(altura);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
