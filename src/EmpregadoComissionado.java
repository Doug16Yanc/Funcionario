public class EmpregadoComissionado extends Empregado
{
    private double valorComissao;
    private double valorVendas;

    public EmpregadoComissionado(String nome, int id, double valorComissao, double valorVendas)
    {
        super(nome, id);
        this.valorComissao = valorComissao;
        this.valorVendas = valorVendas;
    }

    public double getValorComissao()
    {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao)
    {
        this.valorComissao = valorComissao;
    }

    public double getValorVendas()
    {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public double calculaSalario()
    {
        if (getValorVendas() <= 300.00)
        {
            return getValorVendas()*getValorComissao() + 200.00;
        }
        else
        {
            return getValorVendas()*getValorComissao() + 300.00;
        }
    }

    @Override
    public String toString()
    {
        return "Nome : " + getNome() +
                "\nId : " + getId() +
                "\nvalor do pagamento: " + calculaSalario();
    }
}
