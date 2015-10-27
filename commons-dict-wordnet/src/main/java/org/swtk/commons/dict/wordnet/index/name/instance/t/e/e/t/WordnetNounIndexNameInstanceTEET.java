package org.swtk.commons.dict.wordnet.index.name.instance.t.e.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTEET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"teeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04174820\"]}");
	add("{\"term\":\"teeterboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04174820\"]}");
	add("{\"term\":\"teetertotter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04174820\"]}");
	add("{\"term\":\"teeth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05289932\"]}");
	add("{\"term\":\"teething\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13586984\"]}");
	add("{\"term\":\"teetotaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716778\"]}");
	add("{\"term\":\"teetotaling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01071791\"]}");
	add("{\"term\":\"teetotalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01071791\"]}");
	add("{\"term\":\"teetotalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716778\"]}");
	add("{\"term\":\"teetotaller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716778\"]}");
	add("{\"term\":\"teetotum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04461511\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }