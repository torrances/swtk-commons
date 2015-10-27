package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePREF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prefab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04005422\"]}");
	add("{\"term\":\"prefabrication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00928283\"]}");
	add("{\"term\":\"preface\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06409546\"]}");
	add("{\"term\":\"prefect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10484694\"]}");
	add("{\"term\":\"prefecture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00597611\", \"08644522\"]}");
	add("{\"term\":\"preference\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05165478\", \"05799460\", \"06210079\", \"07513449\"]}");
	add("{\"term\":\"preferment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07252307\", \"00199480\"]}");
	add("{\"term\":\"prefiguration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05784012\", \"05947827\"]}");
	add("{\"term\":\"prefix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06319294\"]}");
	add("{\"term\":\"prefixation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00929660\"]}");
	add("{\"term\":\"preformation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06001834\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }