class TesteMain {

    static void main(String[] args) {
        testAdicionarEmpresa()
        testAdicionarCandidato()
        println "Todos os testes passaram com sucesso!"
    }

    static void testAdicionarEmpresa() {
        // Configuração inicial
        def empresas = []

        // Dados para nova empresa
        def nome = "Nova Empresa"
        def email = "nova@empresa.com"
        def pais = "Brasil"
        def estado = "SP"
        def descricao = "Empresa teste"
        def competencias = ["Java", "Groovy"]
        def cep = "12345678"
        def cnpj = "98765432000123"

        // Criação e adição da empresa
        def novaEmpresa = new Empresa(nome, email, estado, descricao, competencias, cep, cnpj, pais)
        empresas << novaEmpresa

        // Testes
        assert empresas.size() == 1 : "Erro: a lista de empresas deveria ter 1 elemento."
        assert empresas[0].nome == nome : "Erro: o nome da empresa não corresponde."
        assert empresas[0].email == email : "Erro: o email da empresa não corresponde."
        assert empresas[0].pais == pais : "Erro: o país da empresa não corresponde."
        assert empresas[0].estado == estado : "Erro: o estado da empresa não corresponde."
        assert empresas[0].descricao == descricao : "Erro: a descricao da empresa não corresponde."
        assert empresas[0].competencias == competencias : "Erro: as competências da empresa não correspondem."
        assert empresas[0].cep == cep : "Erro: o cep competências da empresa não corresponde."
        assert empresas[0].cnpj == cnpj : "Erro: o cnpj competências da empresa não corresponde."

        println "Teste de adicionar empresa passou!"
    }

    static void testAdicionarCandidato() {
        // Configuração inicial
        def candidatos = []

        // Dados para novo candidato
        def nome = "João Teste"
        def email = "joao@teste.com"
        def estado = "MG"
        def descricao = "Candidato teste"
        def competencias = ["Python", "Django"]
        def cep = "87654321"
        def cpf = "12345678901"
        def idade = 25

        // Criação e adição do candidato
        def novoCandidato = new Candidato(nome, email, estado, descricao, competencias, cep, cpf, idade)
        candidatos << novoCandidato

        // Testes
        assert candidatos.size() == 1 : "Erro: a lista de candidatos deveria ter 1 elemento."
        assert candidatos[0].nome == nome : "Erro: o nome do candidato não corresponde."
        assert candidatos[0].email == email : "Erro: o email do candidato não corresponde."
        assert candidatos[0].idade == idade : "Erro: a idade do candidato não corresponde."
        assert candidatos[0].estado == estado : "Erro: o estado do candidato não corresponde."
        assert candidatos[0].descricao == descricao : "Erro: a descricao do candidato não corresponde."
        assert candidatos[0].competencias == competencias : "Erro: as competencias do candidato não correspondem."
        assert candidatos[0].cep == cep : "Erro: o cep do candidato não corresponde."
        assert candidatos[0].cpf == cpf : "Erro: o cpf do candidato não corresponde."
        println "Teste de adicionar candidato passou!"
    }
}
