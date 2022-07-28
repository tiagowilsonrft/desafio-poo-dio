import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso_java = new Curso();
        
        curso_java.setTitulo("curso java");
        curso_java.setDescricao("descrição curso java");
        curso_java.setCargaHoraria(8);
      
        
      

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");        
        mentoria.setData(LocalDate.now());
        
        Curso python = new Curso();
        python.setTitulo("Python");
        python.setDescricao("descrição curso de python");
        python.setCargaHoraria(6);

        Mentoria mentoria_py = new Mentoria();
        mentoria_py.setTitulo("mentoria de Python");
        mentoria_py.setDescricao("descrição mentoria python");        
        mentoria_py.setData(LocalDate.now());    
        
        
        Curso web = new Curso();
        web.setTitulo("Desenvolvimento web");
        web.setDescricao("descrição curso de desenvolvimento web");
        web.setCargaHoraria(12);

        Mentoria mentoria_web = new Mentoria();
        mentoria_web.setTitulo("mentoria de web");
        mentoria_web.setDescricao("descrição mentoria de desenvolvimento web");        
        mentoria_web.setData(LocalDate.now());
        
        Curso banco_dados = new Curso();
        banco_dados.setTitulo("Desenvolvimento de banco de dados");
        banco_dados.setDescricao("descrição curso de desenvolvimento web");
        banco_dados.setCargaHoraria(12);

        Mentoria mentoria_banco_dados = new Mentoria();
        mentoria_banco_dados.setTitulo("mentoria de banco de dados");
        mentoria_banco_dados.setDescricao("descrição mentoria de banco de dados");        
        mentoria_banco_dados.setData(LocalDate.now());      
        
        

        /*System.out.println(curso_java);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso_java);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(python);
        bootcamp.getConteudos().add(mentoria_py);
        bootcamp.getConteudos().add(web);
        bootcamp.getConteudos().add(mentoria_web);
        bootcamp.getConteudos().add(banco_dados);
        bootcamp.getConteudos().add(mentoria_banco_dados);
        

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:\n" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("------- \n");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:\n" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--------\n");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:\n" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        Dev devMaicon = new Dev();
        devMaicon.setNome("Maicon da Silva");
        devMaicon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maicon:\n" + devMaicon.getConteudosInscritos());
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        devMaicon.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Maicon:\n" + devMaicon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maion:\n" + devMaicon.getConteudosConcluidos());
        System.out.println("XP:" + devMaicon.calcularTotalXp());

        System.out.println("--------------- \n");
        
        Dev devManoel = new Dev();
        devManoel.setNome("Manoel");
        devManoel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Manoel:\n" + devManoel.getConteudosInscritos());
        devManoel.progredir();
        devManoel.progredir();
        devManoel.progredir();
        devManoel.progredir();
        devManoel.progredir();
        devManoel.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Manoel:\n" + devManoel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Manoel:\n" + devManoel.getConteudosConcluidos());
        System.out.println("XP:" + devManoel.calcularTotalXp());

        System.out.println("--------------- \n");
        
        Dev devJorel = new Dev();
        devJorel.setNome("Jorel");
        devJorel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jorel:\n" + devJorel.getConteudosInscritos());
        devJorel.progredir();
        devJorel.progredir();
        devJorel.progredir();
        devJorel.progredir();
        devJorel.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Jorel:\n" + devJorel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jorel:\n" + devJorel.getConteudosConcluidos());
        System.out.println("XP:" + devJorel.calcularTotalXp());

        System.out.println("--------------- \n");
        
        Dev devLeticia = new Dev();
        devLeticia.setNome("Leticia Soares");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Manoel:\n" + devLeticia.getConteudosInscritos());
        devLeticia.progredir();
        devLeticia.progredir();
        devLeticia.progredir();
        devLeticia.progredir();
        devLeticia.progredir();
        devLeticia.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Manoel:\n" + devLeticia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Manoel:\n" + devLeticia.getConteudosConcluidos());
        System.out.println("XP:" + devLeticia.calcularTotalXp());

        System.out.println("--------------- \n");
        
        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel Fernandes");
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jorel:\n" + devMiguel.getConteudosInscritos());
        devMiguel.progredir();
        devMiguel.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Jorel:\n" + devMiguel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jorel:\n" + devMiguel.getConteudosConcluidos());
        System.out.println("XP:" + devMiguel.calcularTotalXp());

        System.out.println("--------------- \n");





    }

}
