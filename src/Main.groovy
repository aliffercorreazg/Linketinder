static void main(String[] args) {

  ArrayList<Empresa> empresas = new ArrayList<>([
          new Empresa("Google",             "google@gmail.com",                "SP", "Uma das maiores fintech do mundo!",                            ["Java", "Spring Framework", "Hibernate", "MySQL", "Docker"], "12345678", "51231231816000", "Brasil"),
          new Empresa("Arroz-Gostoso",      "contato@arrozgostoso.com.br",     "MG", "Empresa especializada na produção de arroz de alta qualidade", ["Python", "Django", "Flask", "PostgreSQL", "AWS"],           "12345678", "12345678000190", "Brasil"),
          new Empresa("TechForward",        "contato@techforward.com",         "SP", "Startup focada em soluções de tecnologia para empresas",       ["JavaScript", "Node.js", "React", "MongoDB", "TypeScript"],  "12345678", "98765432000123", "Brasil"),
          new Empresa("Império do Boliche", "contato@imperiodoboliche.com.br", "RJ", "Rede de boliches e entretenimento",                            ["C#", ".NET", "SQL Server", "Azure", "Entity Framework"],    "12345678", "11223344000188", "Brasil"),
          new Empresa("InovaTech",          "inova@inovatech.com",             "RS", "Consultoria em inovação e transformação digital",              ["PHP", "Laravel", "MySQL", "JavaScript", "Git"],             "12345678", "66778899000111", "Brasil")
  ]);

  ArrayList<Candidato> candidatos = new ArrayList<>([
          new Candidato("Carlos Silva",  "carlos.silva@gmail.com",  "SP", "Especialista em frontend e design de interfaces",                 ["Java", "Spring Framework", "MySQL"], "12345678", "12345678901", 19),
          new Candidato("Ana Pereira",   "ana.pereira@hotmail.com", "RJ", "Especialista em backend e desenvolvimento de APIs",               ["Java", "Spring Boot", "PostgreSQL"], "16242349", "87654321098", 20),
          new Candidato("João Oliveira", "joao.oliveira@gmail.com", "MG", "Desenvolvedor full stack com experiência em JavaScript e Python", ["JavaScript", "Node.js", "Python"],   "14314549", "23456789012", 27),
          new Candidato("Maria Souza",   "maria.souza@outlook.com", "RS", "Analista de dados e BI, com experiência em SQL e Power BI",       ["SQL", "Power BI", "Excel"],          "75242349", "34567890123", 31),
          new Candidato("Felipe Costa",  "felipe.costa@gmail.com",  "BA", "Engenheiro de software com foco em desenvolvimento ágil",         ["Java", "Kotlin", "AWS"],             "16864349", "45678901234", 26)
  ]);

  Scanner s = new Scanner(System.in)

  while (true) {

    int option = menu()

    if (option == 0) {
      println "\nEncerrando programa ... ";
      System.exit(0);

    } else if (option == 1) {
      listarEmpresas(empresas);
    } else if (option == 2) {
      listarCandidatos(candidatos);
    }

    println "Pressione Enter para continuar...";
    s.nextLine();

    clearConsole()
  }
}

static void listarCandidatos(ArrayList<Candidato> candidatos) {
  for (Candidato c : candidatos) {
    println c.toString();
  }
}

static void listarEmpresas(ArrayList<Empresa> empresas) {
  for (Empresa e : empresas) {
    println e.toString();
  }
}

static int menu() {

  Scanner s = new Scanner(System.in)

  println "1 - Listar empresas";
  println "2 - Listar candidatos";
  println "\n0 - Sair\n";

  int option = s.nextInt();

  return option;
}

static void clearConsole() {
  System.out.print("\033[H\033[2J");
  System.out.flush();
}


