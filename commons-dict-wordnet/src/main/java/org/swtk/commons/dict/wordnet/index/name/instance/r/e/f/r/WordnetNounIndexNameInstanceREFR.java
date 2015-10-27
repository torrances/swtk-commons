package org.swtk.commons.dict.wordnet.index.name.instance.r.e.f.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREFR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"refraction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07425483\", \"11523705\"]}");
	add("{\"term\":\"refractiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05018752\"]}");
	add("{\"term\":\"refractivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05018752\"]}");
	add("{\"term\":\"refractometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04077527\"]}");
	add("{\"term\":\"refractoriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04914752\"]}");
	add("{\"term\":\"refractory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03409810\"]}");
	add("{\"term\":\"refrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07064217\"]}");
	add("{\"term\":\"refresher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00893530\", \"07930368\", \"13343365\"]}");
	add("{\"term\":\"refreshment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00402591\", \"07590069\"]}");
	add("{\"term\":\"refrigerant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15028364\"]}");
	add("{\"term\":\"refrigeration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00708597\", \"13569734\"]}");
	add("{\"term\":\"refrigerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04077839\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }