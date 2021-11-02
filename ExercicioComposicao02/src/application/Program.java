package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// post 1 with 2 comments
		// comments
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		// post
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to the New Zeland",
				"I'm going to this wonderful country!", 12);
		// adding the comments to the post1
		p1.addComment(c1);
		p1.addComment(c2);

		// post 2 with 2 comments
		// comments
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		// post
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

		// adding the comments to the post1
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);
	}

}
