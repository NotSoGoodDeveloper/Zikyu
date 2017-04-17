package zero.zd.zquestionnaire.model;

import java.util.ArrayList;

public class QnASubject {

    private String mSubjectName;
    private ArrayList<QnA> mQnaList;

    public QnASubject(String subjectName, ArrayList<QnA> qnaList) {
        mSubjectName = subjectName;
        mQnaList = qnaList;
    }

    public String getSubjectName() {
        return mSubjectName;
    }

    public void setSubjectName(String subjectName) {
        mSubjectName = subjectName;
    }

    public ArrayList<QnA> getQnaList() {
        return mQnaList;
    }

    public void setQnaList(ArrayList<QnA> qnaList) {
        mQnaList = qnaList;
    }
}
