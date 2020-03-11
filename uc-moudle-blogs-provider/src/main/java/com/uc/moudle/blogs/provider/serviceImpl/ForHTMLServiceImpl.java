package com.uc.moudle.blogs.provider.serviceImpl;import com.uc.blogs.api.entity.UcBlogs;import com.uc.blogs.api.enums.ErrorCode;import com.uc.blogs.api.exception.BlogsMoudleException;import com.uc.blogs.api.moudle.BlogIndexMoudle;import com.uc.blogs.api.moudle.BlogQueryArg;import com.uc.blogs.api.moudle.Menu;import com.uc.blogs.api.service.BlogsService;import com.uc.blogs.api.service.ForHTMLService;import com.uc.blogs.api.service.PagesTabService;import com.ucs.moudlecommon.params.CommonParamsMoudle;import com.ucs.moudlecommon.response.BaseResponse;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.util.List;/** * @author 9527 * @ClassName ForHTMLServiceImpl * @Date 2020/3/11 * @Description TODO * @Version 1.0 */@Servicepublic class ForHTMLServiceImpl implements ForHTMLService {    private Logger logger = LoggerFactory.getLogger(ForHTMLServiceImpl.class);    @Autowired    private BlogsService blogsService;    @Autowired    private PagesTabService pagesTabService;    @Override    public BaseResponse<BlogIndexMoudle> index(CommonParamsMoudle<Integer> param) throws Exception{        Integer userId = param.getExtra();        if(userId == null){            logger.error("参数有误");            throw new BlogsMoudleException(ErrorCode.PARAM_ILLEGAL,ErrorCode.PARAM_ILLEGAL.getMessage());        }        BaseResponse<BlogIndexMoudle> response = new BaseResponse<>();        List<UcBlogs> blogs =  blogsService.findBlogsByUserId(0,userId);        List<Menu> menus =  pagesTabService.findAllNormalTabsByUser(userId);        BlogIndexMoudle moudle = new BlogIndexMoudle(menus,blogs);        response.setSuccess(true);        response.setResult(moudle);        response.setMessage("操作成功");        response.setCode(0);        return  response;    }}