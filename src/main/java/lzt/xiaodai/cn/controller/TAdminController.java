package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.mapper.TAdminMapper;
import lzt.xiaodai.cn.service.TAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 * 管理员列表 前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/tAdmin")
public class TAdminController {
    @Autowired
    TAdminService adminService;

    @Autowired
    TAdminMapper adminMapper;
    private static final Logger logger = LoggerFactory.getLogger(TAdminController.class);



    @RequestMapping(value="/qp/{current}/{pagesize}",method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    @ResponseBody
    public IPage<TAdmin> queryPage2(@PathVariable Integer current,@PathVariable Integer pagesize){
        logger.info(current+"/"+pagesize);
        current = current == null ? 1 : current;
        pagesize = pagesize == null ? 5 : pagesize;
        Page<TAdmin> page = new Page<>(current,pagesize);
        IPage<TAdmin> tAdminIPage = adminMapper.selectPage(page, null);
        return tAdminIPage;


    }

}
