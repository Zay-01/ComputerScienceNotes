/**
 * 2017 AP FRQ Question Digits
 */



public class Digits
{
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        if(num < 10)
        {
            digitList.add(num);
        }
        else
        {
            while(num >0)
            {
                digitList.add(num % 10);
                num /= 10;
            }
        }
    }


    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i > digitList.size(); i++)
        {
            if(digitList.get(i) >= digitList.get(i+1))
            {
                return false;
            }
        }
        return true;

    }
}