package org.swtk.commons.dict.wordnet.index.name.instance.i.l.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceILLU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"illuminance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05025708\"]}");
	add("{\"term\":\"illuminant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14711674\"]}");
	add("{\"term\":\"illumination\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03774932\", \"05025708\", \"07185857\", \"14006632\", \"14587365\"]}");
	add("{\"term\":\"illusion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00100771\", \"00756110\", \"05904666\", \"05948354\"]}");
	add("{\"term\":\"illusionist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10300371\", \"10776101\"]}");
	add("{\"term\":\"illustration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03566525\", \"05828980\", \"06893583\", \"07011893\"]}");
	add("{\"term\":\"illustrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09831473\"]}");
	add("{\"term\":\"illustriousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05177128\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }