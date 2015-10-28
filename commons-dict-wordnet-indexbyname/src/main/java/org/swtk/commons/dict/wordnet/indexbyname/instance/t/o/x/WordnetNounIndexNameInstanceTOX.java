package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toxaemia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14214389\", \"14214519\"]}");
	add("{\"term\":\"toxemia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14214389\", \"14214519\"]}");
	add("{\"term\":\"toxicant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15056943\"]}");
	add("{\"term\":\"toxicity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798152\", \"13604681\"]}");
	add("{\"term\":\"toxicodendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12787001\"]}");
	add("{\"term\":\"toxicognath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01787733\"]}");
	add("{\"term\":\"toxicologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10739456\"]}");
	add("{\"term\":\"toxicology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06074012\"]}");
	add("{\"term\":\"toxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15058641\"]}");
	add("{\"term\":\"toxoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15059021\"]}");
	add("{\"term\":\"toxoplasmosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14209528\"]}");
	add("{\"term\":\"toxostoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01590354\"]}");
	add("{\"term\":\"toxotes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02623073\"]}");
	add("{\"term\":\"toxotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02622948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }