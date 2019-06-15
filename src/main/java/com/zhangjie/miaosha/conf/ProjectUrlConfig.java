package com.zhangjie.miaosha.conf;

/**
 * @ClassName: Jason
 * @Author: Administrator
 * @Date: 2019/1/2 14:29
 * @Description:
 */
//@Data
//@Component
//@ConfigurationProperties(prefix = "projectUrl")
public class ProjectUrlConfig {
    /**
     * 微信公众平台授权url
     */
    public String weChatMpAuthorize;

    /**
     * 微信开放平台授权url
     */
    public String weChatOpenAuthorize;


    /**
     * 获取公众号的AccessToken 的 URL
     */
    public String accessToken;

    /**
     * 获取jsApi-ticket
     */
    public String getticket;

}
