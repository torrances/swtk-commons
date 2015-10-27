package org.swtk.commons.dict.wordnet.index.name.instance.s.u.n.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUNR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sunray\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11542639\", \"11984915\", \"11505982\"]}");
	add("{\"term\":\"sunrise\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07358510\", \"11538089\", \"15193837\"]}");
	add("{\"term\":\"sunroof\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04364208\"]}");
	add("{\"term\":\"sunroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04364012\"]}");
	add("{\"term\":\"sunrose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12396035\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }