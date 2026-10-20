public class MostWaterContainer {

    public int maxArea(int[] height) {
        
        int maxWater = Integer.MIN_VALUE;

        int i = 0, j = height.length-1;
        
        while (i < j) {
            
            int h = Math.min(height[i], height[j]);
            int w = j - i ;
            int area = h * w;

            if( height[i] > height[j] ){
                j--;
            }
            else {
                i++;
            }

            if( area > maxWater )
                maxWater = area;
        }
        return maxWater;
    }



    public static void main(String[] args) {
        
    }
}