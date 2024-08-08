class Solution {
    public int solution(int[] box, int n) {
        int x = box[0];
        int y = box[1];
        int z = box[2];
        
        int rx = x / n;
        int ry = y / n;
        int rz = z / n;
        
        int result = rx*ry*rz;
        return result;
            
    }
}