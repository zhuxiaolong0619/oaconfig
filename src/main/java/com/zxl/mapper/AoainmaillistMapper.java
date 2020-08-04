package com.zxl.mapper;

import java.util.List;
import java.util.Map;

import com.zxl.service.AoainmaillistService;

public interface AoainmaillistMapper {

    public List<AoainmaillistService> queryAoainmaillist();

    public void addAoainmaillist(AoainmaillistService a);

    public List<AoainmaillistService> getAoainmaillistByfy(Map<String,Object> map);

    public void upAoainmaillist (AoainmaillistService a);
}