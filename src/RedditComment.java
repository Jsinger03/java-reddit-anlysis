public class RedditComment {
	private String body;
	private String author;
	private String subreddit;
	private String link_id;
	private String parent_id;
	private String adjective;	
	private int score;
	private int created_utc;
	private int bodyScore;
	

	// databaase (reddit commentSource <- JsonParse) -> RedditComment (ArrayList -> subreddit -> sort()) -> gui (inputs) -> RedditComment -> parse sum number (or take the bodyScore) -> gui display 10 commments 
	//
	// Limations: 1) slow 2) words
	
	RedditComment() {
					
	}

	public void setBodyScore(int bodyScore) {
		this.bodyScore = bodyScore;
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
	public String getLink_id() {
		return link_id;
	}

	/**
	 * @return the parent_id
	 */
	public String getParent_id() {
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

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param subreddit the subreddit to set
	 */
	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @param link_id the link_id to set
	 */
	public void setLink_id(String link_id) {
		this.link_id = link_id;
	}

	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	/**
	 * @param created_utc the created_utc to set
	 */
	public void setCreated_utc(int created_utc) {
		this.created_utc = created_utc;
	}

	/**
	 * @return the bodyScore
	 */
	public int getBodyScore() {
		return bodyScore;
	}

}
