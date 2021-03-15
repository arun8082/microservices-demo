package movie.info.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/movie-info-service")
public class InfoController {

	@Value("${info}")
	private String info;

	@GetMapping("/info")
	public String getInfo() {
		return info;
	}

}
