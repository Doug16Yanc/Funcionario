public class EmpregadoHorista extends Empregado
{
    private double quantidadeHoras;
    private double salarioHora;

    public EmpregadoHorista(String nome, int id, double quantidadeHoras, double salarioHora)
    {
        super(nome, id);
        this.quantidadeHoras = quantidadeHoras;
        this.salarioHora = salarioHora;
    }

    public double getQuantidadeHoras()
    {
        return quantidadeHoras;
    }

    public double getSalarioHora()
    {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora)
    {
        this.salarioHora = salarioHora;
    }

    public void setQuantidadeHoras(double quantidadeHoras)
    {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calculaSalario()
    {
        return getSalarioHora()*getQuantidadeHoras();
    }

    @Override
    public String toString()
    {
        return  "Nome : " + getNome() +
                "\nId : " + getId() +
                "\nQuantidade de horas : " + quantidadeHoras +
                "\nvalor da hora: " + salarioHora +
                "\nSalário do indivíduo : " + calculaSalario();
    }
}
