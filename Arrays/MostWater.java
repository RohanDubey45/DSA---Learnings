public class MostWater 
{
    public static int Container_with_most_water(int[] height)
    {
        // int n = height.length;
        // int maxArea = 0;

        // for(int i=0; i<n; i++)
        // {
        //     for(int j=i+1; j<n; j++)
        //     {
        //         int breadth = Math.abs(j-i);
        //         int length = Math.min(height[i], height[j]);
        //         int area = length * breadth;
        //         maxArea = Math.max(area, maxArea);
        //     }
        // }
        // return maxArea;

        // Two pointer approach
        int maxArea = 0; 
        int start = 0; 
        int end = height.length-1;

        while (start < end)
        {
            // length is the min rod height between start and end 
            int length = Math.min(height[start], height[end]);
            // breadth is the distance between the heights 
            int breadth = Math.abs(end - start);
            int area = length * breadth;
            maxArea = Math.max(area, maxArea);

            if (height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }

        }
        return maxArea;

    }
    public static void main(String[] args)
    {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int area = Container_with_most_water(height);
        System.out.println(area);
    }
}
