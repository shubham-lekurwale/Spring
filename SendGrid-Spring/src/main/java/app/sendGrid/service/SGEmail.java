package app.sendGrid.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

import app.sendGrid.properties.AppProperties;

@Service
public class SGEmail implements EmailService {

	private SendGrid sendGrid;
	@Autowired
	private AppProperties prop;

	String templateId;

	@Autowired
	public SGEmail(SendGrid sendGrid) {
		this.sendGrid = sendGrid;
	}

	public Response sendText(String to, String text) {
		templateId = "";
		Response response = sendEmail(to, new Content("text/plain", text));
		System.out.println("Response Body: " + response.getBody());
		System.out.println("Status Code: " + response.getStatusCode());
		return response;
	}

	public Response sendHtml(String to, String html) {
		templateId = "";
		Response response = sendEmail(to, new Content("text/html", html));
		System.out.println("Response Body: " + response.getBody());
		System.out.println("Status Code: " + response.getStatusCode());
		return response;
	}

	public Response sendTemplate(String to, String templateId) {
		this.templateId = templateId;
		Response response = sendEmail(to, new Content("text/html", "test"));
		System.out.println("Response Body: " + response.getBody());
		System.out.println("Status Code: " + response.getStatusCode());
		return response;
	}

	private Response sendEmail(String to, Content content) {
		Email fromEmail = new Email(prop.getFromEmail());
		Email toEmail = new Email(to);
		Mail mail;
		mail = new Mail();
		mail.setFrom(fromEmail);
		mail.setSubject(prop.getEmailSubject());
		mail.addContent(content);
		Request request = new Request();
		Personalization p = new Personalization();
		p.addTo(toEmail);
		mail.addPersonalization(p);
		if (!templateId.isEmpty()) {
			mail.setTemplateId(templateId);
			p.addDynamicTemplateData("toEmail", to);
		}
		Response response = null;
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			response = this.sendGrid.api(request);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return response;
	}
}
