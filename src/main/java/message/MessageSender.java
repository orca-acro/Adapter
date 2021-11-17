package message;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MessageSender {
    public void send(String text, User user, String country) {
        Date sampleDate = new Date(2021, 11, 16, 20, 45); /// якась дата, выдносно якої перевіряємо
        Date afterTime = new Date(2021, 11, 16, 19, 45); /// активність юзерів
        Date beforeTime = new Date(2021, 11, 16, 21, 45);
        afterTime.setHours(sampleDate.getHours() - 1);
        beforeTime.setHours(sampleDate.getHours() + 1);
        Date userTime = user.getLastActiveTime();
        if(user.getCountry() == country && userTime.before(beforeTime) && userTime.after(afterTime)) {
            System.out.println("Message send to " + user.getClass().getName() + ". Message: " + text + ".");
        }
        else {
            System.out.println("Can't send message");
        }

    }
}

