package org.swtk.commons.dict.wordnet.indexbyname.instance.o.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ocher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14868156\", \"04974018\"]}");
	add("{\"term\":\"ochlocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08379229\"]}");
	add("{\"term\":\"ochna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12403216\"]}");
	add("{\"term\":\"ochna family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12403001\"]}");
	add("{\"term\":\"ochna serrulata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12403392\"]}");
	add("{\"term\":\"ochnaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12403001\"]}");
	add("{\"term\":\"ochoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11231686\"]}");
	add("{\"term\":\"ochotona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02331314\"]}");
	add("{\"term\":\"ochotona collaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02331594\"]}");
	add("{\"term\":\"ochotona princeps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02331472\"]}");
	add("{\"term\":\"ochotonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02330922\"]}");
	add("{\"term\":\"ochre\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04974018\", \"14868156\"]}");
	add("{\"term\":\"ochroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12211978\"]}");
	add("{\"term\":\"ochroma lagopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12212104\"]}");
	add("{\"term\":\"ochronosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14291941\"]}");
	add("{\"term\":\"ochs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11231860\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }