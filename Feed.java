package algorithmsandconstructs.s2019370;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

public class Feed implements FeedInterface {

	private static final String title = null;

	@Override
	public void addItem(FeedItem item) {
		

	}

	@Override
	public Collection<String> listTitles() {
		
		String title = myList.get(title);
		System.out.println(title);
		
		Collection <String> listTitles = new ArrayList<String>();
		//for loop to get all the titles
		
		for (int i = 0; i > listTitles.size(); i++ ) {
			System.out.println(((ArrayList<String>) listTitles).get(i)); //before was: sysout(listTitles.get(i) eclipse correct to that
		}
		
		System.out.println(title);
		
		return null;
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		// return null;

		List<String> myList = new ArrayList<String>();
		myList.add(title);
		
	}

	@Override
	public int numItems() {

		// still in TEST, count number of lines as lines = arrays
		File file = new File("test.rss");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] byteArray = new byte[(int) file.length()];
		try {
			fis.read(byteArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = new String(byteArray);
		String[] stringArray = data.split("\r\n");
		System.out.println("Number of lines in the RSS file is ::" + stringArray.length);
		return 0;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		//c

		// Attempt to do a search in the collection with a keyword
		List<String> myList = null;
		if (myList.contains("BREAKING NEWS")) { // searching for the keyword
			System.out.println(myList);
		} else {
			System.out.println("Nothing found!");
		}
		return null;

	}
}
