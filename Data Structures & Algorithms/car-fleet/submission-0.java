class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Pair position with time to reach target
        double[][] cars = new double[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Sort cars based on position (descending → nearest to target first)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double prevTime = 0;

        for (int i = 0; i < n; i++) {
            double currTime = cars[i][1];

            // If current car takes more time → new fleet
            if (currTime > prevTime) {
                fleets++;
                prevTime = currTime;
            }
        }

        return fleets;
    }
}