package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"salt\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05725289\", \"07164290\", \"07829083\", \"15035270\"]}");
	add("{\"term\":\"saltation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00121022\", \"00429255\", \"07373585\", \"07441332\", \"13573847\"]}");
	add("{\"term\":\"saltbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04138451\"]}");
	add("{\"term\":\"saltbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851375\"]}");
	add("{\"term\":\"saltcellar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04138582\"]}");
	add("{\"term\":\"salter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10568619\", \"10568722\"]}");
	add("{\"term\":\"saltine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07710932\"]}");
	add("{\"term\":\"saltiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05000591\", \"05725289\", \"07086878\"]}");
	add("{\"term\":\"salting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00249401\"]}");
	add("{\"term\":\"saltire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04309736\"]}");
	add("{\"term\":\"saltpan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09443909\"]}");
	add("{\"term\":\"saltpeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14885506\"]}");
	add("{\"term\":\"saltpetre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14885506\"]}");
	add("{\"term\":\"saltshaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04138773\"]}");
	add("{\"term\":\"saltwater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15033414\"]}");
	add("{\"term\":\"saltworks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04138894\"]}");
	add("{\"term\":\"saltwort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11848010\", \"11855123\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }