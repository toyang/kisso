/**
 * Copyright (c) 2011-2014, hubin (243194995@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.kisso;

/**
 * <p>
 * SSO 常量定义
 * </p>
 * 
 * @author hubin
 * @Date 2014-5-9
 */
public class SSOConstant {

	/**
	 * 基本常量定义
	 */
	public final static String ENCODING = "UTF-8";

	/**
	 * 登录用户数量统计（依赖分布式缓存）
	 * <p>
	 * 使用该配置，必须开启分布式缓存
	 * </p>
	 */
	public final static boolean STATISTIC = false;

	public final static String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public final static String SSO_SECRET_KEY = "h2wmABdfM7i3K80mAS";

	public final static String CUT_SYMBOL = "#";

	/**
	 * Cookie 设置常量 maxage 介绍： -1 浏览器关闭时自动删除 0 立即删除 120 表示Cookie有效期2分钟(以秒为单位)
	 */
	public final static boolean SSO_COOKIE_SECURE = false;

	public final static boolean SSO_COOKIE_HTTPONLY = true;

	public final static int SSO_COOKIE_MAXAGE = -1;

	public final static String SSO_COOKIE_NAME = "uid";

	public final static String SSO_COOKIE_DOMAIN = "";

	public final static String SSO_COOKIE_PATH = "/";

	/**
	 * SSO 登录 Cookie 校验常量
	 */
	public final static boolean SSO_COOKIE_BROWSER = true;

	public final static boolean SSO_COOKIE_CHECKIP = false;

	/**
	 * 自定义 SSOEncrypt Class
	 */
	public final static String SSO_ENCRYPT_CLASS = "";

	/**
	 * 自定义 Token Class
	 */
	public final static String SSO_TOKEN_CLASS = "";
	
	/**
	 * 自定义 SSOParser Class
	 */
	public final static String SSO_PARSER_CLASS = "";
	
	/**
	 * 自定义 SSOStatistic Class
	 */
	public final static String SSO_STATISTIC_CLASS = "";

	/**
	 * 自定义SSOCache Class
	 */
	public final static String SSO_CACHE_CLASS = "";

	/**
	 * 自定义SSOCache Expires
	 * <P>
	 * 缓存过期时间，小于0不过期，单位时间 s 秒
	 * </p>
	 * <p>
	 * 设置缓存Token 如缓存不存在将自动退出登录
	 * </p>
	 */
	public final static int SSO_CACHE_EXPIRES = -1;

	/**
	 * 登录相关常量
	 */
	public final static String SSO_LOGIN_URL = "";

	public final static String SSO_LOGOUT_URL = "";

	/**
	 * SSO 参数定义
	 * <p>
	 * ReturnURL 跳转参数
	 */
	public final static String SSO_PARAM_RETURL = "ReturnURL";

	/**
	 * SSO 跨域相关常量 maxage 介绍： -1 浏览器关闭时自动删除 0 立即删除 120 表示Cookie有效期2分钟(以秒为单位)
	 */
	public final static String SSO_AUTH_COOKIE_NAME = "pid";

	public final static int SSO_AUTH_COOKIE_MAXAGE = 180;

	/**
	 * 拦截器判断后设置 Token至当前请求，减少Token解密次数： request.setAttribute("ssotoken_attr",
	 * token) 使用获取方式： SSOHelper.attrToken(request)
	 */
	public final static String SSO_TOKEN_ATTR = "ssotoken_attr";
}
