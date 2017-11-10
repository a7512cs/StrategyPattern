
public class Flight {

    public static void main(String[] args) {
        
        Adventurer ad = new Adventurer();

        // 史萊姆用一般攻擊就可以
        System.out.println("出現史萊姆>");
        ad.choiceStrategy(new NormalAttack());
        ad.attack();
        System.out.println();

        // 利害的敵人要用厲害的招式打他
        System.out.println("非常非常巨大的史萊姆>");
        ad.choiceStrategy(new UseSkill());
        ad.attack();
        System.out.println();

        // 出現不怕刀槍只怕火的敵人，丟道具燒他
        System.out.println("出現不怕刀槍的殭屍>");
        ad.choiceStrategy(new UseItem());
        ad.attack();
    }

}
