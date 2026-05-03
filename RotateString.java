
class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int l=s.length();
        for(int i=0;i<l;i++){
            String st=s.substring(1);
            char c=s.charAt(0);
            st=st+c;
            if(st.equals(goal))
            return true;
            s=st;
        }
        return false;
    }
}