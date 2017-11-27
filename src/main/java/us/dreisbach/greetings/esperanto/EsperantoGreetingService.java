package us.dreisbach.greetings.esperanto;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import us.dreisbach.greetings.GreetingService;

@Service
@Profile("esperanto")
public class EsperantoGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Saluton!";
    }
}
