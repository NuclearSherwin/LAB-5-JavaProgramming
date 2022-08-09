package Store;

public class WebStore extends Store {
    private String internetAddress;
    private String programLanguage;

    public WebStore(String newName, String internetAddress, String programLanguage) {
        super(newName);
        this.internetAddress = internetAddress;
        this.programLanguage = programLanguage;
    }

    public String getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    @Override
    public String toString() {
        return "WebStore{" +
                "internetAddress='" + internetAddress + '\'' +
                ", programLanguage='" + programLanguage + '\'' +
                '}';
    }
}
