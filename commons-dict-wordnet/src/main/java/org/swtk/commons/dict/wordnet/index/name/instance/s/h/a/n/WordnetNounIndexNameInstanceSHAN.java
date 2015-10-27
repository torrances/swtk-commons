package org.swtk.commons.dict.wordnet.index.name.instance.s.h.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06948000\"]}");
	add("{\"term\":\"shandy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07929074\"]}");
	add("{\"term\":\"shandygaff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07929074\"]}");
	add("{\"term\":\"shang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08175213\"]}");
	add("{\"term\":\"shanghai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08746101\"]}");
	add("{\"term\":\"shanghaier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10605673\"]}");
	add("{\"term\":\"shank\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00574982\", \"02465459\", \"04190706\", \"04190862\", \"04191000\", \"04191138\", \"05570389\", \"07672677\"]}");
	add("{\"term\":\"shankar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11315454\"]}");
	add("{\"term\":\"shannon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11315609\"]}");
	add("{\"term\":\"shanny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02616202\"]}");
	add("{\"term\":\"shantung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04191359\"]}");
	add("{\"term\":\"shanty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07064082\", \"03552234\"]}");
	add("{\"term\":\"shantytown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08669611\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }