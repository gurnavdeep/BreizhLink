package model;

public class BreizhLink {

    private Long id;

    private String userLogin;
    private String url;
    private String shortUrl;
    private String pswd;

    public BreizhLink(){
        super();
    }

    public BreizhLink(String url,String shortUrl){
        this.url = url;
        this.shortUrl = shortUrl;
    }

    public BreizhLink(String userLogin,String url,String shortUrl){
        this.userLogin = userLogin;
        this.url = url;
        this.shortUrl = shortUrl;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
