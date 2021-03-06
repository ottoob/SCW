package com.ottoob.scw.manager.mapper;

import com.ottoob.scw.manager.bean.ProjectTag;
import com.ottoob.scw.manager.bean.ProjectTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTagMapper {
    long countByExample(ProjectTagExample example);

    int deleteByExample(ProjectTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTag record);

    int insertSelective(ProjectTag record);

    List<ProjectTag> selectByExample(ProjectTagExample example);

    ProjectTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectTag record, @Param("example") ProjectTagExample example);

    int updateByExample(@Param("record") ProjectTag record, @Param("example") ProjectTagExample example);

    int updateByPrimaryKeySelective(ProjectTag record);

    int updateByPrimaryKey(ProjectTag record);
}