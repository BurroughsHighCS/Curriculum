class test {
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][4];
        //[0,0,0,0]
        //[0,0,0,0]
        //[0,0,0,0]
        //[0,0,0,0]        

        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = (i * 4) + (j + 1);
                System.out.println(twoDArray[i][j]);
            }
        }
        //[1,2,3,4]
        //[5,6,7,8]
        //[9,10,11,12]
        //[13,14,15,16]
    }
}