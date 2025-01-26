class Candidato extends Pessoa {

    String cpf;
    int idade;

    public Candidato (
            String nome,
            String email,
            String estado,
            String descricao,
            List<String> competencias,
            String cep,

            String cpf,
            int idade
        ) {

        super(nome, email, estado, descricao, competencias, cep);
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    String toString() {
        super.toString() + """Idade: $idade\n\tCPF: $cpf\n""";
    }
}
