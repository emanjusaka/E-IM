package top.emanjusaka.eim.agreement.pack.friendship;

import lombok.Data;

/**
 * @author xiongwei
 * @description: 用户创建好友分组通知包
 **/
@Data
public class AddFriendGroupPack {
    public String fromId;

    private String groupName;

    /**
     * 序列号
     */
    private Long sequence;
}
