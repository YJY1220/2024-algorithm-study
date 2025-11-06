public class Solution {
    public String solution(String str) {
        String [] numbers = str.split(" ");

        int max = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[0]);
        
        for(int i = 0; i<numbers.length; i++){
            int num = Integer.parseInt(numbers[i]);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return min + " " + max;
    }
}