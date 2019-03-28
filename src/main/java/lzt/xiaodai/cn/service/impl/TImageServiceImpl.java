package lzt.xiaodai.cn.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lzt.xiaodai.cn.entity.TImage;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.mapper.TImageMapper;
import lzt.xiaodai.cn.service.TImageService;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.tool.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Service
public class TImageServiceImpl extends ServiceImpl<TImageMapper, TImage> implements TImageService {

    @Value("${web.upload-path}")
    private String path;

    @Autowired
    TProjectService tProjectService;

    /**
     *
     * @param file 0 front 1 back 2 family
     * @param mobile
     * @param flag
     * @return
     */
    @Override
    public String upload(MultipartFile file,String mobile,String flag) {
        String filename = FileUpload.writeFileUpload(file, path);
        QueryWrapper<TImage> condition = new QueryWrapper<>();
        condition.eq("extends_1",mobile);
        TImage exist = this.getOne(condition);
        int imageid ;
        if (exist != null){
            setValue(flag, filename, exist);
            this.update(exist,condition);
            imageid = exist.getId();
        }else {
            TImage tImage = new TImage();
            tImage.setExtends1(mobile);
            setValue(flag,filename,tImage);
            this.save(tImage);
            imageid = tImage.getId();
        }
        //关联证件信息到tproject
        TProject tProject = new TProject();
        tProject.setImageid(imageid);
        tProject.setPhaseid(5);
        Wrapper<TProject>updatewarpper = new UpdateWrapper<>();
        ((UpdateWrapper<TProject>) updatewarpper).eq("mobile",mobile);
        tProjectService.update(tProject,updatewarpper);
        return filename;
    }

    private void setValue(String flag, String filename, TImage exist) {
        if (flag.equals("1")){
            exist.setFrontUrl(filename);
        }else if (flag.equals("2")){
            exist.setBackUrl(filename);
        }else if (flag.equals("3")){
            exist.setFamilyUrl(filename);
        }
    }
}
