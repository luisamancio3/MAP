package Factory;

class FactoryPessoa {

    public Pessoa getPessoa(String sexo, String nome) {
        Pessoa instancia = null;
        if (sexo.equals("F")) {
            instancia = new Mulher(nome);
        }
        if (sexo.equals("H")) {
            instancia = new Homem(nome);
        }
        return instancia;
    }
}