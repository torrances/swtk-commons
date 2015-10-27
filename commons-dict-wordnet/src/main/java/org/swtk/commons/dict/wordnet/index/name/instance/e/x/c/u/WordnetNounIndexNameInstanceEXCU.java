package org.swtk.commons.dict.wordnet.index.name.instance.e.x.c.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXCU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exculpation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01230180\", \"06754000\"]}");
	add("{\"term\":\"excursion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00311027\", \"00312635\"]}");
	add("{\"term\":\"excursionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616097\"]}");
	add("{\"term\":\"excursus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06613037\"]}");
	add("{\"term\":\"excuse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05829462\", \"06638953\", \"06754000\"]}");
	add("{\"term\":\"excuser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10418998\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }