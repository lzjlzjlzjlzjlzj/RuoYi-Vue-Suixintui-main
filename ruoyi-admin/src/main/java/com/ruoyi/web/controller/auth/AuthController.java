package com.ruoyi.web.controller.auth;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.AuthUtil;
import vo.AuthUrlVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 授权地址控制器
 * @author linzhijia
 */
@Api(tags = "授权地址控制器")
@RestController
@RequestMapping("auth")
public class AuthController {

    /**
     * 获取授权地址
     * @return 授权地址对象
     */
    @ApiOperation("获取授权地址")
    @GetMapping("getAuthUrl")
    public AuthUrlVO getAuthUrl(){
        AuthUrlVO authUrlVO=new AuthUrlVO();
        authUrlVO.setCodeUrl(null);
        AuthUtil authUtil=new AuthUtil();
        authUtil.setBaseUrl("https://qianchuan.jinritemai.com/openapi/qc/audit/oauth.html");
        authUtil.setAppid("1769822042063917");
        authUtil.setRedirectUrl("http://lzjapi666888.natapp1.cc/auth/handleAuthCode");
        authUrlVO.setHttpUrl(authUtil.getUrl());
        return authUrlVO;
    }


    /**
     * 授权code处理
     * 1成功 记录token信息和广告主id
     * 2失败 转发到授权失败页面(暂时无该页面)
     */
    @ApiOperation("授权code处理")
    @GetMapping("handleAuthCode")
    public void handleAuthCode(HttpServletRequest request, HttpServletResponse response){
        String authCode=request.getParameter("auth_code");
        System.out.println("授权code处理");
        if(null==authCode){
            try {
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().println("code信息缺少");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
