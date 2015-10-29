package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nescience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05997628\"]}");
	add("{\"term\":\"nesokia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02336731\"]}");
	add("{\"term\":\"ness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09256622\"]}");
	add("{\"term\":\"nesselrode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07634293\"]}");
	add("{\"term\":\"nesselrode pudding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07634293\"]}");
	add("{\"term\":\"nessie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09510951\"]}");
	add("{\"term\":\"nest\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03824876\", \"08261267\", \"08661304\", \"03824757\", \"09392066\"]}");
	add("{\"term\":\"nest egg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03824988\", \"13380745\"]}");
	add("{\"term\":\"nester\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01517567\", \"10662616\"]}");
	add("{\"term\":\"nesting place\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08628532\"]}");
	add("{\"term\":\"nestle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418656\"]}");
	add("{\"term\":\"nestling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09937051\", \"01506985\"]}");
	add("{\"term\":\"nestor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01821345\", \"11224266\"]}");
	add("{\"term\":\"nestor notabilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01821473\"]}");
	add("{\"term\":\"nestor paz zamora commission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08051986\"]}");
	add("{\"term\":\"nestorian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10373433\"]}");
	add("{\"term\":\"nestorian church\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08102274\"]}");
	add("{\"term\":\"nestorianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06200040\"]}");
	add("{\"term\":\"nestorius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11224399\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }