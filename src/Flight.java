
public class Flight {

    public static void main(String[] args) {
        
        Adventurer ad = new Adventurer();

        // �v�ܩi�Τ@������N�i�H
        System.out.println("�X�{�v�ܩi>");
        ad.choiceStrategy(new NormalAttack());
        ad.attack();
        System.out.println();

        // �Q�`���ĤH�n�μF�`���ۦ����L
        System.out.println("�D�`�D�`���j���v�ܩi>");
        ad.choiceStrategy(new UseSkill());
        ad.attack();
        System.out.println();

        // �X�{���ȤM�j�u�Ȥ����ĤH�A��D��N�L
        System.out.println("�X�{���ȤM�j���L��>");
        ad.choiceStrategy(new UseItem());
        ad.attack();
    }

}
