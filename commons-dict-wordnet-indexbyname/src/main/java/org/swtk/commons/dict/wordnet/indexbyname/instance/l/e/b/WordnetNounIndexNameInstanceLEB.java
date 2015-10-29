package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lebanese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09739991\"]}");
	add("{\"term\":\"lebanese hizballah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08040127\"]}");
	add("{\"term\":\"lebanese monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13716930\"]}");
	add("{\"term\":\"lebanese pound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13717041\"]}");
	add("{\"term\":\"lebanese republic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977154\"]}");
	add("{\"term\":\"lebanon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977154\"]}");
	add("{\"term\":\"lebensraum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13800742\"]}");
	add("{\"term\":\"lebistes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01451137\"]}");
	add("{\"term\":\"lebistes reticulatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01451235\"]}");
	add("{\"term\":\"leboyer method\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13528109\"]}");
	add("{\"term\":\"leboyer method of childbirth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13528109\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }