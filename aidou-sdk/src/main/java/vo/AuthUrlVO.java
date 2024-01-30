package vo;

/**
 * 授权地址对象
 * @author linzhijia
 *
 */
public class AuthUrlVO {
    /**
     * 二维码图片地址
     */
    private String codeUrl;

    /**
     * 链接跳转地址
     */
    private String httpUrl;

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

}
