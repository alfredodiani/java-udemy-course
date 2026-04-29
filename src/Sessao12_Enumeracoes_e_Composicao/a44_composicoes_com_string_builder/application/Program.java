package Sessao12_Enumeracoes_e_Composicao.a44_composicoes_com_string_builder.application;

import Sessao12_Enumeracoes_e_Composicao.a44_composicoes_com_string_builder.entities.Comment;
import Sessao12_Enumeracoes_e_Composicao.a44_composicoes_com_string_builder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow! That's awesome!");

        Post p1 = new Post(
                sdf.parse("21/06/2022 13:15:44"),
                "Traveling to New Zealaand",
                "I'm going to visit this wonderful country!",
                12
        );

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}
