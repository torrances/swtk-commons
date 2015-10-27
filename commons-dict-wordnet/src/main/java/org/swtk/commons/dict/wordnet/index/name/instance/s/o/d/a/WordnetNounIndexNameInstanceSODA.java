package org.swtk.commons.dict.wordnet.index.name.instance.s.o.d.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSODA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07943752\", \"15069411\"]}");
	add("{\"term\":\"sodalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10640762\"]}");
	add("{\"term\":\"sodalite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15069215\"]}");
	add("{\"term\":\"sodality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08092224\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }