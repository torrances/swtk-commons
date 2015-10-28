package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"java\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06913829\", \"07945759\", \"08928021\"]}");
	add("{\"term\":\"javan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10239750\"]}");
	add("{\"term\":\"javanese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06952208\", \"10239750\"]}");
	add("{\"term\":\"javanthropus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02476913\"]}");
	add("{\"term\":\"javelin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03599335\", \"07485560\"]}");
	add("{\"term\":\"javelina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02400396\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }