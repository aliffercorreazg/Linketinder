class Empresa extends Pessoa {

    String cnpj;
    String pais;

    public Empresa (
            String nome,
            String email,
            String estado,
            String descricao,
            List<String> competencias,
            String cep,

            String cnpj,
            String pais
        ) {

        super(nome, email, estado, descricao, competencias, cep);
        this.cnpj = cnpj;
        this.pais = pais;
    }

    @Override
    String toString() {
        super.toString() + """Pais: $pais\n\tCNPJ: $cnpj\n""";
    }
}
