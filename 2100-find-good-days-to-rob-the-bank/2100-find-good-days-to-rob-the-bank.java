class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] pref = new int[security.length];
        int[] suf = new int[security.length];
        List<Integer> res = new ArrayList<>();

            int p=0, cntP = 0;
        for(int i=1; i<security.length; i++){
            if(security[i-1] >= security[i]){
                cntP++;
            }
            else{
                cntP=0;
            }

            pref[i]=cntP;
        }
                int s=security.length-1, cntS=0;
        for(int i=security.length-2; i>=0; i--){
                if(security[i] <= security[i+1]){
                    cntS++;
                }
                else{
                    cntS=0;
                }

                suf[i]=cntS;
        }



        for(int i=0; i<suf.length; i++){
            if(pref[i] >= time && suf[i] >= time){
                res.add(i);

            }
        }


        return res;
        
    }
}