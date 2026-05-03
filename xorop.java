class xorop {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int value = start + 2 * i;
            res^= value;
        }
        return res;
    }
}