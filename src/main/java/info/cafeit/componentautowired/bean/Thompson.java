package info.cafeit.componentautowired.bean;

import org.springframework.stereotype.Component;

@Component
public class Thompson implements Gun {

    @Override
    public void fire() {
        System.out.println("Thompson is firing...");
    }

}
