package org.swtk.commons.dict.wordnet.index.name.instance.i.n.f.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINFA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"infallibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04812364\"]}");
	add("{\"term\":\"infamy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14462478\", \"14464696\"]}");
	add("{\"term\":\"infancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14450643\", \"15170546\"]}");
	add("{\"term\":\"infant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09846929\"]}");
	add("{\"term\":\"infanticide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01253079\", \"10224452\"]}");
	add("{\"term\":\"infantilism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00740170\", \"14531389\"]}");
	add("{\"term\":\"infantry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08407114\"]}");
	add("{\"term\":\"infantryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10224540\"]}");
	add("{\"term\":\"infarct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14231043\"]}");
	add("{\"term\":\"infarction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14231043\"]}");
	add("{\"term\":\"infatuation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05821211\", \"07559739\", \"07496224\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }