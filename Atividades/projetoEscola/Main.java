import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Endereco e1 = new Endereco();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        ArrayList<Telefone> telefonesPessoa = new ArrayList<>();
        ArrayList<Telefone> telefonesAluno = new ArrayList<>();
        ArrayList<Telefone> telefonesProfessor = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        
        c1.setNome("Enfermagem");
        c2.setNome("ADS");
        
        //criando endereço
        e1.setCidade("Brasilia");
        e1.setEstado("Distrito Federal");
        e1.setRua("Samambaia Norte");
        
        //criando pessoa
        p1.setNome("Joao Victor");
        p1.setCpf("000.000.000-00");
        p1.setEmail("emailteste@gmail.com");
        p1.setEndereco(e1);
        
        //iniciando telefones
        Telefone t1 = new Telefone();
        Telefone t2 = new Telefone();
        Telefone t3 = new Telefone();
        Telefone t4 = new Telefone();
        Telefone t5 = new Telefone();
        Telefone t6 = new Telefone();
        
        t1.setTipo("celular");
        t1.setDdd("61");
        t1.setNumero("12341234");
        t2.setTipo("celular");
        t2.setDdd("62");
        t2.setNumero("56785678");
        telefonesPessoa.add(t1);
        telefonesPessoa.add(t2);
        
        t3.setTipo("celular");
        t3.setDdd("61");
        t3.setNumero("11111111");
        t4.setTipo("celular");
        t4.setDdd("62");
        t4.setNumero("22222222");
        telefonesAluno.add(t3);
        telefonesAluno.add(t4);
        
        t5.setTipo("celular");
        t5.setDdd("61");
        t5.setNumero("33333333");
        t6.setTipo("celular");
        t6.setDdd("62");
        t6.setNumero("44444444");
        telefonesProfessor.add(t5);
        telefonesProfessor.add(t6);
        
        //transferindo telefones para pessoa
        p1.setTelefones(telefonesPessoa);
        
        //criando aluno
        a1.setNome("Maria");
        a1.setCpf("111.111.111-11");
        a1.setEmail("emailteste11@gmail.com");
        a1.setEndereco(e1);
        a1.setCurso(c1);
        a1.setTelefones(telefonesAluno);
        //criando notas
        notas.add(10.0);
        notas.add(8.6);
        a1.setNotas(notas);
        
        //criando professor
        pr1.setNome("Paulo");
        pr1.setCpf("222.222.222-22");
        pr1.setEmail("professor@gmail.com");
        pr1.setEndereco(e1);
        pr1.setTelefones(telefonesProfessor);
        pr1.setTitulacao("Titulacao XYZ");
        pr1.setSalario(3000);
        
        //adicionando cursos ao arraylist
        cursos.add(c1);
        cursos.add(c2);
        
        pr1.setCursos(cursos);
        
        //adicionando disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Matemática");
        disciplina.addAluno(a1);
        disciplina.addCurso(c1);
        disciplina.setProfessor(pr1);

        disciplina.imprimirDisciplina();
        
        p1.imprimir();
        System.out.println("\n");
        a1.imprimir();
        System.out.println("\n");
        pr1.imprimir();
    }
    
}
