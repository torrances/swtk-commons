package org.swtk.commons.dict.wordnet.index.name.instance.q.u.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceQUAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"quandang\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07785282\", \"12757363\"]}");
	add("{\"term\":\"quandary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05693891\", \"14432050\"]}");
	add("{\"term\":\"quandong\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07785282\", \"12213394\", \"12213851\", \"12757363\"]}");
	add("{\"term\":\"quango\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08067236\"]}");
	add("{\"term\":\"quantic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05871197\"]}");
	add("{\"term\":\"quantifiability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05217090\"]}");
	add("{\"term\":\"quantification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01005512\", \"06175339\"]}");
	add("{\"term\":\"quantifier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06313371\", \"06313532\"]}");
	add("{\"term\":\"quantisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00390116\"]}");
	add("{\"term\":\"quantity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05863690\", \"05116040\", \"00033914\"]}");
	add("{\"term\":\"quantization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00390116\"]}");
	add("{\"term\":\"quantong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07785282\"]}");
	add("{\"term\":\"quantum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05864101\", \"05864332\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }