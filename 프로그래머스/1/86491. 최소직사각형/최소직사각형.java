import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int maxw = 0;
        int maxh = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int w = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = w;
            }
            maxw = Math.max(maxw, sizes[i][0]);
            maxh = Math.max(maxh, sizes[i][1]);
        }
        
        int max = maxw * maxh;
        return max;
    }
}