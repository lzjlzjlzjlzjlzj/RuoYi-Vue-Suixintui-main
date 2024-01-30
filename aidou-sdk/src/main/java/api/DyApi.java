package api;

/**
 * 抖音api接口抽象层
 * @author linzhijia
 * @param <P> 参数
 * @param <R> 返回对象
 */
public interface DyApi<P,R> extends AiDouApi{
    /**
     * 抖音api共有请求参数类
     * @param <P> 类型
     */
     class CommonParam<P>{
         /**请求主机地址*/
        public String host;
        /**请求路径*/
        public String path;
        /**请求主机地址*/
        public String method;
        /**请求响应类型*/
        public String contentType;
        /**请求参数*/
        public P params;
    }

    /**
     * 抖音api共有返回结果类
     * @param <R>
     */
    class CommonResult<R>{
        /**返回数据*/
        public R data;
        /**返回消息*/
        public String message;
    }


    CommonResult<R> sendApi(CommonParam<P> params);

}
