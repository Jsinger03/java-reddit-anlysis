// package src;

public class RedditComment {
	// private String body;
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
	 * @return the adjective
	 */
	// public String getAdjective() {
	// 	return adjective;
	// }


	// /**
	//  * @param adjective the adjective to set
	//  */
	// public void setAdjective(String adjective) {
	// 	this.adjective = adjective;
	// }


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
		return "RedditComment [score=" + score + ", subreddit=" + subreddit + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		result = prime * result + ((subreddit == null) ? 0 : subreddit.hashCode());
		return result;
	}

}
