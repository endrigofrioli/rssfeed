package algorithmsandconstructs;

import java.util.ArrayList;
import java.util.Collection;

import algorithmsandconstructs.s2019370.Feed;

public interface FeedInterface {

	
	Feed newFeed = new Feed();

	
	/**
	 * This method should add a new FeedItem into the Feed
	 * 
	 * @param item -New Feed item
	 */

	public void addItem(FeedItem item);

	
	Item item = new Item();
	
	ArrayList<String> add = new ArrayList<String>();

	String myList;

	FeedItem item = add(String);
	
	
	
	/**
	 * This method returns a collection of the titles of all the items in the feed.
	 * 
	 * @return a list of titles of all the items in the feed.
	 */
	public Collection<String> listTitles();

	/**
	 * This method returns the FeedItem with the given title, or null if no item has
	 * the given title. You can assume that no two items will have the same title
	 * 
	 * @param title the title of the item to find.
	 * @return the FeedItem with the given title or null if no item has the given
	 *         title.
	 */
	public static FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		//return null;
	}

	ArrayList<String> get = new ArrayList<String>();

	String myList;
	FeedItem title = getItem(myList);
	
	/**
	 * This method returns the number of items in the feed.
	 * 
	 * @return the number of items in this feed.
	 */
	public int numItems();

	/**
	 * This method returns a collection of all the items that have the given keyword
	 * in either the title or the content of the item. If no matching item is found,
	 * the method should return an empty collection.
	 * 
	 * @param keyword the keyword to search for.
	 * @return a collection of all the items that have the given keyword in the
	 *         title or the content.
	 */
	public Collection<FeedItem> findItems(String keyword);

}
