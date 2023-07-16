public class Cadastro
{
    private static int contadorCadastros = 1000;
    private int numeroCadastro;
    private Empregado empregado;


    public Cadastro(Empregado empregado)
    {
        this.numeroCadastro = Cadastro.contadorCadastros;
        this.empregado = empregado;
        contadorCadastros += 1;
    }

    public int getNumeroCadastro()
    {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro)
    {
        this.numeroCadastro = numeroCadastro;
    }

    public Empregado getEmpregado()
    {
        return empregado;
    }

    public void setEmpregado(Empregado empregado)
    {
        this.empregado = empregado;
    }

    @Override
    public String toString()
    {
        return "Número de cadastro : " + numeroCadastro +
                "\nNome : " + this.empregado.getNome() +
                "\nId : " + this.empregado.getId() +
                "\nSalário (R$) : " + this.empregado.calculaSalario() + "\n";
    }
}
