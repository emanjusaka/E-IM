package top.emanjusaka.eim.service.user.service;

import top.emanjusaka.eim.service.user.model.UserStatusChangeNotifyContent;
import top.emanjusaka.eim.service.user.model.req.PullFriendOnlineStatusReq;
import top.emanjusaka.eim.service.user.model.req.PullUserOnlineStatusReq;
import top.emanjusaka.eim.service.user.model.req.SetUserCustomerStatusReq;
import top.emanjusaka.eim.service.user.model.req.SubscribeUserOnlineStatusReq;
import top.emanjusaka.eim.service.user.model.resp.UserOnlineStatusResp;

import java.util.Map;

/**
 * @description:
 * @author xiongwei
 * @version: 1.0
 */
public interface ImUserStatusService {

    public void processUserOnlineStatusNotify(UserStatusChangeNotifyContent content);

    void subscribeUserOnlineStatus(SubscribeUserOnlineStatusReq req);

    void setUserCustomerStatus(SetUserCustomerStatusReq req);

    Map<String, UserOnlineStatusResp> queryFriendOnlineStatus(PullFriendOnlineStatusReq req);

    Map<String, UserOnlineStatusResp> queryUserOnlineStatus(PullUserOnlineStatusReq req);
}
