package com.tensquare.web.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-6 19:07
 * @Author: 846602483
 * @Description:
 */
@Component
public class WebFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //得到request上下文
       RequestContext requestContext =  RequestContext.getCurrentContext();
       //得到request域
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        //得到头信息
        String header = httpServletRequest.getHeader("Authorization");
        //判断是否有头信息
        if (header != null && !"".equals(header)){

            //把头信息继续往下传
            requestContext.addZuulRequestHeader("Authorization",header);
        }
        return null;
    }
}
