import { Pessoa } from "./Pessoa";

export class Empresa extends Pessoa {

    constructor(

        public nome: string,
        public email: string,
        public estado: string,
        public descricao: string,
        public competencias: string[],
        public cep: string,

        public cnpj: string,
        public pais: number
    ) {

        super(nome, email, estado, descricao, competencias, cep);

        this.cnpj = cnpj;
        this.pais = pais
        
    }

    toString(): string {
        return super.toString() + `País: ${this.pais}\n\tCNPJ: ${this.cnpj}\n`; 
    }
}