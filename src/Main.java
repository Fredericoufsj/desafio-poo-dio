import br.com.dominio.BootCamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Mecanica","Curso de Mecânica básica",56.0);
        Curso curso2 = new Curso("Mecatronica","Curso de Mecanica básica",56.0);
        Mentoria mentoria1 = new Mentoria("Mentoria de Mecânica","Mentoria para area de Mecatrônica",
                              LocalDate.now());

        BootCamp bootcamp1 = new BootCamp();
        bootcamp1.setNome("Boot Camp Dev");
        bootcamp1.setDescricao("Instruções de mecânica");
        bootcamp1.getConteudo().add(curso1);
        bootcamp1.getConteudo().add(curso2);
        bootcamp1.getConteudo().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Frederico");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Cursos inscritos: "+ dev1.getConteudoInscrito());
        System.out.println("XP atual: "+ dev1.calculaTotalXp());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Cursos inscritos: "+ dev1.getConteudoInscrito());
        System.out.println("Cursos concluidos: "+ dev1.getConteudoConcluido());


    }
}
