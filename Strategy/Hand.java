package Strategy;

public enum Hand {
    
    ROCK("グー",0),
    SCISSORS("チョキ",1),
    PAPER("パー",2);

    private String name;
    private int handValue;

    // 手の値から定数を得るための配列
    private static Hand[] hands = { ROCK, SCISSORS, PAPER };
    // コンストラクタ
    Hand(String name, int handValue){
        this.name = name;
        this.handValue = handValue;
    }
    // 手の値からenum定数を得る
    public static Hand getHand(int handValue){
        return hands[handValue];
    }
    // thisがhより強いときtrue
    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;
    }
    // thisがhより弱いときtrue
    public boolean isWeekerThan(Hand hand){
        return fight(hand) == -1;
    }
    // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1
    private int fight(Hand h){
        if(this==h){
            return 0;
        } else if((this.handValue+1)%3==h.handValue){
            return  1;
        } else {
            return -1;
        }
    }
    // 
    @Override
    public String toString(){
        return name;
    }
}
