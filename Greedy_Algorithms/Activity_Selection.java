import java.util.ArrayList;

public class Activity_Selection {
  public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};

    //end time basis sorted
    int maxAct=0;//count
    ArrayList<Integer> ans=new ArrayList<>();//to store the index of activities

    //1st activity
    maxAct=1;
    ans.add(0);//add 1st activity into ans arraylist
    int lastEnd=end[0];//end of 1st activity
    for(int i=1;i<end.length;i++){
        //main logic
        if(start[i]>=lastEnd){
            //activity select
            maxAct++;
            ans.add(i);
            lastEnd=end[i];
        }
    }
    System.out.println("max activities = "+maxAct);
    for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();
  }  
}
