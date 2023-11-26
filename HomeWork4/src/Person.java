import java.util.UUID;

public class Person {
    private UUID id;
    private String fio;
    private String cardNumber;
    private long hashPass;
    private String login;

    public Person(String fio, long hashPass, String login) {
        this.id = UUID.randomUUID();
        this.fio = fio;
        this.hashPass = hashPass;
        this.login = login;
    }

    public UUID getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getHashPass() {
        return hashPass;
    }

    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return getId() + " " + getLogin() + " " + getFio();
    }
}
