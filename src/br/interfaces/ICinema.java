package br.interfaces;

public interface ICinema {
    // cria uma variavel string para "título, gênero, classificação, idioma, Lugar, sala" todas públicas
    
    final String titulo = "Título";
    final String genero = "Gênero";
    final String classificacao = "Classificação";
    final String idioma = "Idioma";
    final String lugar = "Lugar";
	final String sala = "Sala";
    //abre uma variavel double, já que se usa números.
    final double duração = 120;
    // abre um dado boolean, já que deve-se escolher entre o filme ser ou não 3d.
    final boolean filme3d = false;
    // abre um dado boolean, já que deve-se escolher entre o filme ter ou não legenda.
    final boolean legenda = true;
    // método utilizado no Serviço.
    public void cadastrar(double preço, double horário, int quantidade);
    
} 