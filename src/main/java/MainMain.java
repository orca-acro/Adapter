import facebook.FacebookUser;
import message.MessageSender;
import message.MyFacebookUser;
import message.MyTwitterUser;
import message.User;
import twitter.TwitterUser;

import java.util.Date;

public class MainMain {
    public static void main(String[] args) {
        Date currDate1 = new Date(2021, 11, 16, 20, 34);
        Date currDate2 = new Date(2021, 11, 16, 15, 34);
        TwitterUser twitUs = new TwitterUser("aa", "USA", currDate1);
        FacebookUser faceUs = new FacebookUser("bb", "Ukraine", currDate2);
        User face = new MyFacebookUser(faceUs);
        User twit = new MyTwitterUser(twitUs);
        MessageSender sender = new MessageSender();
        sender.send("Hi", face, "Ukraine");
        sender.send("Hi", twit, "Ukraine");
    }
}
