public class ZigZag {
    static public String zigzagstring(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String [] build = new String[numRows];
        String result ="";
        int j=0;
        boolean alter = true;
        for(int i =0; i<numRows;i++){
            build[i]="";
        }
        for(char a : s.toCharArray()){
            build[j] += a;
            if(j == numRows - 1 || j ==0){
                alter = !alter;
            }
            j = alter ? j-1 : j+1;
        }
        for(String ennstr : build){
            result += ennstr;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "pktreveees";
        int i = 4;
        System.out.println(zigzagstring(s, i));

        
    }
}