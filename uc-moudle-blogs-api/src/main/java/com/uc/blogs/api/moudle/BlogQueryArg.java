package com.uc.blogs.api.moudle;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;/** * @author 9527 * @ClassName BlogQueryArg * @Date 2020/3/11 * @Description TODO * @Version 1.0 */@Data@AllArgsConstructor@NoArgsConstructorpublic class BlogQueryArg {    private Integer status;    private Integer userId;    private Integer tabId;}