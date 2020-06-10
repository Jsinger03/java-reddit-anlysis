public class RedditComment {
	private String body;
	private String author;
	private String subreddit;
	private int score;
	private int link_id;
	private int parent_id;
	private int created_utc;
	private int bodyScore;
	

	// databaase (reddit commentSource <- JsonParse) -> RedditComment (ArrayList -> subreddit -> sort()) -> gui (inputs) -> RedditComment -> parse sum number (or take the bodyScore) -> 
	
	RedditComment() {
					
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the subreddit
	 */
	public String getSubreddit() {
		return subreddit;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @return the link_id
	 */
	public int getLink_id() {
		return link_id;
	}

	/**
	 * @return the parent_id
	 */
	public int getParent_id() {
		return parent_id;
	}

	/**
	 * @return the created_utc
	 */
	public int getCreated_utc() {
		return created_utc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "RedditComment [author:" + author + ", body:" + body + ", created_utc:" + created_utc + ", link_id:"
				+ link_id + ", parent_id:" + parent_id + ", score:" + score + ", subreddit:" + subreddit + "]";
}

}
