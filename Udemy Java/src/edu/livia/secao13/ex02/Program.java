package edu.livia.secao13.ex02;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static public void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setMoment(sdf.parse("21/06/2018 13:05:44"));
        post1.setTitle("Traveling to New Zeland");
        post1.setContent("I'm going to visit this wonderful country!");
        post1.setLikes(12);
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

        Post post2 = new Post();
        post2.setMoment(sdf.parse("28/07/2018 23:14:19"));
        post2.setTitle("Good night guys");
        post2.setContent("See you tomorrow");
        post2.setLikes(5);
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        postList.add(post1); postList.add(post2);

        for (Post post : postList) {
            System.out.println(post.getTitle());
            System.out.println(post.getLikes() + " Likes - " + sdf.format(post.getMoment()));
            System.out.println(post.getContent());
            System.out.println("Comments:");
            for (Comment comment: post.getComments()) {
                System.out.println(comment.getText());
            }
            System.out.println();
        }
    }
}
