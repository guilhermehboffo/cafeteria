package cafeteria.bebida;

public class Bebida {

    private String name;
    private double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bebida{" + "nome=" + name + ", valor=" + value + '}';
    }

}
