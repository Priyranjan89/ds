package my.ds.hackerrank;

public class Test {

    public static void main(String[] args)
    {
        String s = "wwwbbbbwww";
        int cnt = 0;


        //int precnt;
        for (int i = 1;i < s.length();i++)
        {
            //	precnt=cnt;
            char b;
            if (cnt == 0)
            {
                b = 'w';
            }
            else
            {
                b = 'b';
            }


            //cout<<b;
            if (s.charAt(i) == b && s.charAt(i - 1) == b && s.charAt(i + 1) == b)
            { //cout<<"i  "<<i<<endl;
                //cout<<i<<"bbbbbb"
                System.out.println("cnt= "+cnt);
                if( cnt == 0)
                cnt++;
                else if (cnt ==1){
                    cnt--;
                }
                System.out.println(s);
                System.out.println("i= "+i);
                StringBuilder col = new StringBuilder(s);
                col.deleteCharAt(i);
                s = col.toString();

                //cout<<s;
                //		 i=1;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  //continue ;
            }
            else if (s.length() == 2)
            {
                //cout<<!cnt;
                if (cnt != 0)
                {
                    System.out.print("wendy wins");
                    System.out.print("\n");
                }
                else
                {
                    System.out.print("bob wins");
                    System.out.print("\n");
                }

            }
            else if (i == s.length() - 2)
            { //cout<<s<<endl;
                //cout<<!cnt;
                if (cnt == 0)
                {
                    System.out.print("wendy wins");
                    System.out.print("\n");
                }
                else
                {
                    System.out.print("bob wins");
                    System.out.print("\n");
                }
                break;

            }

        }
    }

}
