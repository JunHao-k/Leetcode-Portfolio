import java.util.*;
import java.lang.Math;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> collisionStack = new Stack<Integer>();
        List<Integer> ansArr = new ArrayList<>();
        for(int i = 0; i < asteroids.length; i++){
            if(collisionStack.empty()){
                collisionStack.push(asteroids[i]);
            }
            else{
                int check = collisionStack.peek();
                if((asteroids[i] > 0 && check > 0) || asteroids[i] < 0 && check < 0 || check < 0 && asteroids[i] > 0){
                    collisionStack.push(asteroids[i]);
                }
                else{
                    int fromArr = Math.abs(asteroids[i]);
                    check = Math.abs(check);
                    if(fromArr > check){
                        collisionStack.pop();
                        i--;
                    }
                    else if(fromArr == check){
                        collisionStack.pop();
                    }
                }
            }
        }
        while(!collisionStack.empty()){
            ansArr.add(collisionStack.pop());
        }
        // Reverse the array list because stack will reverse the sequence once and we need to change it back
        Collections.reverse(ansArr); 
        int [] finalArr = new int[ansArr.size()];
        for(int i = 0; i < ansArr.size(); i++){
            finalArr[i] = Integer.valueOf(ansArr.get(i));
        }
        return finalArr;
    }
}