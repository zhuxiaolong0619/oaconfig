package com.zxl.service.impl;

import com.zxl.mapper.AoainmaillistMapper;
import com.zxl.service.AoainmaillistService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class AoainmaillistServiceImpl implements AoainmaillistService {

    @Autowired
    private AoainmaillistMapper aoainmaillistMapper;

    @Override
    public List<AoainmaillistService> queryAoainmaillist() {
        return aoainmaillistMapper.queryAoainmaillist();
    }

    @Override
    public void addAoainmaillist(AoainmaillistService a) {

        aoainmaillistMapper.addAoainmaillist(a);

    }

    @Override
    public List<AoainmaillistService> getAoainmaillistByfy(Map<String, Object> map) {
        return aoainmaillistMapper.getAoainmaillistByfy(map);
    }

    @Override
    public void upAoainmaillist(AoainmaillistService a) {

        aoainmaillistMapper.upAoainmaillist(a);

    }
}
