interface LoginService {
    boolean login(String username, String password);
}

class EmailService implements LoginService {
    public boolean login(String username, String password) {
        System.out.println("Logging into email");
        return true;
    }
}
class BankingService implements LoginService {
    public boolean login(String username, String password) {
        System.out.println("Logging into bank account");
        return true;
    }
}

public class MainLogin {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        BankingService bankingService = new BankingService();

        emailService.login("user1", "pass1");
        bankingService.login("user2", "pass2");
    }
}