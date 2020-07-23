class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = z & 1;
        for (int i = 1; i < 32; i++) {
            if (((z >> i) & 1) != 0) {
                count++;
            }
        }
        return count;
    }
}
