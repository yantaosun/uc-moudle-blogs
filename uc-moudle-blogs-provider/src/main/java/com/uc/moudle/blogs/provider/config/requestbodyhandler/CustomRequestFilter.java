package com.uc.moudle.blogs.provider.config.requestbodyhandler;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.stereotype.Component;import javax.servlet.*;import javax.servlet.annotation.WebFilter;import javax.servlet.http.HttpServletRequest;import java.io.IOException;/** * @author 9527 * @ClassName CustomFilter * @Date 2020/2/15 * @Description 从Body中获取流参数的一种实现方式（如果直接在拦截器中获取，则invoke时流只能被读取一次） * @Version 1.0 */@Component@WebFilter(urlPatterns = {"/*"},filterName = "customFilter")public class CustomRequestFilter implements Filter {    private Logger log = LoggerFactory.getLogger(CustomRequestWrapper.class);    @Override    public void init(FilterConfig filterConfig) throws ServletException {    }    @Override    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {        filterChain.doFilter(servletRequest,servletResponse);        /*CustomRequestWrapper requestWapper = null;        if (servletRequest instanceof HttpServletRequest) {            requestWapper = new CustomRequestWrapper((HttpServletRequest) servletRequest);        }        if (requestWapper != null) {            filterChain.doFilter(requestWapper,servletResponse);        } else {            filterChain.doFilter(servletRequest,servletResponse);        }*/    }    @Override    public void destroy() {    }}