package com.GroupProject.dao;

import com.GroupProject.models.Response;
import java.util.List;

public interface Responses {


    public int addResponse(Response responses);

    public List<Response> getAllResponse();

    public void deleteResponse(Response responses);





}
