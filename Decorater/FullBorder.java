package Decorater;

public class FullBorder extends Border{
    public FullBorder(Display display){
        super(display);
    }

    @Override
    public int getColums(){
        return 1+display.getColums()+1;
    }

    @Override
    public int getRows(){
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row){
        if(row==0){
            return "+"+ makeLine('-',display.getColums())+"+";// 上端の枠
        } else if(row==display.getRows()+1){
            return "+"+makeLine('-', display.getColums());// 下端の枠
        } else {
            return "|"+display.getRowText(row-1)+"|";// それ以外
        }
    }

    // 文字chをcount個連続させた文字列を作る
    private String makeLine(char ch, int count){
        StringBuilder line = new StringBuilder();
        for(int i=0;i<count;i++){
            line.append(ch);
        }
        return line.toString();
    }
}
