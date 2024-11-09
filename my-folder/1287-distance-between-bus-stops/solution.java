class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // int l = 0, r = 0, i = start;
        // while (i != destination) {
        //     l += distance[i];
        //     i = (i < distance.length - 1) ? i + 1 : 0;
        // }
        // i = destination;
        // while (i != start) {
        //     r += distance[i];
        //     i = (i < distance.length - 1) ? i + 1 : 0;
        // }
        // return l > r ? r : l;
        int l = 0, r = 0, i = 0, n = distance.length, s = 0, d = 0;
        if (Math.abs(destination - start) < (n / 2)) {
            s = start;
            i = d = destination;
        } else {
            s = destination;
            i = d = start;
        }
        while (i != s) {
            l += distance[i];
            i = (i < n - 1) ? i + 1 : 0;
        }
        i = s;
        while (i != d) {
            r += distance[i];
            if (r > l) return l;
            i = (i < n - 1) ? i + 1 : 0;
        }
        // if (Math.abs(destination - start) < (n / 2)) {
        //     i = destination;
        //     while (i != start) {
        //         l += distance[i];
        //         i = (i < n - 1) ? i + 1 : 0;
        //     }
        //     i = start;
        //     while (i != destination) {
        //         r += distance[i];
        //         if (r > l) return l;
        //         i = (i < n - 1) ? i + 1 : 0;
        //     }
        // } else {
        //     i = start;
        //     while (i != destination) {
        //         l += distance[i];
        //         i = (i < n - 1) ? i + 1 : 0;
        //     }
        //     i = destination;
        //     while (i != start) {
        //         r += distance[i];
        //         if (r > l) return l;
        //         i = (i < n - 1) ? i + 1 : 0;
        //     }
        // }
        return r;
    }
}
