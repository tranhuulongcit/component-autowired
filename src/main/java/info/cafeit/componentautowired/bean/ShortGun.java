package info.cafeit.componentautowired.bean;

import org.springframework.stereotype.Component;

@Component("shortgun") //chúng ta có thể set lại bean name cho component này, mặc định thì bean name sẽ cùng tên với class
public class ShortGun implements Gun {

    @Override
    public void fire() {
        System.out.println("Shortgun is firing...");
    }

}
