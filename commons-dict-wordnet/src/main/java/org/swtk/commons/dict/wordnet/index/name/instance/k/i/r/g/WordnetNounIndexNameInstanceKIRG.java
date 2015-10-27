package org.swtk.commons.dict.wordnet.index.name.instance.k.i.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIRG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kirghiz\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06940513\", \"09042810\", \"09755744\"]}");
	add("{\"term\":\"kirghizia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirghizstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirgiz\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06940513\", \"09042810\", \"09755744\"]}");
	add("{\"term\":\"kirgizia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirgizstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }