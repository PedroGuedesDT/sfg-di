package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18nService")
public class I18nPTGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Olá mundo";
    }
}
