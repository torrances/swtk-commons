package org.swtk.commons.dict.wordnet.index.name.instance.p.h.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13736088\"]}");
	add("{\"term\":\"phonation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07125323\"]}");
	add("{\"term\":\"phone\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03266479\", \"07125755\", \"04408223\"]}");
	add("{\"term\":\"phonebook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06435397\"]}");
	add("{\"term\":\"phoneme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07126419\"]}");
	add("{\"term\":\"phonemics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06187166\"]}");
	add("{\"term\":\"phoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09907469\"]}");
	add("{\"term\":\"phonetician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10446218\"]}");
	add("{\"term\":\"phonetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06186749\"]}");
	add("{\"term\":\"phoney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10215212\"]}");
	add("{\"term\":\"phonics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00890087\"]}");
	add("{\"term\":\"phonogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06834773\"]}");
	add("{\"term\":\"phonograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04071513\"]}");
	add("{\"term\":\"phonologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10446394\"]}");
	add("{\"term\":\"phonology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06187166\"]}");
	add("{\"term\":\"phonophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407632\"]}");
	add("{\"term\":\"phony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10215212\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }