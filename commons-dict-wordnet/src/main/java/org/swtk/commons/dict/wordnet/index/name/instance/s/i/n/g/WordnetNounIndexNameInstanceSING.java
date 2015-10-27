package org.swtk.commons.dict.wordnet.index.name.instance.s.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"singalong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01258235\"]}");
	add("{\"term\":\"singan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08747285\"]}");
	add("{\"term\":\"singapore\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09019680\", \"09019857\", \"09020171\"]}");
	add("{\"term\":\"singaporean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09768945\"]}");
	add("{\"term\":\"singe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14313444\"]}");
	add("{\"term\":\"singer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11322610\", \"11322767\", \"10619214\"]}");
	add("{\"term\":\"singhalese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06984401\", \"09751461\"]}");
	add("{\"term\":\"singing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06818155\", \"00546538\"]}");
	add("{\"term\":\"single\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13764713\", \"00133421\"]}");
	add("{\"term\":\"singleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04873152\", \"04874931\"]}");
	add("{\"term\":\"singles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00484324\", \"00484420\"]}");
	add("{\"term\":\"singlestick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04230245\"]}");
	add("{\"term\":\"singlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04230374\"]}");
	add("{\"term\":\"singleton\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04230510\", \"08001577\", \"13765120\"]}");
	add("{\"term\":\"singsong\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01258235\", \"07099119\"]}");
	add("{\"term\":\"singular\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06310906\"]}");
	add("{\"term\":\"singularity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04805614\", \"04770905\"]}");
	add("{\"term\":\"singultus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382864\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }