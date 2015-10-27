package org.swtk.commons.dict.wordnet.index.name.instance.s.p.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spondee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110441\"]}");
	add("{\"term\":\"spondias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12786439\"]}");
	add("{\"term\":\"spondylarthritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14212547\"]}");
	add("{\"term\":\"spondylitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379306\"]}");
	add("{\"term\":\"spondylolisthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14318019\"]}");
	add("{\"term\":\"sponge\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01909390\", \"10272371\", \"10521038\", \"14621938\"]}");
	add("{\"term\":\"spongefly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270478\"]}");
	add("{\"term\":\"sponger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10272371\", \"10658211\"]}");
	add("{\"term\":\"spongillafly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270478\"]}");
	add("{\"term\":\"sponginess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04945651\", \"04947556\"]}");
	add("{\"term\":\"spongioblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05249582\"]}");
	add("{\"term\":\"spongioblastoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14260354\"]}");
	add("{\"term\":\"sponsor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10485764\", \"10427699\"]}");
	add("{\"term\":\"sponsorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01217526\"]}");
	add("{\"term\":\"spontaneity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04793991\"]}");
	add("{\"term\":\"spontaneousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04793991\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }