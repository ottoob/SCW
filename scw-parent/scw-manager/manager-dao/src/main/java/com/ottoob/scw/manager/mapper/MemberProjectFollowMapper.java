package com.ottoob.scw.manager.mapper;

import com.ottoob.scw.manager.bean.MemberProjectFollow;
import com.ottoob.scw.manager.bean.MemberProjectFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProjectFollowMapper {
    long countByExample(MemberProjectFollowExample example);

    int deleteByExample(MemberProjectFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberProjectFollow record);

    int insertSelective(MemberProjectFollow record);

    List<MemberProjectFollow> selectByExample(MemberProjectFollowExample example);

    MemberProjectFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberProjectFollow record, @Param("example") MemberProjectFollowExample example);

    int updateByExample(@Param("record") MemberProjectFollow record, @Param("example") MemberProjectFollowExample example);

    int updateByPrimaryKeySelective(MemberProjectFollow record);

    int updateByPrimaryKey(MemberProjectFollow record);
}