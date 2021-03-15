package movie.catalogue.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-catalogue-service")
@RefreshScope
public class InfoController {

	@Value("${info}")
	private String info;
	
	@GetMapping("/info")
	public String getInfo() {
		return info;		
	}
}
