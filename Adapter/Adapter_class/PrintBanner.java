package Adapter.Adapter_class;

public class PrintBanner extends abstclassPrint{

    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek(){
        banner.showWithParen();
    }

    @Override
    public void printStrong(){
        banner.showWithAster();
    }

}
