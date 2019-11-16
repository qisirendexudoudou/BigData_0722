package run100;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

	public class test14 {

		public static void main(String[] args) throws Exception {
			HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
			
			ArrayList<String> bj = new ArrayList<String>();
			bj.add("北京市");
			map.put("北京市", bj);
			
			ArrayList<String> hn = new ArrayList<String>();
			hn.add("海口市");
			hn.add("三亚市");
			map.put("海南省", hn);
			
			ArrayList<String> zj = new ArrayList<String>();
			zj.add("绍兴市");
			zj.add("温州市");
			zj.add("湖州市");
			zj.add("嘉兴市");
			zj.add("台州市");
			zj.add("金华市");
			zj.add("舟山市");
			zj.add("衢州市");
			zj.add("丽水市");
			map.put("浙江省", zj);
		
			Set<Entry<String, ArrayList<String>>> entrySet = map.entrySet();
			for (Entry<String, ArrayList<String>> entry : entrySet) {
				System.out.println(entry.getKey());
				ArrayList<String> value = entry.getValue();
				for (String string : value) {
					System.out.println("\t" + string);
				}
			}
		}
	}
