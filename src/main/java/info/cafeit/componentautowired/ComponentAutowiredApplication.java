package info.cafeit.componentautowired;

import info.cafeit.componentautowired.bean.Solider;
import info.cafeit.componentautowired.bean.Thompson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ComponentAutowiredApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComponentAutowiredApplication.class, args);
	}

	//Cách 3: Inject thông qua field bằng cách sử dụng annotation @Autowired
	@Autowired
	private Solider solider;

	@Autowired
	private Thompson thompson;

	@Override
	public void run(String... args) throws Exception {
		solider.setGun(thompson); //các bạn comment dòng này và run lại chương trình để hiểu hơn nhé
		solider.action();
	}
}
