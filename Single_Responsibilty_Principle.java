//****************************************************************************
// Title : Illustrating the Single Responsibility Principle (SRP)
// Author: Sadia Afrin Tamanna
//         Undergraduate Student
//         Khulna University
//****************************************************************************


/**
 * Manages the dispatching of emails.
 */
class EmailSender {
    /**
     * Sends an email to the specified recipient with the provided subject and message.
     *
     * @param recipientAddress The email address of the recipient.
     * @param emailSubject     The subject line of the email.
     * @param emailContent     The content of the email message.
     */
    public void sendEmail(String recipientAddress, String emailSubject, String emailContent) {
        // Code to send email goes here
        System.out.println("Email sent to: " + recipientAddress);
        System.out.println("Subject: " + emailSubject);
        System.out.println("Content: " + emailContent);
    }
}

/**
 * Demonstrates the utilization of EmailSender class.
 */
class EmailSendingExample {
    public static void main(String[] args) {
        // Create an instance of EmailSender
        EmailSender sender = new EmailSender();

        // Prepare email details
        String recipientAddress = "example@example.com";
        String emailSubject = "Test Email";
        String emailContent = "This is a test email.";

        // Send the email using EmailSender
        sender.sendEmail(recipientAddress, emailSubject, emailContent);
    }
}

/**
 * In the above demonstration, the EmailSender class manages the responsibility
 * of sending emails. The EmailSendingExample class illustrates the usage of EmailSender
 * class without directly involving in the email sending process, thereby adhering
 * to the Single Responsibility Principle (SRP).
 */
