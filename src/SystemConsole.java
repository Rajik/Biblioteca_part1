import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemConsole implements Console{

    public void print(String output)
    {
        System.out.print(output);
    }

    public String read()
    {
        try
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
