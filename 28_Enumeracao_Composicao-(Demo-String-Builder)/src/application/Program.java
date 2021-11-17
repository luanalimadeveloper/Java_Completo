package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		///////////// First  Post
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("14/08/2022 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				6);
		p1.addComment(c1);
		p1.addComment(c2);
		
		/////////////Second Post
		
		Comment c3 = new Comment("Gut Nacht!");
		Comment c4 = new Comment("May the Force be with you!");
		Post p2 = new Post(
				sdf.parse("25/12/2021 19:45:24"), 
				"God night guys", 
				"See you tomorrow!", 
				12);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);


	}

}
