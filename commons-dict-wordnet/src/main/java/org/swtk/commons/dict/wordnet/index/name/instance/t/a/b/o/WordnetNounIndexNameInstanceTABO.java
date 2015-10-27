package org.swtk.commons.dict.wordnet.index.name.instance.t.a.b.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTABO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"taboo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04891497\", \"05959101\"]}");
	add("{\"term\":\"tabooli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07824880\"]}");
	add("{\"term\":\"tabor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389421\"]}");
	add("{\"term\":\"tabora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09058327\"]}");
	add("{\"term\":\"taboret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389525\"]}");
	add("{\"term\":\"tabour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389421\"]}");
	add("{\"term\":\"tabouret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389525\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }