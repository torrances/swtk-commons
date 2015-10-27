package org.swtk.commons.dict.wordnet.index.name.instance.b.r.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brig\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02904563\", \"02904681\"]}");
	add("{\"term\":\"brigade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08230899\"]}");
	add("{\"term\":\"brigadier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09895006\"]}");
	add("{\"term\":\"brigand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856476\"]}");
	add("{\"term\":\"brigandine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02904785\"]}");
	add("{\"term\":\"brigantine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02904924\"]}");
	add("{\"term\":\"brightness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05025269\", \"05628738\", \"04959419\"]}");
	add("{\"term\":\"brighton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08898760\"]}");
	add("{\"term\":\"brigid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10883800\"]}");
	add("{\"term\":\"brigit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531606\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }