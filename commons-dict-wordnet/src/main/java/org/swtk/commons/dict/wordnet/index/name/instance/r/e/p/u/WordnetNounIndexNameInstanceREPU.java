package org.swtk.commons.dict.wordnet.index.name.instance.r.e.p.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREPU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"republic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08379844\", \"08378256\"]}");
	add("{\"term\":\"republican\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09430510\", \"10542088\", \"10542226\"]}");
	add("{\"term\":\"republicanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06230244\"]}");
	add("{\"term\":\"republication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01104479\", \"07273632\"]}");
	add("{\"term\":\"republishing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01104479\"]}");
	add("{\"term\":\"repudiation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00523394\", \"07220378\", \"07222070\"]}");
	add("{\"term\":\"repugnance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13880242\", \"07519226\"]}");
	add("{\"term\":\"repulse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07222660\"]}");
	add("{\"term\":\"repulsion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00963112\", \"07519226\", \"11447028\"]}");
	add("{\"term\":\"repulsiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04788613\"]}");
	add("{\"term\":\"repurchase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00080032\"]}");
	add("{\"term\":\"reputability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878197\"]}");
	add("{\"term\":\"reputation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06216934\", \"14462760\", \"14461591\"]}");
	add("{\"term\":\"repute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14461591\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }