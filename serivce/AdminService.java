package serivce;

import model.Question;

import java.util.ArrayList;

public class AdminService {



    //Add qsn
    public void addQsn(Question qsn, ArrayList<Question> list){
        list.add(qsn);
    }

    //Delete qsn -- for now index will be qsnId
    public void removeQsn(int qsnId,ArrayList<Question> list){
        list.remove(qsnId);
    }

    //Edit qsn
    public void editQsn(ArrayList<Question> list, int qsnId, String newQsn){
        Question qsn = list.get(qsnId);
        qsn.setQuestion(newQsn);
    }

    //DIsplay questions

    public void display(ArrayList<Question> list){
       for (Question qsn: list){
           System.out.println(qsn.toString());
       }
    }

}
