package org.swtk.commons.dict.wordnet.index.name.instance.e.n.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"entablature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03295106\"]}");
	add("{\"term\":\"entail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00050729\", \"13309965\"]}");
	add("{\"term\":\"entailment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05788882\"]}");
	add("{\"term\":\"entandrophragma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12718643\"]}");
	add("{\"term\":\"entanglement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04575843\"]}");
	add("{\"term\":\"entasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13887163\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }