package xhu.wncg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class LabWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabWebApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "forward:login.html";
	}
}
