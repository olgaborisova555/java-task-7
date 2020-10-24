public class BonusMilesService {
    public int calculate (int cost) {
        if (cost >= 1000){
            return cost/20;
        }else return 0;
    }
}

