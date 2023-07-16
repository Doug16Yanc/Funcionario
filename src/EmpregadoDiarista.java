public class EmpregadoDiarista extends Empregado
{
    private int quantidadeDias;
    private double salarioPorDia;

    public EmpregadoDiarista(String nome, int id, int quantidadeDias, double salarioPorDia)
    {
        super(nome, id);
        this.quantidadeDias = quantidadeDias;
        this.salarioPorDia = salarioPorDia;
    }

    public int getQuantidadeDias()
    {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias)
    {
        this.quantidadeDias = quantidadeDias;
    }
    public double getSalarioPorDia()
    {
        return salarioPorDia;
    }

    public void setSalarioPorDia(double salarioPorDia)
    {
        this.salarioPorDia = salarioPorDia;
    }

    @Override
    public double calculaSalario()
    {
        return getQuantidadeDias()*getSalarioPorDia();
    }
    @Override
    public String toString()
    {
        return  "Nome : " + getId() +
                "\nId : " + getId() +
                "\nQuantidade de dias : " + quantidadeDias +
                "\nvalor da diária (R$) : " + salarioPorDia;
    }
}
