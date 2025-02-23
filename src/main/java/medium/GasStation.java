package main.java.medium;

/**
 * {@link https://leetcode.com/problems/gas-station/description}
 */
public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost ={3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int gasTank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];

            gasTank = gasTank + gas[i] - cost[i];

            if (gasTank < 0) {
                start = i+1;
                gasTank = 0;
            }
        }

        return totalGas >= totalCost ? start: -1;
    }
}
