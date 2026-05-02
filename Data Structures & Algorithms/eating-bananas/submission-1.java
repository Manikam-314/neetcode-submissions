class Solution {
    public int totalHours(int[] pile,int speed){
        int hours=0;
        for(int piles:pile){
            hours+=Math.ceil((double)piles/speed);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=0;

        for(int pile:piles){
            // if(pile>high){
            //     high=pile;
            // }
            high=Math.max(high, pile);
        }
                int ans=high;
            while(low<=high){
                int mid=low+(high-low)/2;
                int need=totalHours(piles,mid);

                if(need<=h){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }    
    }

