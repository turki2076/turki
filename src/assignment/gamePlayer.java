package assignment;

public class gamePlayer {
        String playerid="c1220279";
        String playerName="turki";
        int coins=1000;
    public static void main(String[] args) {



    }
    public gamePlayer(String playerid,String playerName,int coins){
        this.playerid=playerid;
        this.playerName=playerName;
        this.coins=coins;
    }
    public void earnCoins(int amount){
        coins+=amount;
        System.out.println(playerName+"earned"+amount+"coins. New balance"+coins);
    }
    public void spendCoins(int amount){
        if (coins>=amount){
            coins-=amount;
            System.out.println(playerName+"spent"+amount+"coins. New balance"+coins);
        }else
            System.out.println("Not enought coins to complete this transaction");
    }
    public void giftCoins(gamePlayer otherPlayer,int amount){
        if (coins>=amount){
            coins-=amount;
            otherPlayer.coins+=amount;
            System.out.println(playerName+"gifted"+amount+"coins to"+otherPlayer.playerName+".");
        }else
            System.out.println("Not enought coins to complete this transaction");


    }


}

