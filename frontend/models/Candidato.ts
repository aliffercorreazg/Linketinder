import { Pessoa } from "./Pessoa";

export class Candidato extends Pessoa {

    constructor(

        public nome: string,
        public email: string,
        public estado: string,
        public descricao: string,
        public competencias: string[],
        public cep: string,

        public cpf: string,
        public idade: number
    ) {

        super(nome, email, estado, descricao, competencias, cep);

        this.cpf = cpf;
        this.idade = idade
        
    }

    toString(): string {
        return super.toString() + `Idade: ${this.idade}\n\tCPF: ${this.cpf}\n`; 
    }
}