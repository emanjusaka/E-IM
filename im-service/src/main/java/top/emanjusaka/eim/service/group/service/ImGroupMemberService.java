package top.emanjusaka.eim.service.group.service;

import top.emanjusaka.eim.common.ResponseVO;
import top.emanjusaka.eim.service.group.model.req.*;
import top.emanjusaka.eim.service.group.model.resp.GetRoleInGroupResp;

import java.util.Collection;
import java.util.List;

/**
 * @description:
 * @author xiongwei
 * @version: 1.0
 */
public interface ImGroupMemberService {

    public ResponseVO importGroupMember(ImportGroupMemberReq req);

    public ResponseVO addMember(AddGroupMemberReq req);

    public ResponseVO removeMember(RemoveGroupMemberReq req);

    public ResponseVO addGroupMember(String groupId, Integer appId, GroupMemberDto dto);

    public ResponseVO removeGroupMember(String groupId, Integer appId, String memberId);

    public ResponseVO<GetRoleInGroupResp> getRoleInGroupOne(String groupId, String memberId, Integer appId);

    public ResponseVO<Collection<String>> getMemberJoinedGroup(GetJoinedGroupReq req);

    public ResponseVO<List<GroupMemberDto>> getGroupMember(String groupId, Integer appId);

    public List<String> getGroupMemberId(String groupId, Integer appId);

    public List<GroupMemberDto> getGroupManager(String groupId, Integer appId);

    public ResponseVO updateGroupMember(UpdateGroupMemberReq req);

    public ResponseVO transferGroupMember(String owner, String groupId, Integer appId);

    public ResponseVO speak(SpeaMemberReq req);

    ResponseVO<Collection<String>> syncMemberJoinedGroup(String operater, Integer appId);
}
