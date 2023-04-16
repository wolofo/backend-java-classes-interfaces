public class EmailContactInfo implements ContactInfo {
private String email;

public EmailContactInfo(String email) {
    this.email = email;
}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void sendMessage() {
        System.out.println("Email send to " + email);
    }
}
