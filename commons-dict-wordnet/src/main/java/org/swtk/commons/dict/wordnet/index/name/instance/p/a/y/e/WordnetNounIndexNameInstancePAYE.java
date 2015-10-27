package org.swtk.commons.dict.wordnet.index.name.instance.p.a.y.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAYE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"paye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13332595\"]}");
	add("{\"term\":\"payee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10429379\"]}");
	add("{\"term\":\"payena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12795985\"]}");
	add("{\"term\":\"payer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10429497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }