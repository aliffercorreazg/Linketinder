

class Pessoa {

    String nome;
    String email;
    String estado;
    String descricao;
    List<String> competencias;
    String cep;

    Pessoa(
            String nome,
            String email,
            String estado,
            String descricao,
            List<String> competencias,
            String cep
    ) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cep = cep;
    }

    String toString() {
        """
        Nome: $nome
        Email: $email
        Descrição: $descricao
        Competencias: $competencias
        Estado: $estado
        CEP: $cep
        """
    }
}
