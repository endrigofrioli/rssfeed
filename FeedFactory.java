package algorithmsandconstructs.s2019370;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;

public class FeedFactory implements FeedFactoryInterface {

	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {
		

		List<String> myList = new ArrayList<String>(); // creating the array list
		try {
			in = new BufferedReader(new FileReader("test.rss")); // reading the file
			String str;
			while ((str = in.readLine()) != null) { // while we still have lines with content, add to the arrayList!
				myList.add(str);
				System.out.println(myList); // just a test to see the arraylist
				 System.out.println(myList.size());

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();

				}
			}

		}

		return null;
	}

	// 1- Do I have to create an instance of FEED in the main class type Feed, and
	// call the method addItem(); ??"
	// Yes, you will have to create an instance of the Feed class, but not in the
	// Main class.
	// Instead, the instance of Feed will be created in the FeedFactory class. This
	// FeedFactory, will create the instance of the Feed,
	// and will also create instances of the FeedItem class using the data that is
	// coming from the rss file,
	// and will add them to the feed using the addItem method.

	// trying to add the method inside FeedFactory
	public void addItem() {
	}

}
