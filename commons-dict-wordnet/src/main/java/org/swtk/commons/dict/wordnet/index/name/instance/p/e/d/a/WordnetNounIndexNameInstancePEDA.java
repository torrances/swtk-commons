package org.swtk.commons.dict.wordnet.index.name.instance.p.e.d.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEDA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pedagog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10065521\"]}");
	add("{\"term\":\"pedagogics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05668782\"]}");
	add("{\"term\":\"pedagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10065521\"]}");
	add("{\"term\":\"pedagogy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00884975\", \"00888759\", \"05668782\"]}");
	add("{\"term\":\"pedal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03909502\", \"06871724\"]}");
	add("{\"term\":\"pedaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10430908\"]}");
	add("{\"term\":\"pedaliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895189\"]}");
	add("{\"term\":\"pedaller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10430908\"]}");
	add("{\"term\":\"pedant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10431101\"]}");
	add("{\"term\":\"pedantry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06903178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }