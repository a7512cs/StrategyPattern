/**
 * �_�I��(Context)
 */
public class Adventurer {
    FlightStrategy flightStrategy;  //���P�԰��覡�ĪG���P(strategy)
    /**
     * ����
     */
    public void attack(){
        // �w�]�����q����
        if(flightStrategy == null){
            flightStrategy = new NormalAttack();
        }
        flightStrategy.execute();
    }

    /**
     * ��ܤ��P���Z��(����)
     */
    public void choiceStrategy(FlightStrategy strategy){
        this.flightStrategy = strategy;
    }
}
