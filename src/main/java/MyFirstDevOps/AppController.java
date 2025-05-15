package MyFirstDevOps;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class AppController {
	
	@GetMapping("/add/{num1}/{num2}")
	public String add(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
		return "Sum : " + (num1 + num2);		
	}
}
