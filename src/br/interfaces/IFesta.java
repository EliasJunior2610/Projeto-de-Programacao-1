package br.interfaces;

public interface IFesta {
    //abre uma classe boolean, já que, é possivel escolher apenas dois valores, se vai ou não ir pro camarote.
    public boolean camarote = true;
    // método utilizado no Serviço.
    public void cadastrar(double preço, double horário, int quantidade);
}
