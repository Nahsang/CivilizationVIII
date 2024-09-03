package com.GroupProject.models;

public class Response {

   int player_id;
   int question_id;
   int answer_id;

    public Response() {
    }

    public Response(int player_id, int question_id, int answer_id) {
        this.player_id = player_id;
        this.question_id = question_id;
        this.answer_id = answer_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    @Override
    public String toString() {
        return "Response{" +
                "player_id=" + player_id +
                ", question_id=" + question_id +
                ", answer_id=" + answer_id +
                '}';
    }
}

