package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	//public NormalLonelyTweet() {
	//}

	//commented out unused empty constructor to address Declaration redundancy

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
        return !(tweetBody.trim().length() == 0 || tweetBody.trim().length() > 10); //simplified to address redundant if
	}

	@Override
	public String getTweetBody() {
        return tweetBody;
    }
}
