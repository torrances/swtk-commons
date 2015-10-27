package org.swtk.commons.dict.wordnet.index.name.instance.b.e.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBELA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"belamcanda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12436416\"]}");
	add("{\"term\":\"belarus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09033521\"]}");
	add("{\"term\":\"belarusian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06957242\"]}");
	add("{\"term\":\"belau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09000318\"]}");
	add("{\"term\":\"belay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09241401\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }