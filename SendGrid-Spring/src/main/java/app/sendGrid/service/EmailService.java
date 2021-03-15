package app.sendGrid.service;

import com.sendgrid.Response;

public interface EmailService {

	Response sendText(String to, String Text);
	Response sendHtml(String to, String html);
	Response sendTemplate(String to, final String templateId);
}
