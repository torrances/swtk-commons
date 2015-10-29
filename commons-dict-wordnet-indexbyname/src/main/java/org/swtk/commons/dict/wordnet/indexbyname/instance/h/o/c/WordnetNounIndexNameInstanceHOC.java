package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ho chi minh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11073339\"]}");
	add("{\"term\":\"ho chi minh city\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09187034\"]}");
	add("{\"term\":\"hock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02465836\", \"07913175\"]}");
	add("{\"term\":\"hockey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00464604\", \"00469063\"]}");
	add("{\"term\":\"hockey clinic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07161688\"]}");
	add("{\"term\":\"hockey coach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198838\"]}");
	add("{\"term\":\"hockey game\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00464604\"]}");
	add("{\"term\":\"hockey league\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08249524\"]}");
	add("{\"term\":\"hockey player\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198922\"]}");
	add("{\"term\":\"hockey puck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04025935\"]}");
	add("{\"term\":\"hockey season\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15265891\"]}");
	add("{\"term\":\"hockey skate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03529150\"]}");
	add("{\"term\":\"hockey stick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03529313\"]}");
	add("{\"term\":\"hockey team\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08097263\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }