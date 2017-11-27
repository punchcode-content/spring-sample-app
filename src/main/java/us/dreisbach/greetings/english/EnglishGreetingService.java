package us.dreisbach.greetings.english;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import us.dreisbach.greetings.GreetingService;

@Service
@Profile("english")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello!";
    }
}
