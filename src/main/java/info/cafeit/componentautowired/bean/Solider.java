package info.cafeit.componentautowired.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Solider {

    private Gun gun;
    //cách 1:
    ////Inject thông qua constructor
    //public Solider(@Qualifier("shortGun") Gun gun) {
        ////nếu chúng ta DI thông qua constructor or DI bằng cách sữ dụng @Autowired  thì bắt
        //// buộc phải truyền vào 1 loại súng mặc định.
        ////mà ở đây súng thì sẽ có nhiều loại súng, chúng ta cần chỉ cho spring biết chọn loại súng nào bằng cách
        ////sữ dụng annotation @Qualifier và chỉ ra bean name đó
        ////note: hạn chế của 2 cách DI này là bắt buộc phải truyền tham số mặc định và không thay đổi đc
        //// vậy nên tùy trường hợp ta sẽ sữ dụng cho đúng.
        //this.gun = gun;
    //}

    //cách 2
    //Inject thông qua setter
    //trường hợp DI thông qua setter sữ dụng khi chúng ta muốn binh lính này
    //có thể đổi qua lại nhiều loại súng
    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void action() {
        if (gun != null) {
            gun.fire();
        } else {
            System.out.println("Chưa trang bị vũ khí.");
        }
    }

}
