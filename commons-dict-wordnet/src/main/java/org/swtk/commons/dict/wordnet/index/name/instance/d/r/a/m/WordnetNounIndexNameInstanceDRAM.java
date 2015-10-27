package org.swtk.commons.dict.wordnet.index.name.instance.d.r.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dram\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13721547\", \"13741913\", \"13744445\"]}");
	add("{\"term\":\"drama\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04634062\", \"06387777\", \"07305001\", \"07021061\"]}");
	add("{\"term\":\"dramamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03203635\"]}");
	add("{\"term\":\"dramatics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07019235\", \"00888134\"]}");
	add("{\"term\":\"dramatisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00900990\", \"00932683\"]}");
	add("{\"term\":\"dramatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10050002\"]}");
	add("{\"term\":\"dramatization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00900990\", \"00932683\"]}");
	add("{\"term\":\"dramaturgy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07019235\"]}");
	add("{\"term\":\"drambuie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07925833\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }