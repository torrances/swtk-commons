package org.swtk.commons.dict.wordnet.index.name.instance.b.r.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01999549\", \"02532819\", \"09720360\"]}");
	add("{\"term\":\"britain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08879115\"]}");
	add("{\"term\":\"britches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02906120\"]}");
	add("{\"term\":\"brith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01033424\"]}");
	add("{\"term\":\"briticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07095665\"]}");
	add("{\"term\":\"british\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09751958\"]}");
	add("{\"term\":\"britisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09720360\"]}");
	add("{\"term\":\"britishism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00414687\", \"07095665\"]}");
	add("{\"term\":\"briton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09707762\", \"09720360\"]}");
	add("{\"term\":\"brits\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09751958\"]}");
	add("{\"term\":\"britt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01999549\", \"02532819\"]}");
	add("{\"term\":\"brittanic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06974139\"]}");
	add("{\"term\":\"brittany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08960981\"]}");
	add("{\"term\":\"britten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10884231\"]}");
	add("{\"term\":\"brittle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07615354\"]}");
	add("{\"term\":\"brittlebush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11984401\"]}");
	add("{\"term\":\"brittleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04946724\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }