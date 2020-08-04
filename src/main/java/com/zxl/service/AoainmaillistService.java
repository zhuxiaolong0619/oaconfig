package com.zxl.service;

import java.util.List;
import java.util.Map;

public interface AoainmaillistService {

    public List<AoainmaillistService> queryAoainmaillist();

    public void addAoainmaillist(AoainmaillistService a);

    public List<AoainmaillistService> getAoainmaillistByfy(Map<String,Object> map);

    public void upAoainmaillist (AoainmaillistService a);


}
