package org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yacca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11672668\"]}");
	add("{\"term\":\"yacca podocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11672668\"]}");
	add("{\"term\":\"yacht\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04617370\"]}");
	add("{\"term\":\"yacht chair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04617533\"]}");
	add("{\"term\":\"yacht club\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08247706\"]}");
	add("{\"term\":\"yacht race\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07474949\"]}");
	add("{\"term\":\"yachting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00316216\"]}");
	add("{\"term\":\"yachting cap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03615895\"]}");
	add("{\"term\":\"yachtsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821647\"]}");
	add("{\"term\":\"yachtswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821647\"]}");
	add("{\"term\":\"yack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07151648\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }