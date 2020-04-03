
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;
// Modify this to match your package
import algorithmsandconstructs.s2019370.*;

public class FeedReader {

	public static void main(String[] args) throws IOException {

		// This will produce an error until you create your own class
		// FeedFactory and fix the import at line 7
		FeedFactoryInterface factory = new FeedFactory();

		String file = "test.rss";
		BufferedReader in = new BufferedReader(new FileReader(file));

		FeedInterface feed = factory.createFeed(in);

		System.out.println("=== News items ===");

//		for (String title : feed.listTitles()) {
//			System.out.println(title);
//		}

		// trying to do something, calling an item from the feed
//		Feed myFeed = new Feed();
//		FeedItem item = null;
//		myFeed.addItem(item);



		

	}

	
}

 
 
 
 

