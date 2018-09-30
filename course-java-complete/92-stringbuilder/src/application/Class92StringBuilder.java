package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Class92Comment;
import entities.Class92Post;

public class Class92StringBuilder {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Class92Comment c1 = new Class92Comment("Have a nice trip!");
		Class92Comment c2 = new Class92Comment("Wow that's awesome!");
		Class92Post p1 = new Class92Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Class92Comment c3 = new Class92Comment("Good night");
		Class92Comment c4 = new Class92Comment("May the Force be with you");
		Class92Post p2 = new Class92Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}