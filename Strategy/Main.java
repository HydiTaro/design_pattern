package Strategy;

public class Main {
    public static void main(String args[]){
        if(args.length != 2){
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        //Player player2 = new Player("Hana", new ProbStrategy(seed2));
        Player player3 = new Player("Ran", new RandomStrategy(seed2));
        for(int i=0;i<10000;i++){
            Hand nextHand1 = player1.nextHand();
            //Hand nextHand2 = player2.nextHand();
            // if(nextHand1.isStrongerThan(nextHand2)){
            //     //System.out.println("Winner:"+player1);
            //     player1.win();
            //     player2.lose();
            // } else if (nextHand1.isWeekerThan(nextHand2)){
            //     //System.out.println("Winner:"+player2);
            //     player1.lose();
            //     player2.win();
            // } else {
            //     //System.out.println("Even:"+player1);
            //     player1.even();
            //     player2.even();
            // }
            Hand nextHand3 = player3.nextHand();
            if(nextHand1.isStrongerThan(nextHand3)){
                //System.out.println("Winner:"+player1);
                player1.win();
                player3.lose();
            } else if (nextHand1.isWeekerThan(nextHand3)){
                //System.out.println("Winner:"+player2);
                player1.lose();
                player3.win();
            } else {
                //System.out.println("Even:"+player1);
                player1.even();
                player3.even();
            }
        } 
        System.out.println("===Total result:");
        System.out.println(player1);
        System.out.println(player3);

    }
}
