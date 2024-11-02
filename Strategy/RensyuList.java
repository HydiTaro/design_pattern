package Strategy;

import java.util.List;

public class RensyuList{

    List<String> list;

    public RensyuList(List<String> list){
        this.list = list;
    }

    public void sort(boolean order){
        int i,j;
        if(order){
            for(i=0;i<list.size();i++){
                for(j = 1;j<list.size()-i;j++){
                    String before = list.get(i);
                    String after = list.get(i+j);
                    //if(list.get(i) > list.get(i+1)){
                    if(before.compareTo(after)==1){// 前の方が辞書的に後ろの場合
                        list.set(i,after);
                        list.set(i+j,before);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            for(i=0;i<list.size();i++){
                for(j = 1;j<list.size()-i;j++){
                    String before = list.get(i);
                    String after = list.get(i+j);
                    //if(list.get(i) > list.get(i+1)){
                    if(before.compareTo(after)==-1){// 前の方が辞書的に前の場合
                        list.set(i,after);
                        list.set(i+j,before);
                    } else {
                        continue;
                    }
                }
            }    
        }
    }
    public List<String> getList(){
        return list;
    }
    
}
