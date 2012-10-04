import java.util.*;


public class FakeConsole implements Console {

    static ArrayList<String> input=new ArrayList<String>();
    static ArrayList<String> output=new ArrayList<String>();

    static int index=0;

    public FakeConsole()
    {
        initializeInput();
    }

    public void print(String out)
    {
    output.add(out);
    }

    public String read()
    {
        String element=input.get(index);
        ++index;
        return element;

    }


    protected void initializeInput()
    {

        input.add("1");
        input.add("2");
        input.add("2");
        input.add("4");
        input.add("12");
        input.add("3");
        input.add("4");
        input.add("5");
        input.add("111-1112");
        input.add("1234");
        input.add("5");
        input.add("111-1116");
        input.add("1234");



    }

    public boolean isPrinted(String out)
    {
        return output.get(output.size()-1).equals(out);
    }

    public String isPrinted()
    {
        return output.get(output.size()-1);
    }


}
