package com._dsa_os.debugmaster.mapper.bugs;

import com._dsa_os.debugmaster.model.bugs.Bug;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BugMapper {
    List<Bug> getAllBugs();
}
