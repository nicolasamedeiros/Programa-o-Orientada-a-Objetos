package javaclasses;

public class fatura {
    // Atributos
    public String numero;
    public String descricao;
    public int qntComprada;
    public double precoItem;

    // Construtor
    public fatura(String numero, String descicao, int qntComprada, double precoItem) {
        this.numero = numero;
        this.descricao = descicao;
        setQntComprada(qntComprada);
        setPrecoItem(precoItem);
    }

    //metodos
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQntComprada(int qntComprada) {
        if (qntComprada > 0) {
            this.qntComprada = qntComprada;
        } else {
            this.qntComprada = 0;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem > 0) {
            this.precoItem = precoItem;
        } else {
            this.precoItem = 0.0;
        }
    }

    public double getTotalFatura() {
        return qntComprada * precoItem;
    }

    public String getQntComprada() {
        return null;
    }
}
