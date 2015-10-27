package org.swtk.commons.dict.wordnet.index.name.instance.s.e.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seed\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05411679\", \"05843082\", \"10594907\", \"11704458\", \"13156591\"]}");
	add("{\"term\":\"seedbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04174183\"]}");
	add("{\"term\":\"seedcake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07650214\"]}");
	add("{\"term\":\"seedcase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13160826\"]}");
	add("{\"term\":\"seeder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04174289\", \"04174407\", \"10595038\"]}");
	add("{\"term\":\"seediness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04823992\"]}");
	add("{\"term\":\"seedling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573045\"]}");
	add("{\"term\":\"seedman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595149\"]}");
	add("{\"term\":\"seedpod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13159832\"]}");
	add("{\"term\":\"seedsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595149\"]}");
	add("{\"term\":\"seedtime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15263068\", \"15316652\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }