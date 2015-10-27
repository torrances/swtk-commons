package org.swtk.commons.dict.wordnet.index.name.instance.s.w.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSWAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"swat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00135211\"]}");
	add("{\"term\":\"swatch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376036\"]}");
	add("{\"term\":\"swath\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09475783\", \"13801119\"]}");
	add("{\"term\":\"swathe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376112\"]}");
	add("{\"term\":\"swathing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376233\"]}");
	add("{\"term\":\"swatter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376369\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }