public class EmpregadoFixo extends Empregado
{
    private String ingresso;
    private double salarioFixo;


    public EmpregadoFixo(String nome, int id, double salarioFixo)
    {
        super(nome, id);
        this.ingresso = ingresso;
        this.salarioFixo = salarioFixo;
    }

    public String getIngresso()
    {
        return ingresso;
    }

    public void setIngresso(String ingresso)
    {
        this.ingresso = ingresso;
    }
    public double getSalarioFixo()
    {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo)
    {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaSalario()
    {
        return salarioFixo;
    }

    @Override
    public String toString()
    {
        return  "Nome : " + getNome() +
                "\nId : " + getId() +
                "\nForma de ingresso:'" + ingresso + '\'' +
                "\npagamento salarial (R$) : " + salarioFixo;
    }
}
