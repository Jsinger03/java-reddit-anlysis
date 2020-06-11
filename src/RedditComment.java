public class RedditComment {
	private String body;
	// private String author;
	private String subreddit;
	// private String link_id;
	// private String parent_id;
	// private String adjective;	
	private int score;
	// private int created_utc;
	// private int bodyScore;
	

	// databaase (reddit commentSource <- JsonParse) -> RedditComment (ArrayList -> subreddit -> sort()) -> gui (inputs) -> RedditComment -> parse sum number (or take the bodyScore) -> gui display 10 commments 
	//
	// Limations: 1) slow 2) words
	
	RedditComment() {
	}


	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}


	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}


	/**
	 * @return the subreddit
	 */
	public String getSubreddit() {
		return subreddit;
	}


	/**
	 * @param subreddit the subreddit to set
	 */
	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}


	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "RedditComment [body=" + body + ", score=" + score + ", subreddit=" + subreddit + "]";
	}

}
