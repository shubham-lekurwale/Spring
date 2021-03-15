package app.sendGrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sendgrid.Response;

import app.sendGrid.properties.AppProperties;
import app.sendGrid.service.EmailService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private EmailService mail;
	@Autowired
	private AppProperties prop;

	@GetMapping("/")
	public String index(ModelMap mp) {
		return "index";
	}

	@PostMapping("/textEmail")
	public String textEmail(@RequestParam String EmailTxt, @RequestParam String to, ModelMap mp) {
		Response sendText = mail.sendText(to, EmailTxt);
		if(sendText.getStatusCode() > 199 && sendText.getStatusCode() < 300)
			mp.put("status", "Email send Successfully to " + to);
		else
			mp.put("status", "Unable to send email to " + to);
		return "redirect:/";
	}
	
	@PostMapping("/htmlEmail")
	public String htmlEmail(@RequestParam String EmailTxt, @RequestParam String to, ModelMap mp) {
		Response sendText = mail.sendHtml(to, EmailTxt);
		if(sendText.getStatusCode() > 199 && sendText.getStatusCode() < 300)
			mp.put("status", "Email send Successfully to " + to);
		else {
			mp.put("status", "Unable to send email to " + to);
			mp.put("msg", sendText.getBody());
		}
		return "redirect:/";
	}

	@PostMapping("/templateEmail")
	public String templateEmail(@RequestParam String to, ModelMap mp) {
		Response sendText = mail.sendTemplate(to, prop.testTemplateId);
		if(sendText.getStatusCode() > 199 && sendText.getStatusCode() < 300)
			mp.put("status", "Email send Successfully to " + to);
		else
			mp.put("status", "Unable to send email to " + to);
		return "redirect:/";
	}
}
