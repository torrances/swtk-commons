package org.swtk.commons.dict.wordnet.index.name.instance.t.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tamal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07895635\"]}");
	add("{\"term\":\"tamale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07895635\", \"08966585\"]}");
	add("{\"term\":\"tamandu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02463759\"]}");
	add("{\"term\":\"tamandua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02463759\"]}");
	add("{\"term\":\"tamanoir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02463082\"]}");
	add("{\"term\":\"tamarack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11639678\"]}");
	add("{\"term\":\"tamarao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02411848\"]}");
	add("{\"term\":\"tamarau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02411848\"]}");
	add("{\"term\":\"tamaricaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12406556\"]}");
	add("{\"term\":\"tamarillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12923774\"]}");
	add("{\"term\":\"tamarin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493738\"]}");
	add("{\"term\":\"tamarind\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07780606\", \"12521707\"]}");
	add("{\"term\":\"tamarindo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07780606\", \"12521707\"]}");
	add("{\"term\":\"tamarindus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12521540\"]}");
	add("{\"term\":\"tamarisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12406979\"]}");
	add("{\"term\":\"tamarix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12406780\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }