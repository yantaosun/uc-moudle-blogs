package com.uc.moudle.blogs.provider.mapper;import com.uc.blogs.api.entity.UcPagesTab;import org.apache.ibatis.annotations.Param;import java.util.List;/** * @author 9527 * @ClassName PagesTabMapper * @Date 2020/3/10 * @Description TODO * @Version 1.0 */public interface PagesTabMapper {    List<UcPagesTab> queryUserTabs(@Param("status") Integer status, @Param("userId") Integer userId);}