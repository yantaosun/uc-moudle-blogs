package com.uc.blogs.api.service;import com.uc.blogs.api.moudle.BlogIndexMoudle;import com.ucs.moudlecommon.params.CommonParamsMoudle;import com.ucs.moudlecommon.response.BaseResponse;import org.springframework.stereotype.Service;/** * @author 9527 * @ClassName ForHTMLService * @Date 2020/3/11 * @Description TODO * @Version 1.0 */public interface ForHTMLService {    BaseResponse<BlogIndexMoudle> index(CommonParamsMoudle<Integer> paramsMoudle) throws Exception;}