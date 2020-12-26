/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low =0;
        int high = n;
        int result=0;
        
        while(low<=high) {
            int mid = low+ (high-low)/2;
            
            if(guess(mid) == 0) {
                result = mid;
                break;
            }
            else if(guess(mid)< 0){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
}
