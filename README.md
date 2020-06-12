# java-reddit-analysis
Reddit anlysis - really basic.

Carlos "Karl" Hernandez and Julian Singer

----------------------------------------------------------------------------------------------

Important Note: We are running java14

----------------------------------------------------------------------------------------------

What to run for Windows:

1) CD into src

2) In the terminal, input: javac -cp "gson-2.8.6.jar;." RedditMain.java

3) java -cp "gson-2.8.6.jar;." RedditMain

4) Wait as database is initialized

5) Follow prompts on GUI

----------------------------------------------------------------------------------------------

What to run for Linux / MacOS:

1) CD into src

2) In the terminal, input: javac -cp "gson-2.8.6.jar:." RedditMain.java

3) java -cp "gson-2.8.6.jar:." RedditMain

4) Wait as database is initialized

5) Follow prompts on GUI


----------------------------------------------------------------------------------------------

Limitations:

- slow if it is closed and rerun every time a word is searched for

- takes a while to initialize the database

-------------------------------------------------------------------------------$

To change the file of comments:

1) go to database (src/database)

2) go to JsonParse.java

3) change comment source (private static String commentSource = "../../2015.json";) [must be relative directory]

4) change JsonParse.java to match the source

5) go to subredditFacts

6) change comment source in SubredditFacts

7) OPTIONAL: change file names in ToJson.java

8) go to RealData.java

9) switch what wordDataFile and subredditDataFile to the files wanted (words.json and subreddits.json)
