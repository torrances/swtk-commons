package org.swtk.commons.dict.wordnet.index.name.instance.l.o.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"loaf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07665191\", \"07699531\"]}");
	add("{\"term\":\"loafer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03685681\", \"10217586\"]}");
	add("{\"term\":\"loafing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01067365\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }