package stackQuestions;

public class testHere {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = new String("ab");
        String b = new String("pqrs");

        int i,j=0;
        for ( i=0,j=0;i<a.length() &&j<b.length();i++,j++)
        {
            sb.append(a.charAt(i));
            sb.append(b.charAt(j));

        }

        if(i==a.length())
        {
            sb.append(b.substring(i,b.length()));
        }
        else
        {
            sb.append(a.substring(j,a.length()));
        }

    }
}
