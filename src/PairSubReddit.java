import java.util.Arrays;

public class PairSubReddit {
    private String subredditName;
    private int[] importantNum;

    public Pair(Comment subreddit) {
        this.subredditName = subreddit.getSubreddit();
        importantNum[] = new int[3];
        importantNum[0] = 1;
        importantNum[1] = subreddit.getScore();
        importantNum[2] = importantNum[1] / importantNum[0];
        //importantNum[0] = count (number of comments)
        //importantNum[1] = total score of comments in that subreddit
        //importantNum[2] = average score in the subreddit
    }

    public String getName() {
        return subredditName;
    }

    public int getNum(int index) {
        return importantNum;
    }

    public void setNewNum(int score) {importantNum[0] +=1; importantNum[1] += score; importantNum[2] = importantNum[1] / importantNum[0];

    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Pair [importantNum: " + importantNum + ", subredditName: " + subredditName + "]";
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        if (subredditName == null) {
            if (other.subredditName != null)
                return false;
        } else if (!subredditName.equals(other.subredditName))
            return false;
        return true;
    }
}
