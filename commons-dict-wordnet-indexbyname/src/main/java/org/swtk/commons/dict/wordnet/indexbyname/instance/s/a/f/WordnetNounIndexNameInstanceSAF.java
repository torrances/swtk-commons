package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"safaqis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09060747\"]}");
	add("{\"term\":\"safar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15242239\"]}");
	add("{\"term\":\"safari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00310732\"]}");
	add("{\"term\":\"safe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03092620\", \"04132217\", \"04132122\"]}");
	add("{\"term\":\"safebreaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565619\"]}");
	add("{\"term\":\"safecracker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565619\"]}");
	add("{\"term\":\"safeguard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06704012\", \"00824631\"]}");
	add("{\"term\":\"safehold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04132567\"]}");
	add("{\"term\":\"safekeeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00820127\"]}");
	add("{\"term\":\"safeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04863539\"]}");
	add("{\"term\":\"safety\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00189469\", \"03092620\", \"00131910\", \"03469399\", \"08661508\", \"14562074\"]}");
	add("{\"term\":\"safflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11966520\"]}");
	add("{\"term\":\"saffranine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15026067\"]}");
	add("{\"term\":\"saffron\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04973894\", \"07843260\", \"12437208\"]}");
	add("{\"term\":\"safranin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15026067\"]}");
	add("{\"term\":\"safranine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15026067\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }