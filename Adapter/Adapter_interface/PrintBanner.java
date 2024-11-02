package Adapter.Adapter_interface;

public class PrintBanner extends Banner implements interfacePrint{
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeek(){
        showWithParen();
    }

    @Override
    public void printStrong(){
        showWithAster();
    }

}
