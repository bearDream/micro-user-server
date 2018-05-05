package cn.ching.user.service.worker;

import cn.ching.mandal.config.annoatation.Service;
import cn.ching.user.service.layer.UserLayer;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description: 用户账号服务实现类
 **/
@Service(timeout = 3000)
public class UserWorker implements UserLayer {

    @Override
    public String getUserNameById(Long userId) {
        if (userId.equals(1L)){
            return "admin";
        }else {
            return "others";
        }
    }
}
