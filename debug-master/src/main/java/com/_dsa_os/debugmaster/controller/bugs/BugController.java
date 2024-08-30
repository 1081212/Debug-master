package com._dsa_os.debugmaster.controller.bugs;

import com._dsa_os.debugmaster.model.bugs.Bug;
import com._dsa_os.debugmaster.service.bugs.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bugs")
public class BugController {
    @Autowired
    private BugService bugService;

    @GetMapping("/getAllBugs")
    public List<Bug> getAllBugs() {
        return bugService.getAllBugs();
    }


}
