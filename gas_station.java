public class gas_station {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1) {
            if (gas[0] >= cost[0])
                return 0;
            else return -1;

        }

        for (int i = 0; i < gas.length; i++) {
            if (gas[i] >= cost[i]) {
                int sum_gas = gas[i];
                int sum_cost = cost[i];
                int j = 0;
                int count=0;
                for (j = (i + 1)%cost.length; ; j = (j + 1) % cost.length) {
                    if (count>=cost.length) return i;
                    count++;
                    if (sum_gas + gas[j] >= sum_cost + cost[j]) {
                        sum_gas = sum_gas + gas[j];
                        sum_cost = sum_cost + cost[j];
                    } else {
                        break;
                    }

                }
                if (j == i) return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
//        int gas[] = {1, 2, 3, 4, 5};
//        int cost[] = {3, 4, 5, 1, 2};

        int gas[] = {1,2};

        int cost[] = {2,1};
        System.out.println(new gas_station().canCompleteCircuit(gas, cost));

    }
}
