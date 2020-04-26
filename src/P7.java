import java.util.*;

//力扣  查找常用字符
public class P7 {
    public static List<String> commonChars(String[] A) {
        //统计每个单词字母出现的次数
        List<Map<Character, Integer>> counts = new ArrayList<>();
        for (String s : A) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                int n = map.getOrDefault(c, 0);
                map.put(c, n + 1);
            }
            counts.add(map);
        }
        System.out.println(counts);
        List<String> result = new ArrayList<>();
        //找出字符
        for (char c : counts.get(0).keySet()) {
            boolean allContains = true;
            for (int i = 1; i < counts.size(); i++) {
                Map<Character, Integer> map = counts.get(i);
                if (!map.containsKey(c)) {
                    allContains = false;
                    break;
                }
            }

            //判断是全包含还是不全包含
            if (!allContains) {
                continue;
            }
            //找到c在每个单词中出现的次数的最小值
            int min = counts.get(0).get(c);
            for (int i = 1; i < counts.size(); i++) {
                int n = counts.get(i).get(c);
                if (n < min) {
                    min = n;
                }
            }
            //c这个字母,在每个单词都至少出现了m次
            for (int i = 0; i < min; i++) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
/**
    //力扣 三数之和
    public static List<Integer> treeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int i=0;
        while(i<nums.length-2){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                while(j<k&&nums[i]+nums[j]+nums[k]<0){

                }
            }
        }
    }
*/
    public static void main(String[] args) {
        String[] A={"bella","label","roller"};
        System.out.println(commonChars(A));
    }
}
