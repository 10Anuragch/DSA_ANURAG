//Problem Statement:
/* Given an array of jobs where every job has a deadline and profit if the 
job is finished before thr deadline.It is also given that every job takes a
single unit of time,so the minimum possible deadline for any job is 1.
Maximum the total profit if only one job can be scheduled at a time.
*/
import java.util.*;
public class Job_Sequencing {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
         Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit)
         
    }
}
