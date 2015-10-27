package org.swtk.commons.dict.wordnet.index.name.instance.v.i.b.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVIBR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vibraharp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04540126\"]}");
	add("{\"term\":\"vibramycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03234950\"]}");
	add("{\"term\":\"vibrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04996893\"]}");
	add("{\"term\":\"vibraphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04540126\"]}");
	add("{\"term\":\"vibraphonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10769596\"]}");
	add("{\"term\":\"vibration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04735141\", \"07359766\", \"14028057\", \"00346752\"]}");
	add("{\"term\":\"vibrato\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07413737\"]}");
	add("{\"term\":\"vibrator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04540337\", \"04540494\"]}");
	add("{\"term\":\"vibrio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01366803\"]}");
	add("{\"term\":\"vibrion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01366803\"]}");
	add("{\"term\":\"vibrissa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01904469\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }