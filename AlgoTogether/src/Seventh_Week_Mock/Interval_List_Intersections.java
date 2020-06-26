package Seventh_Week_Mock;

import java.util.ArrayList;
import java.util.List;

public class Interval_List_Intersections {
    class Solution {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            if (A == null || A.length == 0 || B == null || B.length == 0) {
                return new int[][] {};
            }

            int startMax = 0, endMin = 0;
            int i = 0, j = 0;
            List<int[]> list = new ArrayList<>();

            while (i < A.length && j < B.length) {
                startMax = Math.max(A[i][0], B[j][0]);
                endMin = Math.min(A[i][1], B[j][1]);

                if (endMin >= startMax) {
                    list.add(new int[] {startMax, endMin});
                }

                if (A[i][1] == endMin) i++;
                if (B[j][1] == endMin) j++;
            }
            int[][] res = new int[list.size()][2];
            for (int k = 0; k < list.size(); k++) {
                res[k] = list.get(k);
            }
            return res;
        }
    }
}
