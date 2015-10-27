package org.swtk.commons.dict.wordnet.index.name.instance.p.e.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePERO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"perodicticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02501809\"]}");
	add("{\"term\":\"perognathus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02351692\"]}");
	add("{\"term\":\"peromyscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02339103\"]}");
	add("{\"term\":\"peron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11250011\"]}");
	add("{\"term\":\"peroneus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05583591\"]}");
	add("{\"term\":\"peronospora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13001412\"]}");
	add("{\"term\":\"peronosporaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13001238\"]}");
	add("{\"term\":\"peronosporales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13000991\"]}");
	add("{\"term\":\"peroration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06410769\", \"07256383\"]}");
	add("{\"term\":\"peroxidase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15004289\"]}");
	add("{\"term\":\"peroxide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15004646\", \"14805384\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }