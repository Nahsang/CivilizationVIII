package com.GroupProject.dao;

import com.GroupProject.models.Response;
import com.GroupProject.utill.ConnectorBuilder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class ResponsesImpl implements Responses {

    @Override
    public int addResponse(Response responses) {

        int status = 0;
        try(Connection con = ConnectorBuilder.getConnection()) {
            String sql = "insert into responses( player_id, question_id, answer_id ) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, responses.getAnswer_id());
            ps.setInt(2, responses.getPlayer_id());
            ps.setInt(3, responses.getQuestion_id());

            status = ps.executeUpdate();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }


        return 0;
    }



    @Override
    public List<Response> getAllResponse() {


        ArrayList<Response> responses = new ArrayList<>();


        try(Connection con = ConnectorBuilder.getConnection()){
            String sql = "select * from responses";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet re = ps.executeQuery();
            while(re.next()){
                Response response = new Response(re.getInt(1),re.getInt(2),
                        re.getInt(3));
                responses.add(response);
            }

        }catch(SQLException e){
            // throw new RuntimeException();
            System.out.println(e.getMessage());
        }
        return responses;



    }






    @Override
    public void deleteResponse(Response responses) {

    }



}