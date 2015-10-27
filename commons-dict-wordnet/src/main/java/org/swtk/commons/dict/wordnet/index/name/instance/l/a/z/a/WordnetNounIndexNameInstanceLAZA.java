package org.swtk.commons.dict.wordnet.index.name.instance.l.a.z.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAZA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lazar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10274367\"]}");
	add("{\"term\":\"lazaret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"lazarette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"lazaretto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03445800\", \"03656129\"]}");
	add("{\"term\":\"lazarus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10270699\", \"10270822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }