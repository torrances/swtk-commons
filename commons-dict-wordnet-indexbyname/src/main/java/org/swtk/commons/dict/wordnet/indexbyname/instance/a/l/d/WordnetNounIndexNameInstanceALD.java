package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aldactone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14778371\"]}");
	add("{\"term\":\"aldebaran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09215340\"]}");
	add("{\"term\":\"aldehyde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14608945\"]}");
	add("{\"term\":\"alder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12304779\", \"12305182\"]}");
	add("{\"term\":\"alderfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02269516\"]}");
	add("{\"term\":\"alderman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09801838\"]}");
	add("{\"term\":\"aldohexose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14734662\"]}");
	add("{\"term\":\"aldol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14735960\"]}");
	add("{\"term\":\"aldomet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03761520\"]}");
	add("{\"term\":\"aldose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14734823\"]}");
	add("{\"term\":\"aldosterone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776690\"]}");
	add("{\"term\":\"aldosteronism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14140799\"]}");
	add("{\"term\":\"aldrovanda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12803933\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }