package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TImage;
import lzt.xiaodai.cn.mapper.TImageMapper;
import lzt.xiaodai.cn.service.TImageService;
import lzt.xiaodai.cn.tool.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/api/tImage")
public class TImageController {

    @Autowired
    TImageService tImageService;
    @Autowired
    TImageMapper tImageMapper;

    private static final Logger logger = LoggerFactory.getLogger(TImageController.class);

    @RequestMapping(value = "/pictures",method = RequestMethod.GET)
    @ResponseBody
    public EasyUiDataGird<TImage> getAllpic(@RequestParam(defaultValue = "5") String rows ,@RequestParam(defaultValue = "1") String page){

        EasyUiDataGird<TImage> pageResult = PageHelper.getPageResult(Long.parseLong(page), Long.parseLong(rows), tImageMapper, null);
        return pageResult;
    }

    @PostMapping("/upload")
    @ResponseBody
    public ResultInfo uploadFile(@RequestParam(value = "file") MultipartFile file,String mobile,String flag){

        return ResultInfo.ok(tImageService.upload(file,mobile,flag));
    }
}
