public class Comissionado extends Empregado {
  private double totalVenda, taxaComissao;

  public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao){
    super(nome, sobrenome, cpf);
    this.totalVenda = totalVenda;
    this.taxaComissao = taxaComissao;
  }

  @Override
  public double vencimento(){
    return totalVenda * taxaComissao;
  }

  public double getTotalVenda() { return totalVenda; }
  public double getTaxaComissao() { return taxaComissao; }

  public void setTotalVenda(double totalVenda) { this.totalVenda = totalVenda; }
  public void setTaxaComissao(double taxaComissao) { this.taxaComissao = taxaComissao; }

}

