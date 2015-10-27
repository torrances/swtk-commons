package org.swtk.commons.dict.wordnet.index.name.instance.e.p.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ephedra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11619137\"]}");
	add("{\"term\":\"ephedraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11618375\"]}");
	add("{\"term\":\"ephedrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737648\"]}");
	add("{\"term\":\"ephemera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15272221\"]}");
	add("{\"term\":\"ephemeral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02163730\"]}");
	add("{\"term\":\"ephemerality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05062840\"]}");
	add("{\"term\":\"ephemeralness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05062840\"]}");
	add("{\"term\":\"ephemerid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264830\"]}");
	add("{\"term\":\"ephemerida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264535\"]}");
	add("{\"term\":\"ephemeridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264976\"]}");
	add("{\"term\":\"ephemeris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06438535\"]}");
	add("{\"term\":\"ephemeron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02163730\"]}");
	add("{\"term\":\"ephemeroptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264535\"]}");
	add("{\"term\":\"ephemeropteran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264830\"]}");
	add("{\"term\":\"ephesian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081362\"]}");
	add("{\"term\":\"ephesians\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06455818\"]}");
	add("{\"term\":\"ephestia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02292805\"]}");
	add("{\"term\":\"ephesus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08330913\", \"08806178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }