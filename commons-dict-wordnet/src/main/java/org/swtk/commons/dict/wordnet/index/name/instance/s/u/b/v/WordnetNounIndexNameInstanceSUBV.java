package org.swtk.commons.dict.wordnet.index.name.instance.s.u.b.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUBV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"subvention\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01063127\", \"13288286\"]}");
	add("{\"term\":\"subversion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00216705\", \"00273292\"]}");
	add("{\"term\":\"subversive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10546909\"]}");
	add("{\"term\":\"subversiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04886853\"]}");
	add("{\"term\":\"subverter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10546909\"]}");
	add("{\"term\":\"subvocaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10690906\"]}");
	add("{\"term\":\"subvocalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10690906\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }