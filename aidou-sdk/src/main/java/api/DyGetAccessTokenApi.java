package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 抖音获取access_token
 * @author linzhijia
 * @date 2024-01-30 19：26
 * 接口文档地址：https://developer.open-douyin.com/docs/resource/zh-CN/dop/develop/openapi/account-permission/get-access-token
 */
public class DyGetAccessTokenApi extends DyCommonApi{

    @Override
    public CommonResult sendApi(CommonParam params) {
        return null;
    }


    /**
     * 获取token参数
     */
    public class Param{
        /**应用唯一标识对应的密钥*/
        @JsonProperty("client_secret")
        private String clientSecret;

        /**授权码*/
        @JsonProperty("code")
        private String code;

        /**固定值"authorization_code"*/
        @JsonProperty("grant_type")
        private String grantType="authorization_code";

        /**应用唯一标识*/
        @JsonProperty("client_key")
        private String clientKey;
    }

    /**
     * 获取token的结果
     */
    public class Result{
        /**access_token 接口调用凭证超时时间，单位（秒)*/
        @JsonSetter("expires_in")
        private Integer expires_in;

        /**授权用户唯一标识*/
        @JsonSetter("open_id")
        private String open_id;

        /**接口调用凭证*/
        @JsonSetter("access_token")
        private String access_token;

        /** 凭证超时时间，单位（秒)*/
        @JsonSetter("refresh_expires_in")
        private Integer refresh_expires_in;

        /**用户刷新 access_token*/
        @JsonSetter("refresh_token")
        private String refresh_token;

        /**用户授权的作用域（Scope），使用逗号（,）分隔，开放平台几乎每个接口都需要特定的 Scope*/
        @JsonSetter("scope")
        private String scope;

        /***/
        @JsonSetter("log_id")
        private String log_id;
    }
}
