package org.swtk.commons.dict.wordnet.index.name.instance.s.o.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"somebody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("{\"term\":\"someone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("{\"term\":\"somersault\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00440424\"]}");
	add("{\"term\":\"somersaulting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00440424\"]}");
	add("{\"term\":\"somerset\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00440424\", \"08903406\"]}");
	add("{\"term\":\"somesthesia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05667701\", \"05729127\"]}");
	add("{\"term\":\"somesthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05667701\"]}");
	add("{\"term\":\"somewhere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08506775\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }