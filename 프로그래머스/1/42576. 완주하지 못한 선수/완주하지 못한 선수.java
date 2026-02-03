import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 카운트 +1
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 카운트 -1
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 값이 0이 아닌 사람이 완주 못한 선수
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return "";
    }
}
