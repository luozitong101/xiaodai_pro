package lzt.xiaodai.cn.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.*;
import lzt.xiaodai.cn.entity.vo.Pending;
import lzt.xiaodai.cn.mapper.TProjectMapper;
import lzt.xiaodai.cn.service.*;
import lzt.xiaodai.cn.tool.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 对应用户的所有借款信息  服务实现类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Service
public class TProjectServiceImpl extends ServiceImpl<TProjectMapper, TProject> implements TProjectService {
    @Autowired
    TAuditService tAuditService;
    @Autowired
    TAuthBankService tAuthBankService;
    @Autowired
    TAuthMobileService tAuthMobileService;
    @Autowired
    TIdentityService tIdentityService;
    @Autowired
    TInfoService tInfoService;
    @Autowired
    TItemService tItemService;
    @Autowired
    TAdminService tAdminService;
    @Autowired
    TImageService tImageService;
    @Autowired
    TPhaseService tPhaseService;

    @Autowired
    TContactService contactService;

    @Override
    public List<TProjectVo> queryProject(long page, long rows, BaseMapper<TProject> mapper, Wrapper<TProject> wrapper) {
        IPage<TProject> page1 = PageHelper.getPage(page, rows, mapper, wrapper);
        List<TProject> list = page1.getRecords();
        List<TProjectVo> vos = gettProjectVos(list);
        return vos;
    }

    @Override
    public List<Pending> queryPending(long page, long rows, BaseMapper<TProject> mapper, Wrapper<TProject> wrapper) {
        IPage<TProject> page1 = PageHelper.getPage(page, rows, mapper, wrapper);
        List<TProject> list = page1.getRecords();
        List<Pending> vos = getPendings(list);
        return vos;
    }

    private List<Pending> getPendings(List<TProject> list) {
        Pending vo = null;
        List<Pending> vos = new ArrayList<>();
        for (TProject tProject : list) {
            vo = new Pending();
            if (tProject.getAuthbankid() != null){
                TAuthBank byId = tAuthBankService.getById(tProject.getAuthbankid());
                if (byId != null){
                    vo.setBankName(byId.getAccountbank());
                    vo.setBankNo(byId.getAccountcard());
                }
            }
            if (tProject.getAuthmobileid() != null){
                TAuthMobile byId = tAuthMobileService.getById(tProject.getAuthmobileid());
                if (byId != null){
                    vo.setMobile(byId.getPhone());
                }
            }
            if (tProject.getIdentityid() != null){
                TIdentity byId = tIdentityService.getById(tProject.getIdentityid());
                if (byId != null){
                   vo.setName( byId.getRealname());
                }
            }
            if (tProject.getInfoid() != null){
                vo.setContactId(tProject.getInfoid());
            }
            if (tProject.getItemid() != null){
                TItem byId = tItemService.getById(tProject.getItemid());
                if (byId != null){
                    Integer money = byId.getMoney();
                    Integer day = byId.getDay();
                    //借款时间
                    String extends1 = byId.getExtends1();
                    vo.setBorrowMoney(money);
                    vo.setDay(day);
                    vo.setBorrowTime(extends1);
                }
            }

            if (tProject.getImageid() != null){
                vo.setImageId(tProject.getImageid());
            }if (tProject.getPhaseid() != null){
;
                vo.setPhrase(tProject.getPhaseid());
            }
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public List<TProjectVo> gettProjectVos(List<TProject> list) {
        TProjectVo vo = null;
        List<TProjectVo> vos = new ArrayList<>();
        for (TProject tProject : list) {
             vo = new TProjectVo();
            if (tProject.getAuditid() != null){
                TAudit aud = tAuditService.getById(tProject.getAuditid());
                vo.setAudit(aud);
            }
            if (tProject.getAuthbankid() != null){
                vo.setAuthBank(tAuthBankService.getById(tProject.getAuthbankid()));
            }
            if (tProject.getAuthmobileid() != null){
                vo.setAuthMobile(tAuthMobileService.getById(tProject.getAuthmobileid()));
            }
            if (tProject.getIdentityid() != null){
                vo.setIdentity(tIdentityService.getById(tProject.getIdentityid()));
            }
            if (tProject.getInfoid() != null){
                vo.setInfo(tInfoService.getById(tProject.getInfoid()));
                //查询通讯录
//                if(vo.getInfo() !=null){
//                    QueryWrapper<TContact> q = new QueryWrapper<>();
//                    q.eq("infoid",vo.getInfo().getId());
//                    List<TContact> list1 = contactService.list(q);
//                    vo.getInfo().setContacts(list1);
//                }
            }
            if (tProject.getItemid() != null){
                vo.setItem(tItemService.getById(tProject.getItemid()));
            }
            if (tProject.getAdminid() != null){
                vo.setAdmin(tAdminService.getById(tProject.getAdminid()));
            }
            if (tProject.getImageid() != null){
                vo.setImage(tImageService.getById(tProject.getImageid()));
            }if (tProject.getPhaseid() != null){
                QueryWrapper<TPhase> q = new QueryWrapper<>();
                q.eq("phase",tProject.getPhaseid());
                vo.setTPhase(tPhaseService.getOne(q));
            }
            vo.setMobile(tProject.getMobile());
            vos.add(vo);
        }
        return vos;
    }
}
