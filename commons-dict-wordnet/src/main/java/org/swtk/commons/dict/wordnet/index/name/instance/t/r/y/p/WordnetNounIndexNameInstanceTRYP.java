package org.swtk.commons.dict.wordnet.index.name.instance.t.r.y.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRYP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trypetidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02199194\"]}");
	add("{\"term\":\"trypsin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105619\"]}");
	add("{\"term\":\"trypsinogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105788\"]}");
	add("{\"term\":\"tryptophan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105984\"]}");
	add("{\"term\":\"tryptophane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105984\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }