class Solution {
    public int[] solution(int[] arr) {
        // 방어: null 또는 빈 배열이면 빈 배열 반환
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // 1) 결과 길이 계산 (연속 중복 제거 후 몇 개 남는지)
        int count = 1; // 첫 값은 무조건 포함
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        // 2) 정확한 크기의 배열 생성 후 채우기
        int[] answer = new int[count];
        int idx = 0;

        answer[idx++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
