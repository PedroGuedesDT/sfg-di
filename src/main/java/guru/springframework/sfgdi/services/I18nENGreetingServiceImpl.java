package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nENGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello There";
    }
}
