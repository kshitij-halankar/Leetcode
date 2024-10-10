/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    static int bv = 0;
    public int firstBadVersion(int n) {
        rec_check(1, n);
        return bv;
    }

    public void rec_check(int min, int max) {
        if(min <= max) {
            int mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                bv = mid;
                rec_check(min, mid-1);
            } else {
                rec_check(mid+1, max);
            }
        }
    }
}
