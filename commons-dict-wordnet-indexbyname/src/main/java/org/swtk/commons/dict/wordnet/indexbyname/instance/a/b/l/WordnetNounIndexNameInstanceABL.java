package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ablactation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00199119\", \"13444578\"]}");
	add("{\"term\":\"ablation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13444662\", \"00394177\"]}");
	add("{\"term\":\"ablative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06323408\"]}");
	add("{\"term\":\"ablative absolute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06323602\"]}");
	add("{\"term\":\"ablative case\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06323408\"]}");
	add("{\"term\":\"ablaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07126811\"]}");
	add("{\"term\":\"able seaman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775831\"]}");
	add("{\"term\":\"ableism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01156732\"]}");
	add("{\"term\":\"ablepharia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14175651\"]}");
	add("{\"term\":\"ablism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01156732\"]}");
	add("{\"term\":\"abls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06711538\"]}");
	add("{\"term\":\"ablution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00256317\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }