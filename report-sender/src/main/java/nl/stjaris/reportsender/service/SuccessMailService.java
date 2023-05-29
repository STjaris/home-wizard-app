package nl.stjaris.reportsender.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * The type Success mail service.
 */
@Service
@RequiredArgsConstructor
public class SuccessMailService {

  private final JavaMailSender mailsender;

  /**
   * Create message mime message.
   *
   * @return the mime message
   */
  public MimeMessage createMessage() {
    try {
      MimeMessage message = mailsender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, false);
      configureHelper(helper);

      return message;

    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Send mail.
   *
   * @param message the message
   */
  public void sendMail(MimeMessage message){
    mailsender.send(message);
  }

  private void configureHelper(MimeMessageHelper helper) throws MessagingException {
    helper.setPriority(1);
    helper.setFrom("");
    helper.setSubject("");
    helper.setTo("");
  }

}
