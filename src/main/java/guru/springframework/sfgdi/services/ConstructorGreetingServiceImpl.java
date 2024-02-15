package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("constructorGreetingServiceImpl")
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - Constructor";
    }
}
