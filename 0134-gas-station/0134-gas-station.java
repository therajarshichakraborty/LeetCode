class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    /*
      1. total gas calc
      2. total cost calc
      3. if total gas < total cost : 
            then return -1;
    
        start = 0;
        current_gas = 0;
      4. for int i=0;i<gas.size;i++ :
            current_gas += (gas[i] - cost[i])
    
             if(current_gas < 0):
                 start = i+1;
                 current_gas = 0;
    */
    if (gas.length != cost.length) {
      return -1;
    }

    int n = gas.length;

    int totalGas = 0;
    int totalCost = 0;

    for (int i = 0; i < n; i++) {
      totalGas += gas[i];
      totalCost += cost[i];
    }

    if (totalGas < totalCost) {
      return -1;
    }

    int currentGas = 0, start = 0;
    for (int i = 0; i < n; i++) {
      currentGas += (gas[i] - cost[i]);

      if (currentGas < 0) {
        start = i + 1;
        currentGas = 0;
      }

    }

    return start;
  }
}