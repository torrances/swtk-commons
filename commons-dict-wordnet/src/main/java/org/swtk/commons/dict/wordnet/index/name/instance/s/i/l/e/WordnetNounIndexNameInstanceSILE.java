package org.swtk.commons.dict.wordnet.index.name.instance.s.i.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSILE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"silence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04659534\", \"04659331\", \"04989456\", \"13948583\"]}");
	add("{\"term\":\"silencer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04225631\", \"04225840\"]}");
	add("{\"term\":\"silene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11835960\"]}");
	add("{\"term\":\"silents\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06630259\"]}");
	add("{\"term\":\"silenus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09571445\", \"09571618\"]}");
	add("{\"term\":\"silesia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04226134\", \"09189327\"]}");
	add("{\"term\":\"silex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04226252\", \"15065757\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }