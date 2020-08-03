package com.zxl.service;

import java.util.List;
import java.util.Map;

public interface Aoainmaillist {

    public List<Aoainmaillist> queryAoainmaillist();

    public void addAoainmaillist(Aoainmaillist a);

    public List<Aoainmaillist> getAoainmaillistByfy(Map<String,Object> map);

    public void upAoainmaillist (Aoainmaillist a);


}
