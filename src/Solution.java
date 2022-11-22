import java.util.Arrays;

class Solution {
    static public int[][] floodFill(int[][] image, int sr, int sc, int color) {

//        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
//            return image;
        //if its already the correct color stop
        if(image[sr][sc] == color)
            return image;
        //start at initial sr,sc
        helper(image, sr, sc, color, image[sc][sr]);

        return image;
    }

   static public void helper(int[][] image, int sc, int sr, int color, int currColor ){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;

        if(currColor != image[sr][sc]) return;

        image[sr][sc] = color;

        //then our 4 recursive calls
        helper(image,sr+1, sc,color,currColor);
        helper(image,sr-1, sc,color,currColor);
        helper(image,sr, sc-1,color,currColor);
        helper(image,sr, sc+1,color,currColor);
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1}, {1,1,1}, {1,1,1}};
        int sr =1, sc =1, color = 2;

        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }
}