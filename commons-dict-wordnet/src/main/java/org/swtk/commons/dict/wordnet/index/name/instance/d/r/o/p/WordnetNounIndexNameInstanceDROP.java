package org.swtk.commons.dict.wordnet.index.name.instance.d.r.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDROP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"drop\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00328192\", \"03250755\", \"03251157\", \"07376986\", \"08601320\", \"09269370\", \"05119135\", \"13793544\", \"13924278\"]}");
	add("{\"term\":\"dropkick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00138697\"]}");
	add("{\"term\":\"dropkicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10055380\"]}");
	add("{\"term\":\"droplet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13793968\"]}");
	add("{\"term\":\"dropline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06356936\"]}");
	add("{\"term\":\"dropout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10015577\", \"10015463\"]}");
	add("{\"term\":\"dropper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03251786\"]}");
	add("{\"term\":\"droppings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878998\"]}");
	add("{\"term\":\"dropseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12160875\"]}");
	add("{\"term\":\"dropsy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14340141\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }