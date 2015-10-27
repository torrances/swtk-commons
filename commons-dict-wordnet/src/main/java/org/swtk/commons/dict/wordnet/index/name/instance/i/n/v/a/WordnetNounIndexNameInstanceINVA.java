package org.swtk.commons.dict.wordnet.index.name.instance.i.n.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"invader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10233732\"]}");
	add("{\"term\":\"invagination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13523144\", \"14085814\"]}");
	add("{\"term\":\"invalid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10233900\"]}");
	add("{\"term\":\"invalidation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01243544\"]}");
	add("{\"term\":\"invalidator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10234060\"]}");
	add("{\"term\":\"invalidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14085972\"]}");
	add("{\"term\":\"invalidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04817762\"]}");
	add("{\"term\":\"invalidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04817762\"]}");
	add("{\"term\":\"invaluableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05148469\"]}");
	add("{\"term\":\"invar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14945552\"]}");
	add("{\"term\":\"invariability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04747172\", \"04776695\"]}");
	add("{\"term\":\"invariable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05867520\"]}");
	add("{\"term\":\"invariableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04747172\"]}");
	add("{\"term\":\"invariance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04746235\", \"04747172\"]}");
	add("{\"term\":\"invariant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05858959\"]}");
	add("{\"term\":\"invasion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07346913\", \"07444576\", \"00978617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }