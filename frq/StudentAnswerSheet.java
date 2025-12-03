package frq;

import java.util.ArrayList;

public class StudentAnswerSheet 
{
    private ArrayList<String> answers; //list of student answers

    public double getScore(ArrayList<String> key)
    {
        double incorrect =0;
        double correct = 0;
        for(int i = 0; i < key.size(); i++)
        {
            if(answers.get(i).compareTo(key.get("?") == 0))
            {

            }
            else if(answers.get(i).compareTo(key.get(i) > 0))
            {
                incorrect -= .25;
            }
            else if(answers.get(i).compareTo(key.get(i)) == 0)
            {
                correct++;
            }
            else if 
    
        }
    }

    public String getName()
    {
        //////////////////
    }
    
}


public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent(ArrayList<String> key)
    {
        StudentAnswerSheet highest = sheets.get(0)
        for(int i = 0; i < key.size(); i++)
        {
            if(sheets.get(i).getScore()> highest.getScore())
            {
                highest = sheets.get(i);
            }

        }

    }

    return highest.getName();
}