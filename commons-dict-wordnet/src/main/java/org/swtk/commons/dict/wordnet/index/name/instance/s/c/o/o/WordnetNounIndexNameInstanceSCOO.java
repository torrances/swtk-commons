package org.swtk.commons.dict.wordnet.index.name.instance.s.c.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scoop\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04156148\", \"04156273\", \"04260861\", \"06695928\", \"13916999\", \"13791457\"]}");
	add("{\"term\":\"scoopful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13791457\"]}");
	add("{\"term\":\"scooter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01856139\", \"03561991\", \"03796586\", \"04156439\", \"04569408\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }