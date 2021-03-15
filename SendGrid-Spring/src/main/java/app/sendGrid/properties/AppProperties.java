package app.sendGrid.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.sendgrid.SendGrid;

@Configuration
@PropertySource("classpath:application.properties")
public class AppProperties {

	@Autowired
    Environment env;
	public String getApiKey() { return env.getProperty("sendgrid.key"); }
	public String getFromEmail() { return env.getProperty("email.from"); }
	public String getEmailSubject() { return env.getProperty("email.subject"); }
	@Value("${sendgrid.template.test}") public String testTemplateId;
	
	@Bean
    public SendGrid SendGrid(){return new SendGrid(getApiKey()); }
}
