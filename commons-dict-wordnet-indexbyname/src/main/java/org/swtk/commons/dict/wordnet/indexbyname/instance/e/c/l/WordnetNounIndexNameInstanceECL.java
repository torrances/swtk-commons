package org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eclair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07644300\"]}");
	add("{\"term\":\"eclampsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14214766\"]}");
	add("{\"term\":\"eclat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04822103\", \"04822233\", \"06704429\"]}");
	add("{\"term\":\"eclectic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10062832\"]}");
	add("{\"term\":\"eclectic method\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05796718\"]}");
	add("{\"term\":\"eclecticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05796718\"]}");
	add("{\"term\":\"eclecticist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10062832\"]}");
	add("{\"term\":\"eclipse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07383246\"]}");
	add("{\"term\":\"eclipsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13494919\"]}");
	add("{\"term\":\"ecliptic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08582743\"]}");
	add("{\"term\":\"eclogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06391062\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }