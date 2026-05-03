class Cntkeychanges {
    public int countKeyChanges(String s) {
        int cn=0;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            c=Character.toLowerCase(c);
            char c1=s.charAt(i-1);
            c1=Character.toLowerCase(c1);
            if(c!=c1) cn++;
        }
        return cn;
    }
}