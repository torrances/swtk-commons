package org.swtk.commons.dict.wordnet.index.name.instance.t.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"taliban\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08493176\"]}");
	add("{\"term\":\"talien\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08744836\"]}");
	add("{\"term\":\"talinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11883067\"]}");
	add("{\"term\":\"talipes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14238066\"]}");
	add("{\"term\":\"talipot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12610602\"]}");
	add("{\"term\":\"talisman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02709445\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }