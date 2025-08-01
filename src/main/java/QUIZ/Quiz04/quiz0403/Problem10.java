package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 10
public class Problem10 {
    /**
     * 배열이 회문인지 확인합니다.
     * @param list 정수 배열
     * @return 회문이면 true, 아니면 false
     */
    public static boolean isPalindrome(int[] list) {
        // TODO: 배열이 회문인지 확인
        for(int i=0; i<list.length; i++) {
            if(list[i] != list[list.length-i-1]){
                return false;
            }
        }
        return true; // TODO: 회문이면 true, 아니면 false 반환
    }

    public static void main(String[] args) {
        int[] palindromeArray = {1, 2, 3, 2, 1};
        int[] nonPalindromeArray = {1, 2, 3, 4, 5};

        System.out.println("회문 확인: " + isPalindrome(palindromeArray)); // 출력: true
        System.out.println("회문 확인: " + isPalindrome(nonPalindromeArray)); // 출력: false
    }
} 