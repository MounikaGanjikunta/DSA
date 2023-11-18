//time limit exceeded when submitted

for(int i = 0; i < gas.length; i++){
                int j = i;
                int totalgas = gas[j];
                while(totalgas >= cost[j]){
                    totalgas = totalgas  - cost[j];
                    j = (j + 1) % gas.length;
                    if(i == j){
                        return i;
                    }
                    totalgas = totalgas  + gas[j];
                }
        }
        return -1;
