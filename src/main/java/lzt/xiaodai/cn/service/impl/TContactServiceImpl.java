package lzt.xiaodai.cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lzt.xiaodai.cn.entity.TContact;
import lzt.xiaodai.cn.mapper.TContactMapper;
import lzt.xiaodai.cn.service.TContactService;
import org.springframework.stereotype.Service;

/**
 * @author luoyong
 * @Date: 2019/4/1 10:54
 * @Description:
 */
@Service
public class TContactServiceImpl extends ServiceImpl<TContactMapper, TContact> implements TContactService {
}
