package com._dsa_os.debugmaster.service.bugs;

import com._dsa_os.debugmaster.mapper.bugs.BugMapper;
import com._dsa_os.debugmaster.model.bugs.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    @Autowired
    private BugMapper bugMapper;

    public List<Bug> getAllBugs() {return bugMapper.getAllBugs();}

}
