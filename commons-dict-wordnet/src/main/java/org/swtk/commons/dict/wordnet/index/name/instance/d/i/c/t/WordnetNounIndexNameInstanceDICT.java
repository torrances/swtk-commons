package org.swtk.commons.dict.wordnet.index.name.instance.d.i.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDICT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dictamnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12733248\"]}");
	add("{\"term\":\"dictaphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03197227\"]}");
	add("{\"term\":\"dictate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05879867\", \"06676685\"]}");
	add("{\"term\":\"dictation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06398975\", \"07175286\", \"07182782\"]}");
	add("{\"term\":\"dictator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09843537\", \"10031556\", \"10031898\"]}");
	add("{\"term\":\"dictatorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08457622\"]}");
	add("{\"term\":\"diction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07095931\", \"07147123\"]}");
	add("{\"term\":\"dictionary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06430544\"]}");
	add("{\"term\":\"dictostylium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12997314\"]}");
	add("{\"term\":\"dictum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06778678\", \"06740365\"]}");
	add("{\"term\":\"dictyophera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13061731\"]}");
	add("{\"term\":\"dictyoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02235258\"]}");
	add("{\"term\":\"dictyosome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05442133\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }