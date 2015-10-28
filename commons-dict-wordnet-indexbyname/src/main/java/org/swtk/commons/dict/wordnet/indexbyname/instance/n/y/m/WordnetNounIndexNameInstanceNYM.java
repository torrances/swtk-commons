package org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nymph\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10388227\", \"02314269\", \"09571761\"]}");
	add("{\"term\":\"nymphaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11735676\"]}");
	add("{\"term\":\"nymphaeaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11735087\"]}");
	add("{\"term\":\"nymphalid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02277474\"]}");
	add("{\"term\":\"nymphalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02277168\"]}");
	add("{\"term\":\"nymphalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02278024\"]}");
	add("{\"term\":\"nymphet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388323\"]}");
	add("{\"term\":\"nymphicus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01822241\"]}");
	add("{\"term\":\"nympho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388497\"]}");
	add("{\"term\":\"nympholepsy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14114500\"]}");
	add("{\"term\":\"nympholept\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388410\"]}");
	add("{\"term\":\"nymphomania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505065\"]}");
	add("{\"term\":\"nymphomaniac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }