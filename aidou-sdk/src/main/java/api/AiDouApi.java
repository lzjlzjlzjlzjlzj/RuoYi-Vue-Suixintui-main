package api;

/**
 * 爱抖api抽象接口
 * @author linzhijia
 * @date 2024-01-30 19:00
 * api接口发起抽象层
 */
public interface AiDouApi<P,R>{
    /**
     * 发起第三方接口调用
     * @param params 请求参数
     * @return 返回结果
     */
    public R send(P params);
}
