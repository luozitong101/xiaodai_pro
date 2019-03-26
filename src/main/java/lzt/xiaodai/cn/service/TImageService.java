package lzt.xiaodai.cn.service;


import com.baomidou.mybatisplus.extension.service.IService;
import lzt.xiaodai.cn.entity.TImage;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
public interface TImageService extends IService<TImage> {

    String upload(MultipartFile file,String mobile,String flag);
}
