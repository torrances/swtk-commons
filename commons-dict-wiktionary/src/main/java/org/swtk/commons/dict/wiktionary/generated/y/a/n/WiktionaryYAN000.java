package org.swtk.commons.dict.wiktionary.generated.y.a.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yangon", "{\"term\":\"yangon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|my|ရန်ကုန်|tr\u003dran-kun|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The largest city and former capital of Myanmar (Burma). Formerly known as Rangoon. The administrative capital has been moved to Naypyidaw or Nay Pyi Taw\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yanker", "{\"term\":\"yanker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|yank|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who yanks, or gives a sudden hard pul\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A brazen li\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }