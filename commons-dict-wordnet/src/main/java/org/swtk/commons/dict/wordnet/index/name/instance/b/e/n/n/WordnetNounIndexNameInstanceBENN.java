package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBENN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"benne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895543\"]}");
	add("{\"term\":\"bennet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12652574\", \"12653494\"]}");
	add("{\"term\":\"bennett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10864844\"]}");
	add("{\"term\":\"bennettitaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11624844\"]}");
	add("{\"term\":\"bennettitales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11624676\"]}");
	add("{\"term\":\"bennettitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11625027\"]}");
	add("{\"term\":\"benni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895543\"]}");
	add("{\"term\":\"bennie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02833780\"]}");
	add("{\"term\":\"bennington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09171171\"]}");
	add("{\"term\":\"benniseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07843386\"]}");
	add("{\"term\":\"benny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10865020\", \"12895543\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }