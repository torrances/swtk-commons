package org.swtk.commons.dict.wordnet.indexbyname.instance.b.e.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bevatron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02836480\"]}");
	add("{\"term\":\"bevel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02836608\", \"02836781\"]}");
	add("{\"term\":\"bevel gear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02836998\"]}");
	add("{\"term\":\"bevel square\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02836608\"]}");
	add("{\"term\":\"beverage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07897775\"]}");
	add("{\"term\":\"beveridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10870263\"]}");
	add("{\"term\":\"beverly hills\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09085261\"]}");
	add("{\"term\":\"beverly sills\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11320321\"]}");
	add("{\"term\":\"bevin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10870560\"]}");
	add("{\"term\":\"bevy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08008021\", \"08432731\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }