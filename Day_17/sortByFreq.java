import java.util.*;

public class sortByFreq {  
    public static ArrayList<Integer> sortByFrequency(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int num: arr){
            resultList.add(num);
        }
        Collections.sort(resultList, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                int freqA = freqMap.get(a);
                int freqB = freqMap.get(b);
                if(freqA != freqB){
                    return freqB - freqA;
                }
                else{
                    return a - b;
                }
            }
        });
        return resultList;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = sortByFrequency(arr);
        System.out.println(answer);
        sc.close();
    }
}
