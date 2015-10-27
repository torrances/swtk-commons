package org.swtk.commons.dict.wordnet.index.name.instance.s.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11820489\"]}");
	add("{\"term\":\"sangapenum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15043834\"]}");
	add("{\"term\":\"sangaree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07933210\"]}");
	add("{\"term\":\"sangay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09200000\"]}");
	add("{\"term\":\"sanger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11300395\", \"11300643\"]}");
	add("{\"term\":\"sango\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06918804\"]}");
	add("{\"term\":\"sangoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10569926\"]}");
	add("{\"term\":\"sangraal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03456853\"]}");
	add("{\"term\":\"sangria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07933210\"]}");
	add("{\"term\":\"sanguification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13513656\"]}");
	add("{\"term\":\"sanguinaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11928408\"]}");
	add("{\"term\":\"sanguine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04970288\"]}");
	add("{\"term\":\"sanguineness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07557148\"]}");
	add("{\"term\":\"sanguinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07557148\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }