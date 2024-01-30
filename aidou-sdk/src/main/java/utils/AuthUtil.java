package utils;


/**
 *
 * 授权工具类
 * @author linzhijia
 * @date 2024-01-29 17:12
 * 主要用于授权地址属性定义
 */
public class AuthUtil {
    private String demoUrl="https://qianchuan.jinritemai.com/openapi/qc/audit/oauth.html?app_id=1769822042063917" +
            "&state=%E9%99%88%E6%B7%BB%E8%B1%AA" +
            "&scope=%5B24000000%2C20120000%2C20100000%2C23000000" +
            "%2C21120000%2C25000000%2C22101100%2C22100200%2C22101300%2C22101000%2C26000000%5D" +
            "&material_auth=1&redirect_uri=https%3A%2F%2Fapi.idoutech.com%2Fauth%2Fqianchuan%2Fauthorization%2F&rid=zuk4nk3s4y9";

    /**
     * 基本授权请求地址
     */
    private String baseUrl;

    /**
     * 申请广告主授权的应用程序ID（APPID）
     */
    private String appid;

    /**
     * 自定义参数，可用于传递自定义信息，回调时会原样带回。例如：可将广告主账号作为自定义参数拼接授权URL并发送给对应广告主申请授权，回调时以区分授权码对应的广告主
     */
    private String state;

    /**
     * scope：即授权范围，授权的权限范围，不传时代表当前应用拥有的所有权限，权限值对应说明可参考
     */
    private String scope;

    /**
     * 即回调链接，由开发者自行提供和定义，需与APPID设置的回调链接一致，用于授权成功跳转并接受回调信息
     */
    private String redirectUrl;


    public void setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setScope(String scope){
        this.scope = scope;
    }

    public void setRedirectUrl(String redirectUrl){
        this.redirectUrl = redirectUrl;
    }

    /**
     * 获取授权地址
     * @param appid appid
     * @param state state
     * @param scope scope
     * @param redirectUrl redirectUrl
     * @return 组装好的授权地址
     */
    public String getUrl(String appid,String state,String scope,String redirectUrl){
        this.appid=appid;
        this.state=state;
        this.scope=scope;
        this.redirectUrl=redirectUrl;
        return getUrl();
    }


    /**
     * 获取授权地址
     * @return 授权组装好的地址
     */
    public String getUrl(){
        StringBuffer buffer=new StringBuffer();
        buffer.append(this.baseUrl);
        this.needAppend(buffer,"?app_id=",appid);
        this.needAppend(buffer,"&state=",state);
        this.needAppend(buffer,"&scope=",scope);
        this.needAppend(buffer,"&material_auth=","1");
        this.needAppend(buffer,"&redirect_uri=",redirectUrl);
        this.needAppend(buffer,"&rid=","zuk4nk3s4y9");
        return buffer.toString();
    }


    /**
     * 是否需要拼接参数
     * @param key 参数key
     * @param value 参数值
     */
    private void needAppend(StringBuffer buffer,String key,String value){
        //为null或者为空的情况不需要拼接该参数
        if(null==buffer||null==key||"".equals(key)||null==value){
            return;
        }
        buffer.append(key);
        buffer.append(value);
    }


    /**
     * token换取
     * @param code
     */
    public void tokenHandle(String code){

    }
}
