export class Pessoa {

    constructor(
        public nome: string,
        public email: string,
        public estado: string,
        public descricao: string,
        public competencias: string[],
        public cep: string
    ) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cep = cep;
    }

    toString(): string {
        return `
        Nome: ${this.nome}
        Email: ${this.email}
        Descrição: ${this.descricao}
        Competências: ${this.competencias.join(", ")}
        Estado: ${this.estado}
        CEP: ${this.cep}
        `;
    }
}