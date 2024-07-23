public class MinPath {

    public static float getShortestPath(String path)
    {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++)
        {
            // Taking every individual direction as a character 
            char dir = path.charAt(i);

            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // West 
            else if(dir == 'W'){
                x--;
            }
            // East
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) 
    {
        String path = "WNEENESENNN";
        // String path2 = "WEN";
        float ans = getShortestPath(path);
        System.out.println(ans);
    }
}
