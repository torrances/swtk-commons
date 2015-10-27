package org.swtk.commons.dict.wordnet.index.name.instance.l.y.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYSI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lysichiton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11809395\"]}");
	add("{\"term\":\"lysichitum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11809395\"]}");
	add("{\"term\":\"lysiloma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11783175\"]}");
	add("{\"term\":\"lysimachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12115303\"]}");
	add("{\"term\":\"lysimachus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11166183\"]}");
	add("{\"term\":\"lysin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15054213\"]}");
	add("{\"term\":\"lysine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14968320\"]}");
	add("{\"term\":\"lysinemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14186425\"]}");
	add("{\"term\":\"lysippus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11166397\"]}");
	add("{\"term\":\"lysis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13530731\", \"13531046\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }