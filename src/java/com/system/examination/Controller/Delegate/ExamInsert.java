/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;
import com.system.examination.Controller.Action;
import com.system.examination.Controller.action.ActionExam;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import com.system.examination.DaoImplementaion.Exam_QuestionDaoImple;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Exam_Questions;
import com.system.examination.model.Exam_list;
import com.system.examination.model.Question_Bank;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;

/**
 *
 * @author lokesh
 */
public class ExamInsert extends ActionExam {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
                if(req.getParameter("action").equals("create_new_exam"))
                {
                    //Exam_list el=null;
                    ArrayList<Exam_Questions> eq=null;
                   
                    req.setAttribute("exam", null);
                    req.setAttribute("exam_question", null);
                    try{
                    Question_BankDaoImple qd=new Question_BankDaoImple();
                    ArrayList<Question_Bank> qb=qd.getAll();
                    
                    req.setAttribute("exam_questions_detail",qd.getAll());
                    }catch(Exception e){System.out.println(e);}
                    return "CreateExam.jsp";
                }
                
                if(req.getParameter("action").equals("insertexam"))
                {
                    try {
                        Exam_list e=getExamObjectRequest(req, res);
                        Exam_ListDaoImple ed=new Exam_ListDaoImple();
                        if(ed.insert(e))
                        {
                            Exam_QuestionDaoImple eq=new Exam_QuestionDaoImple();
                            Exam_Questions q1;
                            String[] qid=req.getParameterValues("qid");
                            String[] marks=req.getParameterValues("marks");
                            for(int i=0;i<qid.length;i++){
                                q1=new Exam_Questions();
                                q1.setExam_id(eq.getExamIdByTitle(e.getExam_title()));
                                q1.setQues_id(Integer.parseInt(qid[i]));
                                q1.setQ_marks(Integer.parseInt(marks[i]));
                                eq.insert(q1);
                                Exam_ListDaoImple ld=new Exam_ListDaoImple();
                                req.setAttribute("Exams",ld.getAll());
                                return "Exam_Home.jsp";
                            }
                        }
                    } catch (Exception ex) {
                        
                        System.out.println(ex);
                    }
                }
                
                return "Exam_Home.jsp";
    }
    
}
